// A12A, ab2avc, we123a

import java.util.Scanner;
class ArraysExample4
{
public static void main(String[] args)
{
String[] a= new String[5]; // Creation
Scanner sc = new Scanner(System.in);
System.out.println("Enter Array Values");

for(int i =0;i<a.length;i++)
{
 a[i] = sc.next();
}
int sum =0;

for(int i =0;i<a.length;i++)
{
String s = a[i];

for(int j =0;j<s.length();j++)
{
 
   if(s.charAt(j) >= 48 && s.charAt(j) <=57)
   {
   sum = sum + Integer.parseInt(s.substring(j,j+1));
   }

}


}

System.out.println(sum);
}
}