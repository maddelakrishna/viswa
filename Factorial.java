import java.util.Scanner;
class Factorial
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");

int num = sc.nextInt();  
// 5! = 5 * 4 * 3 * 2 *1
int fact = 1;
for(int i =1;i<=num;i++)
{

fact = fact * i;
}
System.out.println("The Factorial is :"+fact);
}
}