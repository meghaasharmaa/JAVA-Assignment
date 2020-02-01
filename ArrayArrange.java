package yayyy;

import java.util.Scanner;

public class ArrayArrange {
	public static int[] arrange(int n) {
		int arr[]=new int[n];
		
		int  count=0;
		
		
		for(int i1=0;i1<=n;i1++) {
			if(i1 % 2 !=0) {
				arr[count]=i1;
				count++;
				
			}
		}
		for(int j=n;j>=1;j--)
		{	if(j%2 == 0) {
				arr[count]=j;
				count++;
			}
		
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = arrange(n);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}	
		
	}
}
