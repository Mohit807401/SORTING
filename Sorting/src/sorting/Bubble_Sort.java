/***Created By Mohit***/
package sorting;
import java.util.Scanner;
public class Bubble_Sort 
{
	void sort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			if (arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter the no of elements in the array");
	     int n=sc.nextInt();
	     int arr[]=new int[n];
	     System.out.println("enter the elements of array");
	     for (int i=0;i<n;i++)
	     {
	    	 arr[i]=sc.nextInt();
	        
	     }
	     Selection_Sort ss= new Selection_Sort();
	     System.out.println("Array before sorting (Bubble sort) ");
	     ss.print(arr);
	     Bubble_Sort bs=new Bubble_Sort();
	     bs.sort(arr);
	     System.out.println("Array after sorting  (Bubble sort) ");
	     ss.print(arr); 
	     sc.close();
	}

}
