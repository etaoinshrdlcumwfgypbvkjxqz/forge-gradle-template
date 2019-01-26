package com.etaoinshrdlcumwfgypbvkjxqz.games.mods.minecraft.eventstruck;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.network.NetworkCheckHandler;
import net.minecraftforge.fml.relauncher.Side;

import java.util.Map;

@Mod(modid = "${modid}", useMetadata = true, canBeDeactivated = true, acceptedMinecraftVersions = "${mcversion}", certificateFingerprint = "${certificateFingerprint}")
public class Eventstruck {
    @SuppressWarnings("unused")
    @NetworkCheckHandler
    public void checkRemote(Map<String,String> mods, Side from) {

    }
}
