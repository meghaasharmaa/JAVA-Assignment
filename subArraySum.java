

import java.util.*;

public class SubArraySum

{

	public static void main(String[] args)

	{

		Scanner s=new Scanner(System.in);

		System.out.println("Enter size of array:");

		int n=s.nextInt();

		int[]arr=new int[n];

		System.out.println("Enter elements in array:");

		for(int i=0;i<n;i++)

		{

			arr[i]=s.nextInt();

		}



		System.out.println("Enter number");

		int NUM=s.nextInt();

		for(int i=0;i<n;i++)

		{

			int sum=0;

			for(int j=i;j<n;j++)

			{

				sum+=arr[j];

					if(sum==NUM)

					{

						System.out.println("starting index:" + i + ","+"Ending index:"+j);

						break;

					}

			}

		}



	}

}
