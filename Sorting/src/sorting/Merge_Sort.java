/***Created By Mohit***/
package sorting;
import java.util.Scanner;
public class Merge_Sort 
{
	//first divide the arr[] into two parts and merge it 
	// first subarray is arr[l..m] l is start and m is mid
	// second subarray is arr[m+1...r]from mid to end (r)
	void merge(int arr[],int l,int m,int r)//start ,mid, end
	{
		//find the sizes of the two subarrays to be merged
		int n1=m-l+1;
		int n2=r-m;
		//create temp arrays for two parts
		int L[]=new int [n1];
		int R[]=new int [n2];
		//copy data to temp arrays
		for(int i=0;i<n1;++i)
		{
			L[i]=arr[l+i];
		}
		for(int j=0;j<n2;++j)
		{
			R[j]=arr[m+1+j];
		}
		//merge the temp arrays
		int i=0,j=0;
		int k=l;//initialise index of the merged subarray
		while (i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else
			{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		/*copy remaining elements of L[] if any*/
		while (i<n1)
		{
			arr[k]=L[i];
			i++;
			k++;
		}
		/*copy remaining elements pf R[] if any*/
		while(j<n2)
		{
			arr[k]=R[j];
			j++;
			k++;
		}
	}
	void sort (int arr[],int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;//find the middle element 
			//sort first and second halves
			sort(arr,l,m);
			sort(arr,m+1,r);
			//merge the sorted halves
			merge(arr,l,m,r);
			
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

	public static void main(String[] args)throws Exception 
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
	     Merge_Sort ms=new Merge_Sort();
	     System.out.println("Array before sorting (merge sort) ");
	     ms.print(arr);
	     ms.sort(arr,0,n-1);
	     System.out.println("Array after sorting  (merge sort) ");
	     ms.print(arr); 
	     sc.close();

	}

}
