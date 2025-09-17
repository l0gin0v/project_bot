package com.utils;

import java.util.Scanner;

public class ConsoleInterface {
    private DialogLogic dialogLogic;

    public ConsoleInterface(DialogLogic logic) {
        dialogLogic = logic;
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        DataRepository data = dialogLogic.getInfo();

        while(!input.nextLine().equals("/start"));

        for (int i = 0; i < data.questions.length; i++) {
            System.out.println(dialogLogic.getCurrentQuestion(i));
            dialogLogic.saveCurrentAnswer(input.nextLine(), i);
        }

        System.out.println("\nСвод данных:");
        for (int i = 0; i < data.answers.length; i++) {
            System.out.println(data.questions[i] + " " + data.answers[i]);
        }
        System.out.println();

        String message;
        do {
            message = input.nextLine();
            if (message.equals("/help")) {
                System.out.println(dialogLogic.getHelp());
            }
        } while (!message.equals("/quit"));
    }
}
