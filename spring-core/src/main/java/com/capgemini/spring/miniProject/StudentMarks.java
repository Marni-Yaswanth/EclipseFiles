package com.capgemini.spring.miniProject;

import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
Map<String, Double> studentMap = new HashMap<String, Double>();

public Map<String, Double> getStudentMap() {
	return studentMap;
}

public void setStudentMap(Map<String, Double> studentMap) {
	this.studentMap = studentMap;
}

}
