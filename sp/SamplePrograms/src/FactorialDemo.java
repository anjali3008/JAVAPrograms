
public class FactorialDemo {

	public static void main(String[] args) {
		
		int n=5,fact=1;
		if(n==0)
			System.out.println("factorial is 1");
		else
		{
			while(n>0)
			{
			fact=fact*n;
			n--;
			}
			System.out.println("factorial is"+fact);
		}
			
		
	}

}
