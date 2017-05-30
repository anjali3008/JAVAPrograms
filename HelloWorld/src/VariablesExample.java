class VariableDemo
{
	int x = 10;
	static int y = 5;
	
	public VariableDemo()
	{
		super();
	}
	void checkMethod()
	{
		int z = 3;
		System.out.println("value of z ="+z);
		System.out.println("value of x ="+x);
		System.out.println("value of y = "+y);
		z++;
		x++;
		y++;
	}
}
public class VariablesExample {
	
	
	public static void main(String[] args) {
		VariableDemo d1 = new VariableDemo();
		d1.checkMethod();
		VariableDemo d2 = new VariableDemo();
		d2.checkMethod();
		VariableDemo d3 = new VariableDemo();
		d3.checkMethod();
		

	}

}
