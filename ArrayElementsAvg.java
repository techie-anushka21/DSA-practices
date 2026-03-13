/*Finding the Average of All elements in an Array */

import java.util.Scanner;    //importing the Scanner class

public class ArrayElementsAvg
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Size of Array:-");
        int size = scn.nextInt();    //Scanning the size of Array input by the User

        /*Array Creation:- */
        int[] ar = new int[size];

        /*Inputting the values of the Array:- */
        System.out.println("Enter the Array Elements:-");
        for(int i=0; i<size; i++)
        {
            ar[i] = scn.nextInt();    //Scanning the Array Elements input by the User
        }

        /*Printing the Array:- */
        System.out.print("Array = ");
        for(int i=0; i<size; i++)
        {
            System.out.print(ar[i] + " ");    //for loop to print the Array
        }

        /*Finding the Sum of all Array Elements:- */        
        int sum = 0;
        for(int i=0; i<size; i++)
        {
            sum = sum + ar[i];
        }
        System.out.println("Sum of Array Elements = " + sum);

        /*Finding the Average of all Array Elements:- */  
        double avg = (double) sum/size;
        System.out.println("Average of Array Elements = " + avg);

        scn.close();
    }
}
/*Time Complexity: O(n) + O(n) + O(n) = 3O(n)
  Eliminating the Constants (they are ignored in Big-O Notation), we get: O(n). 
  (n is used because there is no hardcoded no. of operations)
  
  Space Complexity: n elements stored in Array + extra variables taking constant space
                  : O(n) + O(1) = O(n)
*/