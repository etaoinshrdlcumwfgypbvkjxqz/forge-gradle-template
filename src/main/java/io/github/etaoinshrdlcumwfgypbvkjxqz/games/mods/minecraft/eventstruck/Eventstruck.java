package io.github.etaoinshrdlcumwfgypbvkjxqz.games.mods.minecraft.eventstruck;

import io.github.etaoinshrdlcumwfgypbvkjxqz.games.mods.minecraft.eventstruck.gameevent.GameEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.RegistryBuilder;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.Properties;

import static java.util.Objects.*;

@Mod(modid = Eventstruck.MOD_ID, useMetadata = true, canBeDeactivated = true, acceptedMinecraftVersions = "${minecraftVersionRange}", acceptableRemoteVersions = "${minecraftVersionRange}", acceptableSaveVersions = "${minecraftVersionRange}", certificateFingerprint = "${certificateFingerprint}")
public class Eventstruck {
    public static final String MOD_ID = "${modId}";

    private static Eventstruck INSTANCE;

    private Logger logger;
    private File suggestedConfigurationFile;
    private Properties versionProperties;
    private ModMetadata modMetadata;
    private static BuildType buildType;

    private Eventstruck() {
        INSTANCE = this;
    }

    @SubscribeEvent
    public void preInitialize(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        suggestedConfigurationFile = event.getSuggestedConfigurationFile();
        versionProperties = event.getVersionProperties();
        modMetadata = event.getModMetadata();

        buildType = BuildType.valueOf(versionProperties.getProperty("buildType"));
    }
    @SubscribeEvent
    public void createNewRegistry(RegistryEvent.NewRegistry event) {
        new RegistryBuilder<GameEvent>().setName(GameEvent.NAME).setType(GameEvent.class).setIDRange(GameEvent.MIN_ID, GameEvent.MAX_ID).create();
    }

    public static Eventstruck getInstance() {
        requireNonNull(INSTANCE, "Mod instance is requested before instance is created.");
        return INSTANCE;
    }

    public Logger getLogger() {
        requireNonNull(logger, "Logger is requested before pre-initialization.");
        return logger;
    }
    public File getSuggestedConfigurationFile() {
        requireNonNull(suggestedConfigurationFile, "Suggested configuration file is requested before pre-initialization.");
        return suggestedConfigurationFile;
    }
    public Properties getVersionProperties() {
        requireNonNull(versionProperties, "Version properties is requested before pre-initialization.");
        return versionProperties;
    }
    public ModMetadata getModMetadata() {
        requireNonNull(modMetadata, "Mod metadata is requested before pre-initialization.");
        return modMetadata;
    }
    public BuildType getBuildType() {
        requireNonNull(buildType, "Build type is requested before pre-initialization.");
        return buildType;
    }

    public enum BuildType {
        RELEASE,
        DEBUG,
    }
}
