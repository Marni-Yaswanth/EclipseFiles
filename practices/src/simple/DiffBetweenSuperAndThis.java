package simple;

public class DiffBetweenSuperAndThis extends StaticExample{ //for example think its is extending Static example 
	int i;
	String name;
	public DiffBetweenSuperAndThis(int i, String name) {
		super.i=90;
		
		this.i=i;
		this.name=name;
		System.out.println(this.i);
		System.out.println(super.i);
		// TODO Auto-generated constructor stub
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

	public static void main(String[] args) {
		StaticExample staticExample = new StaticExample(90,"yash");
		DiffBetweenSuperAndThis diffBetweenSuperAndThis = new DiffBetweenSuperAndThis(9, "hiii");
		System.out.println(staticExample.getI()+staticExample.getName());
		System.out.println(diffBetweenSuperAndThis.getI()+diffBetweenSuperAndThis.getName());
		
	}
	
	
	
}
