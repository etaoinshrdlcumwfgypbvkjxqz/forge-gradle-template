package io.github.etaoinshrdlcumwfgypbvkjxqz.games.mods.minecraft.eventstruck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

@Testable
@DisplayName("Resources Tests")
class ResourcesTests {
    @Test
    @DisplayName("Find Dummy")
    void findDummy() {
        assertResourceExists("/dummy");
    }

    private static URL assertResourceExists(String name) {
        URL resource = ResourcesTests.class.getResource(name);
        assertNotNull(resource, "Resource \'" + name + "\' should exists");
        return resource;
    }
}
