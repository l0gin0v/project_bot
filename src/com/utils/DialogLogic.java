package com.utils;

import java.util.ArrayList;

public class DialogLogic {
    public DataRepository dataRepository;
    private ArrayList<String> questions;

    public DialogLogic(DataRepository repository) {
        dataRepository = repository;
        questions = new ArrayList<>(repository.QA.keySet());
    }

    private void checkIndex(int i) {
        if (i > questions.toArray().length || i < 0) {
            throw new IllegalArgumentException("Вне диапазона индексации значений");
        }
    }

    public String getQuestion(int i) {
        checkIndex(i);
        return questions.get(i);
    }

    public String checkAnswer(int answer, int i) {
        checkIndex(i);
        int correctAnswer = dataRepository.QA.get(questions.get(i));
        if (answer == correctAnswer) {
            return "Абсолютно верно!";
        }
        else {
            return "Неееееет!) Правильный ответ: " + correctAnswer;
        }
    }
    public int getDataLenght() {
        return questions.size();
    }

    public String getHelp() {
        return "Этот бот создан для ...";
    }
}
