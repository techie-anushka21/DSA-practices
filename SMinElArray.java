/*Finding the Second Smallest Element (smin) in an Array */
import java.util.Scanner;    //importing the Scanner class

public class SMinElArray
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the Size of the Array: ");
        int size = scn.nextInt();    //Scanning the size of Array input by the User

        int[] matrix = new int[size];    //Array Creation

        /*Inputting the values of the Array:- */
        System.out.print("Enter the Array Elements: ");
        for(int i=0; i<size; i++)
        {
            matrix[i] = scn.nextInt();    //Scanning the Array Elements input by the User
        }

        /*Printing the Array:- */
        System.out.println("Array:-");
        for(int i=0; i<size; i++)    //for loop to print the Array
        {
            System.out.print(matrix[i] + " ");
        }
        System.out.println();

        /*Finding the 2nd Smallest Element in Array (smin) */
        int min = matrix[0];    //Assuming the 1st element of Array as min
        int smin = matrix[0];   //Assuming the 1st element of Array as smin

        for(int i=0; i<size; i++)
        {
            if(matrix[i] < min)    /*condition to check if there is any other no. lesser 
                                     than the assumed "min" */
            {
                smin = min;         /*if yes, then the previous min no. becomes smin */
                min = matrix[i];    /*and the no. found lesser than min becomes the new min 
                                      (smallest no.) */
            }
            else if(matrix[i] < smin && matrix[i] != min)    /*the no. in Array is lesser 
                                                               than smin but is not min */
            {
                smin = matrix[i];   //the no. becomes the new smin (2nd smallest no. in the Array)
            }
        }
        System.out.println("Smallest no. in the Array = " + min);
        System.out.println("2nd Smallest no. in the Array = " + smin);

        scn.close();
    }    
}
/*1. Time Complexity = O(n)
  2. Space Complexity = O(n) */