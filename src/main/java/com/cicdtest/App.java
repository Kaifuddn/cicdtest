package com.cicdtest;

/**
 * This is a utility class for the application entry point.
 */
public final class App {

    // Private constructor to prevent instantiation
    private App() {
        throw new IllegalStateException("Utility class");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
