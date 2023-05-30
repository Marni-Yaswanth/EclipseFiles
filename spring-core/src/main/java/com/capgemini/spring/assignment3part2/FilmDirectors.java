package com.capgemini.spring.assignment3part2;

import java.util.HashMap;
import java.util.Map;

public class FilmDirectors {
	
	Map<String, String> directorMap = new HashMap<String, String>();

	public Map<String, String> getDirectorMap() {
		return directorMap;
	}

	public void setDirectorMap(Map<String, String> directorMap) {
		this.directorMap = directorMap;
	}
	public void printFilmInfo()
	{
		for(String string : directorMap.keySet())
		{
			System.out.println("key is "+string+" value is "+directorMap.get(string));
		}
	}
}
