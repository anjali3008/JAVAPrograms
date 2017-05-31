/**
 * Program to find the prime number
 * @author ANJALI PANDEY
 *
 */
public class PrimeNumberDemo {
	

	public static void main(String[] args) {
		
		int x=11;
		int i=1;
		while(i<=(x/2))
		{
			i++;
			if((x%i==0)&&(i!=1))
				break;
			
		}
		if(i>(x/2))
			System.out.println(x+" is prime");
		else
			System.out.println(x+" is not prime");
	}

}
