
public class WhileExample 
{

	public static void main(String[] args) 
	{
		int x = -10;
		while(x<0)
		{
			//++x; or x++; will gv same output as only one expression is there
			System.out.println("x = "+x);
			++x; // or x++;
		}
	}

}
