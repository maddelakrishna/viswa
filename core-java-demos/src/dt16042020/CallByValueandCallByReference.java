package dt16042020;

public class CallByValueandCallByReference {

	public static void swap(int a , int b) // a, b formal parameters
	{
		int t = a;
		a = b;
		b = t;
		
		System.out.println("After Swaping ");
		System.out.println("a = "+a+" b = "+b);
	}
	
	public static void main(String[] args) {

		
      int num1= 4;
      int num2 =5;
      
      System.out.println("num 1 = "+num1+" num2 = "+num2);
      
       swap(num1, num2); // call num1 ,num2 actual parameters call by values
       
       
       System.out.println("num 1 = "+num1+" num2 = "+num2);
	}

}
