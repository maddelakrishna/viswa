import java.util.Scanner;
class ArraysExample3
{
public static void main(String[] args)
{
double[] a= new double[5]; // Creation
Scanner s = new Scanner(System.in);
System.out.println("Enter Array Values");

for(int i =0;i<a.length;i++)
{
 a[i] = s.nextDouble();
}
for(int i =0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}