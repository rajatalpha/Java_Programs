//Write a recursive program to print fibonacci series. 1st and 2nd fibonacci numbers are 1, 1
//
//
//
import java.lang.*;
import java.util.*;
import java.io.*;
class PrintFibo
{	public static int printfibonacci(int n)
	{	
		if(n == 0)
		{
			return 0;
		}
		if(n == 1 || n == 2)
		{
			return 1;
		}
		return (printfibonacci(n-1) + printfibonacci(n-2));

	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter upto which numbers you need he fibonacci series: ");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int c = printfibonacci(i);
			System.out.print(c +" ");
		}
	}
}







