import java.util.Scanner;
public class knapsack 
{
public void solve(int[] wt, int[] P, int W, int N)
{
int i,j;
int[][] v = new int[N + 1][W + 1];
for ( i = 0; i <= N; i++)
{
for ( j = 0; j <= W; j++)
{
if(i==0||j==0)
v[i][j]=0;
else if(wt[i]>j)
v[i][j]=v[i-1][j];
else
v[i][j]=Math.max((v[i-1][j]), (v[i - 1][j - wt[i]] + P[i]));
}
}
System.out.println("The optimal solutionis"+v[N][W]);
int[] selected = new int[N + 1];
for(i=0;i<N+1;i++)
selected[i]=0;
i=N;
j=W;
while (i>0&&j>0)
{
if (v[i][j] !=v[i-1][j])
{
selected[i] = 1;
j = j - wt[i];
}
i--;
}
System.out.println("\nItems selected : ");
for ( i = 1; i < N + 1; i++)
if (selected[i] == 1)
System.out.print(i +" ");
System.out.println();
}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
knapsack ks = new knapsack();
System.out.println("Enter number of elements ");
int n = scan.nextInt();
int[] wt = new int[n + 1];
int[] P = new int[n + 1];
System.out.println("\nEnter weight for "+ n +"elements");
for (int i = 1; i <= n; i++)
wt[i] = scan.nextInt();
System.out.println("\nEnter value for "+ n +"elements");
for (int i = 1; i <= n; i++)
P[i] = scan.nextInt();
System.out.println("\nEnter knapsack weight ");
int W = scan.nextInt();
ks.solve(wt, P, W, n);
}
}
