package $group__.$modId__;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

// TODO Write your mod.
@Mod("${modId}")
@Mod.EventBusSubscriber
public class Example {
	@SuppressWarnings("unused")
	public void setupCommon(@SuppressWarnings("unused") FMLCommonSetupEvent event) { System.out.println("Hello, world!"); }
}
