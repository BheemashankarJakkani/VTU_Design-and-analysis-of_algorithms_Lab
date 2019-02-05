import java.util.Scanner;
import java.io.*;

public class Student
{
 static Scanner sc = new Scanner(System.in);
 String usn,name,branch,phone;
 public static void main(String args[])
 {
  
  System.out.println("Enter the no of Students");
  int n=sc.nextInt();
  Student s[]=new Student[n];
  for(int i=0;i<n;i++)
  {
   s[i]=new Student(); 
   s[i].getdata(s[i]);
  }
  for(int i=0;i<n;i++)
  {
   System.out.println("\n\n The deatails are");
   System.out.println("Name:"+s[i].name+"\nUSN:"+s[i].usn+"\nBranch:"+s[i].branch+"\nPhone:"+s[i].phone);

  }
  
}

void getdata(Student s)
{
 sc.nextLine();
 System.out.println("Enter the details");
 System.out.println("Name:");
 s.name=sc.nextLine();
 System.out.println("USN:");
 s.usn=sc.nextLine();
 System.out.println("Branch:");
 s.branch=sc.nextLine();
 System.out.println("phone:");
 s.phone=sc.nextLine();
}
}

