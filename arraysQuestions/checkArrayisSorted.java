package StriverAtoZSheet.arraysQuestions;

import java.util.Scanner;

public class checkArrayisSorted 
{
    public static int isSorted(int n, int []arr) 
    {
        // Write your code here.
        for(int i=0;i<n-1;i++)
        {
            if(arr[i+1]<arr[i])
            {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n=s.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter array element valur : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }

        System.out.println(isSorted(n, arr));
    }
    
}
