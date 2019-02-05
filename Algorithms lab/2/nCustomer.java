import java.util.Scanner;
import java.util.StringTokenizer;
class nCustomer
{
static Scanner sc =new Scanner(System.in);

String name;
String date;
public void read()
{ 
sc.nextLine();
System.out.println("Enter the name");
name=sc.nextLine();
System.out.println("Enter the DOB");
date=sc.nextLine();
}
public void display()
{
System.out.print(name+",");
StringTokenizer st=new StringTokenizer(date,"/");
while(st.hasMoreElements()){
System.out.print(st.nextElement()+",");
}
System.out.println();
}
public static void main(String[] args)
{
System.out.println("Enter the customer detail");
nCustomer[] cus=new nCustomer[30];
System.out.println("enter the number of customer");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
cus[i]=new nCustomer();
cus[i].read();
}
for(int i=1;i<=n;i++)
cus[i].display();
}
}
