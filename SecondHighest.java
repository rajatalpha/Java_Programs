//Write a recursive solution to find the second maximum number from a given set of integers.
import java.lang.*;
import java.util.*;
import java.io.*;
class SecondHighest
{
	public static int secondhigh(int a[],int n, int high, int sechigh)
	{
		if(n==0)
		{
			return sechigh;
		}
		for(int i=0;i<=n-1;i++)
		{
			if((a[i]>high) && (a[i]> sechigh))
			{	
				sechigh = high;
				high = a[i];
			}	
			else if((a[i]<high) && (a[i]>sechigh))
				sechigh = a[i];		
		}
		return secondhigh(a,n-1,high,sechigh);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		MinMax mm  = new MinMax(); 
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		if(n<=1)
			System.out.println("Give atleast two elements");
		int a[] = new int[n];
		for(int i=0; i<n; i++ )
		{
			a[i] = sc.nextInt();
        }
		int z = mm.mini(a,n-1);
		if((n==2) && (a[0]==a[1]))
			System.out.println("The Second Highest is: "+a[0]);
		
		else
			System.out.println("The Second Highest is: "+secondhigh(a,n,z,z));
		
	}
}













