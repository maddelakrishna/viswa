package dt16042020;

public class SumOfDegits {
	
	public static boolean isEven(int n)
	{
		if(n%2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public  int sumOfDigits(int n)
	{
		int sum = 0;
		while(n!=0)
		{
			sum = sum + n % 10;
			n = n/10;
		}
		return sum;
	}

	public static void main(String[] args) {

  SumOfDegits sd = new SumOfDegits();
		
		  int[] nums = {234,456,789,256,342};
		
		  for(int n:nums)
		  {
			  if(isEven(n))
				  System.out.println(n+" is even "+sd.sumOfDigits(n));
		  }

	}

}
