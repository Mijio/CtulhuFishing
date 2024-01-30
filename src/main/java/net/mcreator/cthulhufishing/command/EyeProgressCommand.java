
package net.mcreator.cthulhufishing.command;

@Mod.EventBusSubscriber
public class EyeProgressCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(Commands.literal("eyeprogress").requires(s -> s.hasPermission(1)).then(Commands.argument("eyeprogress", MessageArgument.message()).then(Commands.argument("eye", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();

					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();

					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					Direction direction = entity.getDirection();

					EyeProgressSetProcedure.execute();
					return 0;
				}))));
	}

}
