package simple;

public class StaticExample {
	int i;
	String name;
	static String clg = "LPU";
	
	public StaticExample() {
		
	}
	public StaticExample(int i, String name) {
		
		this.i = i;
		this.name = name;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	public static String getClg() {
		return clg;
	}
	public static void setClg(String clg) {
		StaticExample.clg = clg;
	}
	

}
