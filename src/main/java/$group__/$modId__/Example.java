package $group__.$modId__;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

// TODO Write your mod.
@SuppressWarnings("unused")
@Mod(modid = "${modId}",
		name = "${name}",
		version = "${version}",
		dependencies = "${dependencies}",
		useMetadata = true,
		acceptedMinecraftVersions = "${minecraftVersionRange}",
		certificateFingerprint = "${certificateFingerprint}",
		updateJSON = "${updateJSON}")
public class Example {
	@Mod.EventHandler
	public void preInitialize(FMLPreInitializationEvent event) { System.out.println("Hello, world!"); }
}
