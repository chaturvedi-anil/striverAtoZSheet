// Quick Sort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around the picked pivot.
// Given an array arr[], its starting position is low (the index of the array) and its ending position is high(the index of the array).

// Note: The low and high are inclusive.

// Implement the partition() and quickSort() functions to sort the array.

// Example 1:

// Input: 
// N = 5 
// arr[] = { 4, 1, 3, 9, 7}
// Output:
// 1 3 4 7 9
// Example 2:

// Input: 
// N = 9
// arr[] = { 2, 1, 6, 10, 4, 1, 3, 9, 7}
// Output:
// 1 1 2 3 4 6 7 9 10
// Your Task: 
// You don't need to read input or print anything. Your task is to complete the functions partition()  and quickSort() which takes the array arr[], low and high as input parameters and partitions the array. Consider the last element as the pivot such that all the elements less than(or equal to) the pivot lie before it and the elements greater than it lie after the pivot.

// Expected Time Complexity: O(N*logN)
// Expected Auxiliary Space: O(logN)

// Constraints:
// 1 <= N <= 103
// 1 <= arr[i] <= 104


package StriverAtoZSheet.Sorting;

import java.util.Scanner;

public class quickSort 
{
    public static void swap(int arr[],int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int arr[], int low, int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j)
        {
            while(arr[i]<=pivot && i<=high-1)
            {
                i++;
            }
            while(arr[j]>pivot && j >= low+1)
            {
                j--;
            }

            if(i<j)
            {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);
        return j;
    }
	public static void qs(int[] input, int startIndex, int endIndex) 
	{
		if(startIndex<endIndex)
        {
            int ptIndex= partition(input,startIndex,endIndex);

            qs(input, startIndex, ptIndex-1);
            qs(input, ptIndex+1, endIndex);
        }	
	}
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements of the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }

        qs(arr,0, n-1);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }    
}
