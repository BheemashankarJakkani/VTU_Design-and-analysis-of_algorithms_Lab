import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Random;
class Customer
{
 static Scanner sc = new Scanner(System.in);
 public static void main(String args[])
 {
  String date,name;
  System.out.println("Enter the name of customer");
  name = sc.nextLine();
  System.out.println("Enter the DOB of  customer");
  date = sc.nextLine();
  System.out.print(name);
  StringTokenizer st= new StringTokenizer(date,"/");
  while(st.hasMoreElements())
  {
   System.out.print(","+st.nextElement());
  }
 }
}
 
 
