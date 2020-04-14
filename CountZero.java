//Count the number of zeros in an array of integers. Use recursion.
import java.lang.*;
import java.util.*;
import java.io.*;
class CountZero
{ 
	public static int countRecur(int a[],int n,int i)
	{	
		if(a[n]==0)
		{
			i++;
		}
		if(n==0)
		{
			return i;
		}
		return countRecur(a,n-1,i);
	}
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++ )
		{
			a[i] = sc.nextInt();
        }
		for(int p = 0;p<a.length;p++)
		{
			System.out.print(a[p] + " ");
		}
		System.out.printf("%n");
		System.out.println(countRecur(a,n-1,0));
	}
}