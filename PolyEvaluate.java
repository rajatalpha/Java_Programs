//Write a recursive solution to evaluate the previous polynomial for any given x and n. Like, when x=2 and n=5, we have 1 + x + x2 + ................. + xn-1 = 31
//Input:
//2 5
//Output:
//31
import java.lang.*;
import java.util.*;
import java.io.*;
class PolyEvaluate
{	public static int evaluatePoly(int x,int n,int ans)
	{
		if(x==0)
		{
			return 1;
		}
		if(n==0)
		{
			return 1 + ans;
		}
		ans = ans + (int)Math.pow(x,n);
		return evaluatePoly(x,n-1,ans);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the x and n for evaluating the polynomial: ");
		int x = sc.nextInt();
		int n =sc.nextInt();
		int p = evaluatePoly(x,n-1,0);
		System.out.println("The output after evaluation is: "+p);
	}
}
/*


*/

