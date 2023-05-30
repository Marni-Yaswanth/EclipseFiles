package inhertance;

public class Child extends Parent{
	int a=9;
	int b = 8;
public Child()
{
	super();
	System.out.println("in child");
}
public Child(int x, int y)
{
	super(x,y);
	super.a=x;
	super.b=y;
	this.a=x;
	this.b=y;
	System.out.println(a+b);
	System.out.println(super.a+super.b);
}
	

	public static void main(String[] args) {
		Child child = new Child(3,4);
		
	}

}
