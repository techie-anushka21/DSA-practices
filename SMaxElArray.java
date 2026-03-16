/*Finding the Second Largest Element (smax) in an Array */
import java.util.Scanner;    //importing the Scanner class

public class SMaxElArray
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the Size of the Array: ");
        int size = scn.nextInt();    //Scanning the size of Array input by the User

        int[] ar = new int[size];    //Array Creation

        /*Inputting the values of the Array:- */
        System.out.print("Enter the Array Elements: ");
        for(int i=0; i<size; i++)
        {
            ar[i] = scn.nextInt();    //Scanning the Array Elements input by the User
        }

        /*Printing the Array:- */
        System.out.println("Array:-");
        for(int i=0; i<size; i++)    //for loop to print the Array
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        /*Finding the 2nd Largest Element in Array (smax) */
        int max = ar[0];    //Assuming the 1st element of Array as max
        int smax = ar[0];   //Assuming the 1st element of Array as smax

        for(int i=0; i<size; i++)
        {
            if(ar[i] > max)    /*condition to check if there is any other no. greater than
                                 the assumed "max" */
            {
                smax = max;    /*if yes, then the previous max no. becomes smax */
                max = ar[i];   /*and the no. found greater than max becomes the new max 
                                (largest no.) */
            }
            else if(ar[i] > smax && ar[i] != max)    /*the no. in Array is greater than smax
                                                       but is not max */
            {
                smax = ar[i];  //the no. becomes the new smax (2nd largest no. in the Array)
            }
        }
        System.out.println("Largest Element = " + max);
        System.out.println("Second Largest Element = " + smax);

        scn.close();
    }    
}
/*1. Time Complexity = O(n)
  2. Space Complexity = O(n) */