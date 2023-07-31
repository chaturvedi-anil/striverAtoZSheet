// Input: 5

// Output:
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

import java.util.Scanner;

public class printStarsSquare 
{
    public static void printSquare(int n) 
    {   
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
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
        printSquare(n);

        s.close();
    }    
}
