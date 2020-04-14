//Write a recursive program to remove all odd integers from an array. You must not use any extra array.
import java.lang.*;
import java.util.*;
import java.io.*;
class RemoveOdd
{
	public static void remove(int a[],int n)
	{
		if(n==0)
		{
			return;
		}
		if(a[n]%2!=0)
		{
			System.out.print( a[n] + " ");
		}
		remove(a,n-1);
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
		remove(a,n-1);
		System.out.printf("%n");
		for(int i=0; i<n; i++ )
		{
			System.out.print(a[i]);
        }
	}
}























