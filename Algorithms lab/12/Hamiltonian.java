import java.io.*;
import java.util.*;
class Hamiltonian
{
	static int n,i,j;
	static int a[][]=new int[10][10];
	static int x[]=new int[10];
        static int found=0;
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of nodes");
		n=sc.nextInt();
		Hamiltonian h=new Hamiltonian();
		System.out.println("enter the adj matrix");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		x[1]=1;
		for(i=2;i<=n;i++)
			x[i]=0;
		h.Hamcycle(2);
               if(found==0)
               System.out.println("Hamiltonian cycle doesn't exists !");
	}
	static void Hamcycle(int k)
	{
		do
		{
			nv(k);
			if(x[k]==0) 
			return;
			if(k==n)
			{
				for(i=1;i<=n;i++)
				{
					System.out.print(x[i]+"-->");
				}
				System.out.println(x[1]);
                                found=1;

			}
			else
			Hamcycle(k+1);
		}while(true);
	}
	static void nv(int k)
	{
		do
		{
			x[k]=(x[k]+1)%(n+1) ; // Find next vertex
			if(x[k]==0)
				 return;
			if(a[x[k-1]][x[k]]!=0) 	// to check whether an edge exists between current and previous vertex.
			{
				for(j=1;j<=k-1;j++)
					if (x[j] ==x[k])
						 break; //Check for duplicate vertex.
          			 if(j==k) // obtain distinct vertex
					if((k<n)||((k==n)&&a[x[n]][x[1]]!=0))
						 return; // return distinct vertex
			} 
		}while(true);
	}
}

