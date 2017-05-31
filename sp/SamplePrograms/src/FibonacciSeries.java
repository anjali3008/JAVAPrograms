/**
 * creation of fibonacci series
 * @author ANJALI PANDEY
 *
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		int n=10,x=0,y=1,i=3,z=0;
		System.out.println(x+" "+y);
		while(i<=n)
		{
			z=x+y;
			x=y;
			y=z;
			System.out.println(z+" ");
			i++;
		}
		
		System.out.println("------------------------------");
		int a=0,b=0,c=1,n1=10;
		for(int j=1;j<=n1;j++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}
			
		
	}

}
