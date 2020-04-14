//Find the minimum element in an array of integers. Use recursion.
import java.lang.*;
import java.util.*;
import java.io.*;
class MinMax
{
	static class Pair
	{
		int mini;
		int maxi;
	}
	public static Pair MinMaxScale(int a[],int n)
	{
		Pair ans = new Pair();
		if(n==0)            //If there is ony one element in array
		{
			ans.mini = a[0];
			ans.maxi = a[0];
			return ans;
		}
		if (a[0] > a[1]) { 
            ans.maxi = a[0]; 
            ans.mini = a[1]; 
        } else { 
            ans.maxi = a[1]; 
            ans.mini = a[0]; 
        } 
  
        for (int i = 2; i < n; i++) { 
            if (a[i] > ans.maxi) { 
                ans.maxi = a[i]; 
            } else if (a[i] < ans.mini) { 
                ans.mini = a[i]; 
            } 
        } 
		return ans;
		
	}	
	public static int mini(int a[],int n)
	{  
		if(n==0)
		{
			return a[0];
		}
		return Math.min(a[n],mini(a,n-1));	
		
	}
	public static int maxi(int a[],int n)
	{
		if(n==0)
		{
			return a[0];
		}
		return Math.max(a[n],maxi(a,n-1));
	}

	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++ )
		{
			a[i] = sc.nextInt();
        }
		System.out.print("The Minimum of the array is: " + mini(a,n-1));
		System.out.printf("%n");
		System.out.println("The Maximum of the array is: " + maxi(a,n-1));
		Pair outer = MinMaxScale(a,n);
		System.out.println(outer.mini);
		System.out.println(outer.maxi);
	}	
}