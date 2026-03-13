/*Taking input from the user to make a 2-D Array */
import java.util.Scanner;    //importing the Scanner class

public class InputTwoDArrays
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the no. of rows:-");
        int row = scn.nextInt();    //input of no. of rows in Array

        System.out.println("Enter the no. of columns:-");
        int column = scn.nextInt(); //input of no. of columns in Array

        int[][] ar = new int[row][column];    //Array creation

        System.out.println("Enter the elements:");
        for(int i=0; i<row; i++)    //loop for rows
        {
            for(int j=0; j<column; j++)
            {
                ar[i][j] = scn.nextInt();    //loop for columns
            }
        }
        /*Printing the Array:- */
        System.out.println("The array:-");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print(ar[i][j]+ " ");
            }
            System.out.println();    //To change line after the end of each row
        }
        scn.close();
    }    
}
/*Time Complexity: O(row x column) -> 1. No hardcoded no. of Operations in Rows and Columns.
                          -> 2. No hardcoded values.
  
  Space Complexity: O(row x column) -> 1. No hardcoded size whether a Row or Column.
*/