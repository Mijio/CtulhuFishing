package net.mcreator.cthulhufishing.block.display;

import net.minecraftforge.common.property.Properties;

public class AltarRelic5DisplayItem extends BlockItem implements IAnimatable {
	public AnimationFactory factory = GeckoLibUtil.createFactory(this);

	public AltarRelic5DisplayItem(Block block, Properties settings) {
		super(block, settings);
	}

	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
		return PlayState.CONTINUE;
	}

	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer) {
		super.initializeClient(consumer);
		consumer.accept(new IClientItemExtensions() {
			private final BlockEntityWithoutLevelRenderer renderer = new AltarRelic5DisplayItemRenderer();

			@Override
			public BlockEntityWithoutLevelRenderer getCustomRenderer() {
				return renderer;
			}
		});
	}

	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
	}

	@Override
	public AnimationFactory getFactory() {
		return this.factory;
	}
}