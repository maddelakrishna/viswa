// read a b and 1 or 2 or 3 or 4
import java.util.Scanner;
class ArithmeticCalculator
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

while(true)
{
System.out.println("Enter Two Numbers");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Enter Option \n 1. for ADD 2. for MUl 3.DIV 4.Exit");
int op = sc.nextInt();
if(op==1)
{
System.out.println(a +" + "+b +" = " +(a+b));
}

if(op==2)
{
System.out.println(a +" * "+b +" = " +(a*b));
}

if(op==3)
{
System.out.println(a +" / "+b +" = " +(a/b));
}
if(op>=4 || op < 1 )
{
System.exit(0);
}
}


}

}
