import java.io.*;
import java.util.Scanner;
class Exception
{
 public static void main(String args[])
 {
  int a,b,c;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a and b vallue");
  a=sc.nextInt();
  b=sc.nextInt();
  try{
   c=a/b;
   System.out.println("the answer is"+c);
  }
  catch(ArithmeticException e)
  {
   e.printStackTrace();
  }
 }
}
