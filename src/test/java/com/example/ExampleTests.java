package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertNotNull;

// TODO: (Optional) Write your tests.
@Testable
@DisplayName("Example Tests")
public class ExampleTests {
    @Test
    @DisplayName("Find Dummy")
    void findDummy() {
        URL resource = ExampleTests.class.getResource("/dummy.txt");
        assertNotNull(resource, "Resource '" + "/dummy.txt" + "' should exists");
    }
}
