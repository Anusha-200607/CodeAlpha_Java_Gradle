package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void appHasCorrectGreeting() {
        App app = new App();

        assertEquals(
                "Hello from CodeAlpha Java Gradle DevOps Project!",
                app.getGreeting()
        );
    }
}