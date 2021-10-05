/***Created By Mohit***/
package sorting;
import java.io.*;
import java.io.BufferedReader;

public class Selection_Sort {
	public void select( int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int minindex=i;
			int minvalue=arr[i];
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<minvalue)
				{
					minindex=j;
					minvalue=arr[j];
				}	
			}
			int temp=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]= temp;
		}
	}
	void print(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.print( arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of elements in the array");
		int n =Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Array before sorting");
		Selection_Sort ss= new Selection_Sort();
		ss.print(arr);
		ss.select(arr);
		System.out.println("arrau after sorting");
		ss.print(arr);
	}

}
