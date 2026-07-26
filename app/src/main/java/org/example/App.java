package org.example;

import com.google.common.base.Joiner;

public class App {

    public String getGreeting() {
        return "Hello from CodeAlpha Java Gradle DevOps Project!";
    }

    public String createMessage() {
        return Joiner.on(" | ")
                .join("Java", "Gradle", "DevOps", "CI/CD");
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println(app.getGreeting());
        System.out.println("Technologies: " + app.createMessage());
    }
}