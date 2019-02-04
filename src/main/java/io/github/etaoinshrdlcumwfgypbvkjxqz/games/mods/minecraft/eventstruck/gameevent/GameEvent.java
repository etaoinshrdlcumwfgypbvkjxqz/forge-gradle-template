package io.github.etaoinshrdlcumwfgypbvkjxqz.games.mods.minecraft.eventstruck.gameevent;

import io.github.etaoinshrdlcumwfgypbvkjxqz.games.mods.minecraft.eventstruck.Eventstruck;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistryEntry.Impl;

public class GameEvent extends Impl<GameEvent> {
    public static final ResourceLocation NAME = new ResourceLocation(Eventstruck.MOD_ID, "events");
    public static final int MIN_ID = 0;
    public static final int MAX_ID = Integer.MAX_VALUE - 1;
}
