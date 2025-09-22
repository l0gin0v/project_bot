package com.utils;
import java.util.HashMap;
import java.util.Map;

public class DataRepository {
    public Map<String, Integer> QA;
	
	public DataRepository() {
		QA = new HashMap<>() {{
			put("1 + 1 =", 2);
			put("2 + 5 =", 7);
			put("9 + 0 =", 9);
			put("33 + 28 =", 61);

	} 
}
