// 1234 = 1+2+3+4 = 10
/*
10)1234(123
   1230
    ---
	4 
	number  % 10 
	number / 10
	
	 123
*/

class SumOfDegits
{
public static void main(String[] args)
{
int number =Integer.parseInt(args[0]); // 1234
int sum = 0;
int evensum =0;
while(number!=0)
{
//sum = sum * 10 + (number % 10);
int rem = number % 10;

if(rem % 2 == 0)
	evensum+=rem;

number = number / 10;

}



System.out.println("The Even Sum is "+evensum);
}
}