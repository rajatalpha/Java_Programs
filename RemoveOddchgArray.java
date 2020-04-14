//Write a recursive program to remove all odd integers from an array. You must not use any extra array or print anything in the function. 
//Just read input, call the recursive function, then print the array in main().
import java.lang.*;
import java.util.*;
import java.io.*;
class RemoveOddchgArray
{
	public static int[] removed(Integer a[],int n,int i)
	{   
		List<Integer> b = new ArrayList<Integer>();
		if(n==0)
		{	
			Integer[] primeArray = new Integer[b.size()];
			for (int ip =0; ip < b.size(); ip++) 
				primeArray[ip] = b.get(ip);
			return primeArray;
		}
		if(a[n]%2!=0)
		{
			b.add(a[n]);
		}
	    return removed(a,n-1,i);
	}
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		Integer a[] = new Integer[n];
		for(int i=0; i<n; i++ )
		{
			a[i] = sc.nextInt();
        }
		a = removed(a,n-1,0);
		System.out.printf("%n");
		for(int i=0; i<n; i++ )
		{
			System.out.print(a[i]);
        }
	}
}