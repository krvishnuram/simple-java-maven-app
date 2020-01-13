package com.mycompany.app;

/**
 * Hello world! ABC 2020-01-12
 */
public class App
{

    private final String message = "Hello World 2020!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
