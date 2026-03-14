/*Checking the no. of Odd and Even nos. in a 2-D Array */

import java.util.Scanner;    /*importing the Scanner class */

public class Even_and_Odd2
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        /*Inputting the no. of Rows in Array:- */
        System.out.print("Enter the no. of Rows in Array: ");
        int row = scn.nextInt();    //Scanning the no. of Rows

        /*Inputting the no. of Columns in Array:- */
        System.out.print("Enter the no. of Columns in Arrays: ");
        int col = scn.nextInt();    //Scanning the no. of Columns

        int[][] ar = new int[row][col];    //Array Creation

        /*Inputting the Array Elements */
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                ar[i][j] = scn.nextInt();    //Scanning the Elements input into the Array by the user
            }
        }

        /*Printing the Array */
        System.out.println("Array:-");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        int odd=0, even=0;    //initializing 2 variables- 1 for odd, another for even nos.

        /*for loop used so that Each Element of the Array checked */
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(ar[i][j] % 2 == 0)    //condition for Even no.
                {
                    even++;    /*if element found Even, the no. of Even nos. is incremented 
                                 by 1 every time, else no increment */
                }
                if(ar[i][j] % 2 != 0)    //condition for Odd no.
                {
                    odd++;    /*if element found Even, the no. of Odd nos. is incremented 
                                by 1 every time, else no increment */
                }
            }
        }
        /*Printing the Counted Outputs */
        System.out.println("No. of Even nos. in the Array = " + even);
        System.out.println("No. of Odd nos. in the Array = " + odd);
        scn.close();
    }    
}
/*1. Time Complexity = O(row x col)
  2. Space Complexity = O(row x col) */