import java.util.Scanner;
class Knapsackgreedy
{
   public void runKnapsack(int m,int n,int []w,int []p)
    {
       int maxIndex=-1;
       double rc=(double)m;
       double x[]=new double[n+1];
       for(int i=0;i<=n;i++)
       {
	 x[i]=0.0;
       }
       int i,k;
       for(i=1;i<=n;i++)
       {
	  double maxElement=0.0;
	   for(k=1;k<=n;k++)
	   {
	    if(maxElement<((double)p[k]/(double)w[k])&&x[k]==0.0)
	     {
		maxElement=(double)p[k]/(double)w[k];
		maxIndex=k;
	     }
	   }
	  if(w[maxIndex]>rc)
	  {
		break;
	  }
	  rc=rc-w[maxIndex];
	  x[maxIndex]=1;
        }
 
	 if(i<=n)
	 {
 		x[maxIndex]=rc/w[maxIndex];
 	 }
	 double maxValue=0.0;
	 System.out.println("items included:");
	 for(int j=1;j<=n;j++)
	 {
		 if(x[j]!=0)
		 {
			System.out.println("item"+j+"("+x[j]+")\t");
			maxValue=maxValue+(p[j]*x[j]);
		 } 
         }
         System.out.println("The max proffit  "+maxValue);
	 System.out.println("XArray");
	 for(int I=1;I<=n;I++)
	 {
          System.out.println(x[I]);
         }
}


	public static void main(String args[])
  {
		Scanner input=new Scanner(System.in);
		System.out.println("\n\n enter maximum capacity");
		int m=input.nextInt();
		System.out.println("\n\n enter total number of items");
		int n=input.nextInt();
		System.out.println("\n\n enter weight of each items");
		int []w=new int[n+1];
		w[0]=0;
		for(int i=1;i<=n;i++){
			System.out.println("weight of item"+i);
			w[i]=input.nextInt();
		}
		System.out.println("\n\n enter profit of each item");
		int []p=new int[n+1];
		p[0]=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println("profit item"+i);
			p[i]=input.nextInt();
		}

		Knapsackgreedy dk=new Knapsackgreedy();
		dk.runKnapsack(m,n,w,p);
		}
	}
