/*Copying the elements of one Array to another Array */
import java.util.Scanner;    //importing the Scanner class

public class Copy_Array
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the no. of Rows: ");
        int row = scn.nextInt();    //Scanning the no. of Rows

        System.out.print("Enter the no. of Columns: ");
        int col = scn.nextInt();    //Scanning the no. of Columns

        int[][] ar1 = new int[row][col];    //Original Array

        /*Inserting elements into the Array using for loop. i for rows and j for columns*/
        System.out.println("Enter the Elements of the Array:-");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                ar1[i][j] = scn.nextInt();    //Scanning the values input by the User
            }
        }

        /*Printing the Original Array:- */
        System.out.println("The Array:- ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(ar1[i][j] + " ");
            }
            System.out.println();
        }

        /*Creating another Array (The elements will be copied to this Array:-) */
        int[][] ar2 = new int[row][col];
         
        /*The 2nd Array is initialized as 0 (by default) and the 1st Array is 
          copied to the 2nd Array by adding its elements to Array 2 which is 0 initially */
        System.out.println("The Copied Array:- ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                ar2[i][j] = ar2[i][j] + ar1[i][j];
                System.out.print(ar2[i][j] + " ");
            }
            System.out.println();
        }
        scn.close();
    }    
}
/*Time Complexity: O(row x col)
  In case of Square Matrix: O(n^2)
  
  Space Complexity: O(row x col)
  In case of Square Matrix: O(n^2)
*/