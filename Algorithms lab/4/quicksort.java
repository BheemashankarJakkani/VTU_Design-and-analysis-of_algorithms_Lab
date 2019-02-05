import java.util.Random;
import java.util.Scanner;
public class quicksort 
{
static int max=50000;
public static int partition (int[] a, int start,int end)
{
int pivot=a[end];
int p=start;
for(int i=start;i<end;i++)
{
 if(a[i]<=pivot)
 { 
 int temp=a[i];
 a[i]=a[p];
 a[p]=temp;
 p++;
 }
}
int temp=a[p];
a[p]=a[end];
a[end]=temp;
return p;

}
public static void Qsort(int[] a,int start,int end)
{
if(start>=end)
return;
int p=partition(a,start,end);
Qsort(a,start,p-1);
Qsort(a,p+1,end);
}
public static void main(String[] args) {
int[] a;
int i;
System.out.println("Enter the array size");
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
a= new int[max];
Random generator=new Random();
for( i=0;i<n;i++)
a[i]=generator.nextInt(20);
System.out.println("Array before sorting");
for( i=0;i<n;i++)
System.out.println(a[i]+" ");
long start=System.nanoTime();
quicksort m=new quicksort();
m.Qsort(a,0,n-1);
long stop=System.nanoTime();
long elapseTime=(stop-start);
System.out.println("Time taken to sort array is:"+elapseTime+"nanoseconds");
System.out.println("Sorted array is");
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}

