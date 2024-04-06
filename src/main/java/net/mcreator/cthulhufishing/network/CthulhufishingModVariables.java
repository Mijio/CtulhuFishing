package net.mcreator.cthulhufishing.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.cthulhufishing.CthulhufishingMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CthulhufishingModVariables {
	public static AttributeModifier Summon_Damage_GNB = null;
	public static AttributeModifier Summon_Count_PGR = null;
	public static AttributeModifier Summon_Count_GGR = null;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		CthulhufishingMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.Revelation_Score = original.Revelation_Score;
			clone.AltarFishCount = original.AltarFishCount;
			clone.Altar_Recipe = original.Altar_Recipe;
			clone.ButtonVis = original.ButtonVis;
			clone.Revalation_Change = original.Revalation_Change;
			clone.RC_IsNegative = original.RC_IsNegative;
			clone.Madness = original.Madness;
			clone.PlayerHasRelicSpawned = original.PlayerHasRelicSpawned;
			clone.RelicTimer = original.RelicTimer;
			if (!event.isWasDeath()) {
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("cthulhufishing", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double Revelation_Score = 0;
		public double AltarFishCount = 0;
		public double Altar_Recipe = 0;
		public boolean ButtonVis = false;
		public double Revalation_Change = 0;
		public boolean RC_IsNegative = false;
		public boolean Madness = false;
		public boolean PlayerHasRelicSpawned = false;
		public double RelicTimer = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				CthulhufishingMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("Revelation_Score", Revelation_Score);
			nbt.putDouble("AltarFishCount", AltarFishCount);
			nbt.putDouble("Altar_Recipe", Altar_Recipe);
			nbt.putBoolean("ButtonVis", ButtonVis);
			nbt.putDouble("Revalation_Change", Revalation_Change);
			nbt.putBoolean("RC_IsNegative", RC_IsNegative);
			nbt.putBoolean("Madness", Madness);
			nbt.putBoolean("PlayerHasRelicSpawned", PlayerHasRelicSpawned);
			nbt.putDouble("RelicTimer", RelicTimer);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			Revelation_Score = nbt.getDouble("Revelation_Score");
			AltarFishCount = nbt.getDouble("AltarFishCount");
			Altar_Recipe = nbt.getDouble("Altar_Recipe");
			ButtonVis = nbt.getBoolean("ButtonVis");
			Revalation_Change = nbt.getDouble("Revalation_Change");
			RC_IsNegative = nbt.getBoolean("RC_IsNegative");
			Madness = nbt.getBoolean("Madness");
			PlayerHasRelicSpawned = nbt.getBoolean("PlayerHasRelicSpawned");
			RelicTimer = nbt.getDouble("RelicTimer");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.Revelation_Score = message.data.Revelation_Score;
					variables.AltarFishCount = message.data.AltarFishCount;
					variables.Altar_Recipe = message.data.Altar_Recipe;
					variables.ButtonVis = message.data.ButtonVis;
					variables.Revalation_Change = message.data.Revalation_Change;
					variables.RC_IsNegative = message.data.RC_IsNegative;
					variables.Madness = message.data.Madness;
					variables.PlayerHasRelicSpawned = message.data.PlayerHasRelicSpawned;
					variables.RelicTimer = message.data.RelicTimer;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
