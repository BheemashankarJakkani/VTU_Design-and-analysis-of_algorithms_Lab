import java.util.Scanner;
class floyds 
{
 public static void main(String[] args) 
 {
  int a[][]=new int[10][10];
  int n,i,j,k;
  System.out.println("enter the number of vertices");
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  System.out.println("Enter the weighted matrix");
  for(i=0;i<n;i++)
  {
   for(j=0;j<n;j++)
   {
    a[i][j]=sc.nextInt();
   }
  }
  for(k=0;k<n;k++)
  {
   for(i=0;i<n;i++)
   {
    for(j=0;j<n;j++)
    {
     a[i][j]=Math.min(a[i][j], a[i][k]+a[k][j]);
    }
   }
  }

  System.out.println("The shortest path matrix is");
  for(i=0;i<n;i++)
  {
   for(j=0;j<n;j++)
   {
    System.out.print(a[i][j]+"   ");
   }
   System.out.println();
  }
 }
}
                                                                                                                                                                           
                                          
