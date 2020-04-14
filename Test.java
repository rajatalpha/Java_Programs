import java.lang.*;
import java.util.*;
import java.io.*;
class Test
{	public static int printfibonacci1(int n)
	{	
		if(n == 0)
		{
			return 0;
		}
		if(n == 1 || n == 2)
		{
			return 1;
		}
		return (printfibonacci1(n-1) + printfibonacci1(n-2));

	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter upto which numbers you need he fibonacci series: ");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int c = printfibonacci1(i);
			System.out.print(c +" ");
		}
	}
}