package StriverAtoZSheet.arraysQuestions;

import java.util.Scanner;

public class secondLargest 
{
    public static int secLargest(int arr[], int n)
    {   
        return 0;
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

        System.out.println(secLargest(arr,n));
    }    
}
