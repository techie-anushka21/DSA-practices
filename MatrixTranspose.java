/*Transpose of a Matrix */
import java.util.Scanner;    //importing the Scanner class
public class MatrixTranspose
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        /*Inputting and Scanning the Size of the Rows and Columns */
        System.out.print("Enter the no. of Rows: ");
        int row = scn.nextInt();
        System.out.print("Enter the no. of Columns: ");
        int col = scn.nextInt();

        int[][] matrix =  new int[row][col];    //Array Creation

        /*Inputting the Array Elements */
        System.out.print("Enter the Array Elements: ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                matrix[i][j] = scn.nextInt();    //Scanning the input elements    
            }
        }

        /*Printing the Array */
        System.out.println("The Array:-");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        /*Transpose */
        System.out.println("Transpose of the Matrix:-");
        for(int j=0; j<col; j++)
        {
            for(int i=0; i<row; i++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        /*We know that after Transpose the "Rows become Columns" and "Columns become Rows"
          so during Transpose just "Apply the col (columns) loop first and then a nested for 
          loop containing the row (rows)" */

        scn.close();
    }        
}
/*Time Complexity = O(row x col)
  Space Complexity = O(row x col) */