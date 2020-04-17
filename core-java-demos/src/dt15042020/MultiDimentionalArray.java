package dt15042020;

import java.util.Scanner;

public class MultiDimentionalArray {
	public static void main(String[] args) {
		
		//int [][]ar = {{1,2,3},{2,3,4},{3,4,5}}; // 3 X 3
		
		int ar[][] = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		
		for(int i =0; i<ar.length; i++)
		{
			for(int j =0; j<ar[i].length;j++)
			{
				ar[i][j] = sc.nextInt();
			}


		}
		
		
		
		for(int i =0; i<ar.length; i++)
		{
			for(int j =0; j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		int sum =0;
		for(int i =0; i<ar.length; i++)
		{
			for(int j =0; j<ar[i].length;j++)
			{

if(i == j)
{
	sum = sum + ar[i][j];
}
			}
			
		}
		
		System.out.println(sum);
	}

}
