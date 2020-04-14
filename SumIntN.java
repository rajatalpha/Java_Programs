import java.io.*;
import java.lang.*;
import java.util.*;

class SumIntN
{
	public static int sumone(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		return(n+sumone(n-1));
	
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number upto which you need the sum: ");
		int n = sc.nextInt();
		System.out.print("Sum upto "+n +" Numbers is = "+sumone(n));
	}
}