package com.capgemini.spring.DegreedAssignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class {
	List<String> lst = new ArrayList<String>();
	Set<String> set = new HashSet<String>();
	Map<Integer,String> map = new HashMap<Integer,String>();
	public List<String> getLst() {
		return lst;
	}
	public void setLst(List<String> lst) {
		this.lst = lst;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	
}
