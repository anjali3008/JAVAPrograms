/**
 * Program to find if a number is palindrome or not
 * means number = reverse number
 * @author ANJALI PANDEY
 *
 */
public class PalindromNumberDemo {

	public static void main(String[] args) {
		
		int n=329,t=n;
		int s=0,r=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(s==t)
			System.out.println(t+" is palindrome");
		else
			System.out.println(t+" is not palindrome");
	}

}
