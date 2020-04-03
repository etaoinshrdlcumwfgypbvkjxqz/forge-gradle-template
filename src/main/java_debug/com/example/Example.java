package com.example;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

// TODO Write your mod.
@SuppressWarnings("unused")
@Mod(modid = "example",
        name = "Example",
        version = "1.12.2-0.0.1.0",
        dependencies = "",
        useMetadata = true,
        acceptedMinecraftVersions = "[1.11,1.12.2]",
        certificateFingerprint = "",
        updateJSON = "")
public class Example {
    @Mod.EventHandler
    public void preInitialize(FMLPreInitializationEvent event) {
        System.out.println("Hello, world!");
    }
}
