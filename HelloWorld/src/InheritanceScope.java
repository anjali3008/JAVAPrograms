/** 
 *This is for inheritance scope  
 *There are three classes used in this file 
 * */
class Base 
{
	/**
	 * method to print the class name
	 */
	public void print()
	{
		
		System.out.println("Base");
	}
}
class Derived extends Base
{
	public void print()
	{
		System.out.println("Derived");
	}
}


public class InheritanceScope {

	public static void main(String[] args) {
		
		Base B = new Base();
		Derived D = new Derived();
		Base E= new Derived();
		//Derived F = new Base();
		B.print();
		D.print();
		E.print();
		//F.print();
	}

}
