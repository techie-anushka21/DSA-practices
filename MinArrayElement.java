/*Finding the Smallest (min) element in an Array */
import java.util.Scanner;    //importing the Scanner class

public class MinArrayElement
{
    public static void main(String args[])
    {
        /*Taking size of the Array from the User */
        System.out.print("Enter the size of the Array: ");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();    //Scanning the size input from User

        int[] ar = new int[size];    //Array Creation

        /*Taking Array elements from the User */
        System.out.print("Enter the Array Elements: ");
        for(int i=0; i<size; i++)
        {
            ar[i] = scn.nextInt();    //Scanning the Elements input
        }

        /*Printing the Array */
        System.out.println("Array:-");
        for(int i=0; i<size; i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        /*Finding the smallest(min) element */
        int min = ar[0];    //Assume the 1st element at 0th index as min
        for(int i=0; i<size; i++)    //Use for loop so that every element is checked
        {
            if(ar[i] < min)    /*using if statement, check if any element is lesser than 
                                 the assumed min element */
            {
                min = ar[i];    /*if yes, then assign that element to the min variable */
            }
        }
        System.out.println("Smallest Element of the Array = " + min);

        scn.close();
    }
}
/*1. Time Complexity = O(n)
  2. Space Complexity = O(n) + O(1) = O(n) */