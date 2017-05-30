
public class ForLoopTypes {

	public static void main(String[] args) {
		
		int[] forLoop = {1,2,3,4};
		
		for(int i=0;i<forLoop.length;i++)
		{
			forLoop[i] = 0;
		}

		for(int i=0;i<forLoop.length;i++)
		{
			System.out.println(forLoop[i]+" ");
		}
		
		int[] enhancedFor = {1,2,3,4};
		
		for(int i:enhancedFor) // i will start from 1 be
		{
			enhancedFor[i] = 0;
			//i=0;
		}
		
		for(int i:enhancedFor)
		{
			System.out.println(i+" ");
			System.out.println("abhishek loves chikky");
		}

	}

}
