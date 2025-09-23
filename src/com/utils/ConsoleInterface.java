package com.utils;

import java.util.Scanner;

public class ConsoleInterface {
    private DialogLogic dialogLogic;

    public ConsoleInterface(DialogLogic logic) {
        dialogLogic = logic;
    }

    private int getAnswer() {
    }

    public void run() {
        Scanner input = new Scanner(System.in);

        while(!input.nextLine().equals("/start"));

        for (int i = 0; i < dialogLogic.getDataLenght(); i++) {
            System.out.println(dialogLogic.getQuestion(i));
            System.out.println(dialogLogic.checkAnswer(getAnswer(), i));
        }

        String message;
        do {
            message = input.nextLine();
            if (message.equals("/help")) {
                System.out.println(dialogLogic.getHelp());
            }
        } while (!message.equals("/quit"));
    }
}
