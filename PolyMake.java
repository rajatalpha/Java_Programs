//Write a recursive solution to print the polynomial series for any input n: 1 + x + x2 + ................. + xn-1
//Input:5
//Output: 1 + x + x^2 + x^3 + x^4
import java.lang.*;
import java.util.*;
import java.io.*;
class PolyMake
{
	public static void polySmall(int n,int i)
	{
		if(i<n)
		{	
			if(i==0)
			{
				System.out.print("1");
			}
			else if(i==1)
			{	
				System.out.print("+x");
			}
			else
			{
					System.out.print("+x^"+i);
			}
		polySmall(n,i+1);
		}
	}	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n = sc.nextInt();
		polySmall(n,0);
	}
}



/*void recurs(int i, int j);
int main(){
    int n = 10;
    recurs(0, n);    //0,10
    return 0;
}
void recurs(int i, int j){
    if (i<j){
        if(i==0)
		{
            printf("1 + ");
		}
        else if (i == 1)
		{
            printf("x + ");
        }
        else
		{
            if(i>1)
			{
                printf("x^%d ", i);
			}
            if (i<j-1)
                printf(" + ");
        }
    recurs(i+1, j);
    }
}
*/