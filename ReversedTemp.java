import java.lang.*;
import java.util.*;
import java.io.*;
class ReversedTemp
{
	public  static void reversearray1(int a[],int start,int end)
	{
		int temp = 0;
		if(start>=end)
		{
			return;
		}
		System.out.println(start);
		System.out.println(end);
		temp = a[end];
		a[end] = a[start];
		a[start] = temp;
		reversearray1(a,start + 1,end-1);
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
	    reversearray1(a,0,n-1);
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}