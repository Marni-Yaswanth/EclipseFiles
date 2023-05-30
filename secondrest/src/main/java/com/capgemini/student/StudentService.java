package com.capgemini.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service 
public class StudentService {

	
	static Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
	int i=2;
	public Map<Integer, Student> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<Integer, Student> studentMap) {
		this.studentMap = studentMap;
	}
	
	static
	{
		studentMap.put(1,new Student("1","yaswanth"));
		studentMap.put(2, new Student("2","prazeeps"));
		
	}
	public Map<Integer, Student> getMap()
	{
		return getStudentMap();
	}
	public List<Student> getAllUser() {
		// TODO Auto-generated method stub
		return studentMap.values().stream().toList();
	}
	public void add(Student student)
	{
		i++;
		studentMap.put(i, student);
		
	}

	public void modify(int id, Student student) {
		// TODO Auto-generated method stub
		studentMap.put(id, student);
	}
	public void delete(int id)
	{
		studentMap.remove(id);
	}
	public Student showPStudent(int id)
	{
		return studentMap.get(id);
	}
	
}
