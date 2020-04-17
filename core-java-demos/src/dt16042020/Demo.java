package dt16042020;

public class Demo {
	
	public static void main(String[] args) {
		
		int n = 23457;
		
		if(SumOfDegits.isEven(n))
			System.out.println(n +" is Even");
		
		SumOfDegits sd = new SumOfDegits();
		System.out.println(sd.sumOfDigits(n));
		
		
	}

}
