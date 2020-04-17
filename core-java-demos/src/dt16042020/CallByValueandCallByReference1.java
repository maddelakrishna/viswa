package dt16042020;

import java.util.Arrays;
import java.util.Scanner;

public class CallByValueandCallByReference1 {
	
	public static void sortArray(int[] n)
	{
		Arrays.sort(n);
	}

	public static void main(String[] args) {
  
		
		 int[] nums = new int[5];  // arrays are secondary (Objects)
   Scanner sc = new Scanner(System.in);
		 System.out.println("Enter array values");
		  for(int i = 0;i<nums.length;i++)
		  {
			  nums[i] = sc.nextInt();
		  }
		 
		  System.out.println("*********************");
		   sortArray(nums); // call reference
		   
		   
		   for(int i = 0;i<nums.length;i++)
			  {

System.out.println(nums[i]);
			  }
			  
	}

}
