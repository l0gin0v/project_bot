package com.utils;
import java.util.HashMap;
import java.util.Map;

public class DataRepository {
	private final Map<String, Integer> QA;
	
	public DataRepository() {
		QA =  Map.of(
			"1 + 1 = ?", 2,
			"4 + 5 = ?", 9,
			"33 + 28 = ?", 61
		);

	} 

	public Map<String, Integer> getQA() {
		return QA;
}
