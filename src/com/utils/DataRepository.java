package com.utils;
import java.util.HashMap;
import java.util.Map;

public class DataRepository {
    public Map<String, Integer> QA;

    public DataRepository() {
        QA = Map.of(
                "1 + 1 = ?", 2,
                "4 + 5 = ?", 9,
                "33 + 28 = ?", 61
        );

    }
}
