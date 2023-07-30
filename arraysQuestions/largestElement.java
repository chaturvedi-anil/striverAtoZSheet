package StriverAtoZSheet.arraysQuestions;

import java.util.Scanner;

public class largestElement {
    static int largestElement(int[] arr, int n) 
    {
        // Write your code here.
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
            }
        }
        
        return max;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n=s.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter array element valur : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }

        System.out.println(largestElement(arr,n));
    }    
}
