/**
 * Bubble Srting program
 * Here the biggest element is sorted first and brought to the end index
 * @author ANJALI PANDEY
 *
 */
//public void BubbleSortfunc(int[],int);
//public void swapNum(int,int);
public class BubbleSortDemo {
	
	public static void BubbleSortfunc(int[] arr2,int n)
	{
		int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr2[j]<arr2[j+1])
				{
					temp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;
					
				}
				System.out.println("==============================");
				for(int k=0;k<arr2.length;k++){
					System.out.println(arr2[k] );
				}
				
				//swapNum(arr2[j],arr2[j+1]);
			}
		}
		System.out.println("==============================");
		for(int i=0;i<n;i++)
			System.out.println(arr2[i]+" ");
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {5,7,3,1,2};
		int siz = arr.length;
		BubbleSortfunc(arr,siz);

	}

}
