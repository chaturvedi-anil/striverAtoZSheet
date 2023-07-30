package StriverAtoZSheet.Sorting;
import java.util.*;
public class recursiveBubbleSort 
{
    public static void bubbleSort(int []arr,int i, int n)
    {
        if(n==0)
        {
            return;
        }

        if(i<n-1)
        {
            if(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            bubbleSort(arr, i+1,n);
        }
        else
        {
            bubbleSort(arr,0,n-1);
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

        bubbleSort(arr,0, n);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
