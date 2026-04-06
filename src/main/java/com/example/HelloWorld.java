package com.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Students!"); //comment
    }

    public String getGreeting() {
        //if change the return value, the test will fail, as in test script use assertEquals to check the return value of this method
        return "Hello, World!";
    }
}
