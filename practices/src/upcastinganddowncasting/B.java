package upcastinganddowncasting;

public class B extends A {

	 void showChild()
	{
		System.out.println("int B show");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA = new B();
		
		objA.showParent();
		
		System.out.println(objA instanceof B);
		
	}
}
