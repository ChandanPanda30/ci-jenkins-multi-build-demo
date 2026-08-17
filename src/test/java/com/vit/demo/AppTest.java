package com.vit.demo;

public class AppTest {
    public static void main(String[] args) {
        int result = App.add(2, 3);
        int expected = 5;

        if (result != expected) {
            throw new AssertionError(
                "Test failed: expected " + expected + " but received " + result
            );
        }

        System.out.println("TEST PASSED: App.add(2, 3) returned 5.");
    }
}
