package com.example;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

// TODO Write your mod.
@Mod(ExpandableConstants.MOD_ID)
public class Example {
	@SuppressWarnings("ThisEscapedInObjectConstruction")
	public Example() { Bus.MOD.bus().get().register(this); }

	@SubscribeEvent
	protected void setupCommon(@SuppressWarnings("unused") FMLCommonSetupEvent event) { System.out.println("Hello, world!"); }
}
