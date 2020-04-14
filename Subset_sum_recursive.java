import java.lang.*;
import java.util.*;
import java.io.*;

class Subset_sum_recursive 
{
    static boolean subset_sum_util(int list[], int starting_index, int sum)
    {
        if (sum == 0)
            return true;
        if (list.length - starting_index == 1)
             if(list[starting_index] == sum)
                 return true;
             else
                 return false;
         
         boolean result_1 = subset_sum_util(list, starting_index + 1, sum - list[starting_index]);
         
         boolean result_2 = subset_sum_util(list, starting_index + 1, sum);
         
         return result_1 | result_2;      
    }
    
    static boolean subset_sum(int list[], int sum)
    {
        if(list.length < 1)
            return false;
        if(list.length == 1)
            if(list[0] == sum) 
                return true;
            else
                return false;
                
        return subset_sum_util(list, 0, sum);
    }

	public static void main (String[] args) 
	{
	        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int i = 0;
		while(sc.hasNext())
		{
		 	   a[i++] = sc.nextInt();  
		}
		System.out.println("Enter the sum you need: ");
		int sum = sc.nextInt();
		System.out.println(subset_sum(a, sum));
	}
}