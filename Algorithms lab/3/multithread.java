import java.util.*;
import java.util.Random;
import java.lang.*;
class second implements Runnable
{
public int x;
public second (int x)
{
this.x=x;
}
public void run()
{
System.out.println("Second thread:Square of the numberis"+x*x);
}
}
class third implements Runnable
{
public int x;
public third(int x)
{
this.x=x;
}
public void run()
{
System.out.println("third thread:Cube of the number is"+x*x*x);
}
}
class first extends Thread 
{
public void run()
{
int num=0;
Random r=new Random();
while(true)
{
num=r.nextInt(100);
System.out.println("first thread generated numberis"+num);
Thread t2=new Thread (new second(num));
t2.start();
Thread t3=new Thread(new third(num));
t3.start();
try{

Thread.sleep(1000);
}

catch(InterruptedException e)
{
System.out.println(e.getMessage());
}
System.out.println();

}
}
}
public class multithread
{
public static void main(String args[])
{
first a=new first();
a.start();
}
}
