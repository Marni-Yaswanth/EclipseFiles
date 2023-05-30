package simple;

public class AbstractClass2 extends AbstractClass1 {

	public String showName()
	{
		return "hii";
	}
	public static void main(String[] args) {
		AbstractClass2 abstractClass2 = new AbstractClass2();
		System.out.println(abstractClass2.showName());
	}
}
