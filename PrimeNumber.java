//  Read one Integer and find Whether that number is prime or not

// 5 prime  4 is  not prime

/*
prime number is a number which is divisable with  1 and with that number only

5 % 1 = 0
5 % 2 = 1
5 % 3  =2 
5  %  =1
 5 % 5 =0
 
 4 % 1 =0
 4 % 2 =0
 4 % 3 =1
 4 % 4=0
*/

class PrimeNumber
{
public static void main(String[] args)
{
int number =Integer.parseInt(args[0]);
int i = 1;
int count = 0;
while(i<=number)
{
if(number%i == 0)
{
count++;
}

i++;
}

if(count == 2)
{
System.out.println(number + " is PrimeNumber");
}else
{
System.out.println(number + " is Not PrimeNumber");

}


}
}