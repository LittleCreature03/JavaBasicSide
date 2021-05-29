package arrays;
/* This program shows how to get an input for an array from the user*/
import java.util.*;

public class ArrayModel2 {
	
	public static void main(String args[])
	{
		int arr[]=new int[5];
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element "+i+arr[i]);
		}
	}
	

}
