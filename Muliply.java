//Find Product of 2 Numbers using Recursion 
import java.lang.*;
import java.util.*;
import java.io.*;

class Muliply
{
	public static int product(int x, int y)
	{
		if(x<y)
		{
			product(y,x);
		}
		if(y!=0)
		{
			return(x + product(x, y - 1));
		}
		else 
		{
			return 0;
		}
		
	
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers to be multiplied: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(product(x,y));
	}
}
