import java.util.*;
public class MaxFromSubset {
	
	static void maximum(int arr[],int size,int k) 
	{
		int size2=size-k+1;
		int arr2[] = new int[size2];
		int max,index=0;
		
		for(int i=0;i<size2;i++) {
			max = arr[i];
			for(int j=i;j<i+k;j++) {
				if(arr[j]>max)
					max=arr[j];
			}
			arr2[index++]=max;
		}
		for(int i=0;i<size2;i++)
			System.out.println(arr2[i]);
	}
	
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = s.nextInt();
		System.out.println("Enter the k");
		int k = s.nextInt();
		if(k<size) {
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		
		maximum(arr,size,k);
		}
		else
			System.out.println("Invalid ");
	}
}
