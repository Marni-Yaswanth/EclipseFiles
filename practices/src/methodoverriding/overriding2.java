package methodoverriding;

public class overriding2 extends overriding1 {
	int i;
	int s = super.i;
	
	public overriding2(int i) {
		
		super(i);
		super.i=90;
		System.out.println(super.i);
		this.i=i;
		// TODO Auto-generated constructor stub
	}

	

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		overriding2 o = new overriding2(50);
		
		System.out.println(o.getI());
		
	}
	
	
}
