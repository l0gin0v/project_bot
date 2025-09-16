package com.utils;
import java.util.Scanner;

public class Bot {
    private final String name;

    public Bot(String botName) {
        name = botName;
    }

    public String getName() {
        return name;
    }

    public String getRequest() {
        System.out.print(">>> ");
        Scanner request = new Scanner(System.in);
        return request.nextLine();
    }

    public String answer(String message) {
        return switch (message) {
            case "/start" -> "Привет, меня зовут " + getName();
            case "/help" -> "Я бот для ...";
            case "/quit" -> "quit";
            default -> "Я тебя не понимаю, друг";
        };
    }
}