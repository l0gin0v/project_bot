package com.utils;

public class DataRepository {
    public String[] questions;
    public String[] answers;

    public DataRepository() {
        questions = new String[]{"Ты любишь фильмы?",
                "Ты любишь сериалы?",
                "Ты любишь аниме?",
                "Ты любишь мультфильмы?"};
        answers = new String[questions.length];
    }
}
