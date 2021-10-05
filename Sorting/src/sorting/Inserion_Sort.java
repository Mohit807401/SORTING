/***Created By Mohit***/
package sorting;
import java.util.Scanner;
public class Inserion_Sort {
	void sort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;++i)
		{
			int value=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>value)//move the elements of array ,that are greater than the key ,to one pos ahead of their current pos
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=value;
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
     System.out.println("Array before sorting (Insertion sort) ");
     ss.print(arr);
     Inserion_Sort is=new Inserion_Sort();
     is.sort(arr);
     System.out.println("Array after sorting  (Insertion sort) ");
     ss.print(arr); 
     sc.close();
	}

}
