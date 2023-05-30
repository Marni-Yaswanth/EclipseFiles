package com.capgemini.java.innerclass;
class A
{
	
	public void inA()
	{
		System.out.println("in A");
	}
	class B
	{
		public void inB()
		{
			System.out.println("in B");
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.inA();
		A.B b =  a.new B();
		b.inB();
		
	}

}
