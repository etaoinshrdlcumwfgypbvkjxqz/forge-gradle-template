package io.github.etaoinshrdlcumwfgypbvkjxqz.games.mods.minecraft.eventstruck.utilities;

public class ThrowingUtilities {
    private ThrowingUtilities() {
        throw throwIllegalConstructorUse();
    }

    public static IllegalStateException throwIllegalConstructorUse() {
        throw new IllegalStateException("The following code tried using a constructor illegally: " + new Throwable().getStackTrace()[2].toString());
    }
}
