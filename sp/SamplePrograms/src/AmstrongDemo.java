
public class AmstrongDemo {

	public static void main(String[] args) {
		
		int n=153,r=0,s=0,t=n;
		while(n>0)
		{
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
		}
		if(s==t)
			System.out.println(t+" is Amstrong");
		else
			System.out.println(t+" is not Amstrong");
	}

}
