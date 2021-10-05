/***Created By Mohit***/
package sorting;
import java.util.Scanner;
public class Shell_Sort 
{
	
	int sort(int arr[])
    {
        int n = arr.length;
 
        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1)
            {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];
 
                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
 
                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }
        }
        return 0;
    }
	
    /*void sort(int arr[])
	{
		int n=arr.length;
		int interval=1;// interval is the gap we will take ,we start with a big gap and then reduce the gap
		while (interval<=n/3)//calculating interval using knuth's formula		
		{
			interval=interval*3+1;
		}
		while (interval>0)
		{//doing gapped insertion sort for this gap size 
			for(int i=interval;i<n;i++)
			{//i=outer
				int valuetoinsert=arr[i];//add a[i] to the elemnts that have been gap sorted
				int j=i;//j=inner
				while (j>interval-1 && arr[j-interval]>=valuetoinsert)
				{//shifting elemnts towards right
					arr[j]=arr[j-interval];
					j=j-interval;
				}
			}
			interval=(interval-1)/3;
		}
	}*/

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
	     System.out.println("Array before sorting (Shell  sort) ");
	     ss.print(arr);
	     Shell_Sort SS= new Shell_Sort();
	     SS.sort(arr);
	     System.out.println("Array after sorting  (Shell  sort) ");
	     ss.print(arr); 
	     sc.close();

	}

}
