// Input: 5

// Output:
// * 
// * * 
// * * * 
// * * * * 
// * * * * *

// Constraints:
// 1<= N <= 20

import java.util.Scanner;

public class printStarsTriangle 
{
    static void printTriangle(int n) 
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
    
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("n= ");
        int n=s.nextInt();
        printTriangle(n);

        s.close();
    }
}
