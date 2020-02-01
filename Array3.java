package yayyy;
import java.util.Scanner;

public class Array3 {
	public static int linearSearch(int[] arr, int num){
     for(int i=0;i<arr.length;i++) {
    	 if(arr[i]==num)
    		 return i;
    	 
     }
     return -1;
	}
	
		/*   int i=0;
        int z=0;
        int flag=0;
		for(i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                 flag=1;
                break;
            }
            else{
               flag=0;
            }
    
        }
	       if(flag==1)
           {
               z=i;
           }
        else
        {
            z=-1;
        }
        return z;
    }
   */
	
	
static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s.nextInt();
		System.out.print(linearSearch(arr, num));
	}
}
