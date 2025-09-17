package com.utils;

public class DialogLogic {
    private DataRepository dataRepository = new DataRepository();

    public DialogLogic(DataRepository repository) {
        dataRepository.questions = repository.questions;
        dataRepository.answers = repository.answers;
    }

    private void checkIndex(int i) {
        if (i > dataRepository.questions.length || i < 0) {
            throw new IllegalArgumentException("Вне диапазона индексации значений");
        }
    }

    public String getCurrentQuestion(int i) {
        checkIndex(i);
        return dataRepository.questions[i];
    }

    public void saveCurrentAnswer(String answer, int i) {
        checkIndex(i);
        dataRepository.answers[i] = answer;
    }

    public DataRepository getInfo() {
        return dataRepository;
    }

    public String getHelp() {
        return "Этот бот создан для ...";
    }
}
