//Write a recursive function that prints all the elements of an array of integers in reverse order. 
import java.lang.*;
import java.util.*;
import java.io.*;
class Reverse                       //Based on call stack
{   public static void reversearray(int a[],int n)
	{
		if( a == null || n==a.length )
			return;
		int value  = a[n];
		reversearray(a,n+1);
		a[a.length-n-1] = value;
	}
	
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0; i<n; i++ )
		{
			a[i] = sc.nextInt();
        }
		System.out.print("The array is given order is: ");
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.printf("\n");
	    reversearray(a,0);
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}

/*Using Collections
import java.util.Arrays;
import java.util.Collections;
 
class Reverse
{
    public static void main(String[] args)
    {
        Integer[] A = { 1, 2, 3, 4, 5 };
        Collections.reverse(Arrays.asList(A));
        System.out.println(Arrays.toString(A));
    }
}
*/



