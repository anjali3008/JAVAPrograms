import java.util.Scanner;

/**
 * In selection sort we find the smallest element first in the first iteration
 * in the second iteration we start to find the second biggest number
 * @author ANJALI PANDEY
 *
 */
public class SelectionSortDemo {
	
	public static void selectionSortFunc(int[] arr,int n)
	{
		int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+" ");
	}

	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	 int arr[] = new int[6];
		for(int i=0;i<6;i++){
			System.out.println("enter value " +i + " : ");
			arr[i]=s.nextInt();
		}
		
		int siz = arr.length;
		
		selectionSortFunc(arr,siz);

	}

}
