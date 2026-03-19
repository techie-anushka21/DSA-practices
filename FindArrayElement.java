/*Finding element input by the user using Linear Search in 1-D Array. */
import java.util.Scanner;    //importing the Scanner class

public class FindArrayElement
{
    public static void main(String args[])
    {
        /*Inputting the Size of the Array */
        System.out.print("Enter the Size of the Array: ");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();    //Scanning the input size

        int[] ar = new int[size];    //Array Creation

        /*Inputting the Array Elements */
        System.out.print("Enter the Array Elements: ");
        for(int i=0; i<size; i++)
        {
            ar[i] = scn.nextInt();    //Scanning the input elements        
        }

        /*Printing the Array */
        System.out.println("Array:- ");
        for(int i=0; i<size; i++)
        {
            System.out.print(ar[i] + " ");            
        }
        System.out.println();

        /*Searching the Element */
        boolean found = false;    //Assume that the Element is "NOT FOUND"
        System.out.print("Enter the element you want to find: ");
        int element = scn.nextInt();    /*variable creation and Scanning the Element needed
                                          to be found */
        for(int i=0; i<size; i++)
        {
            if(ar[i]==element)    //checking if any Matrix element matches input
            {
                found = true;
                System.out.println("Elememt found at index: " + i);
                break;
            }
        }
        if(!found)    //if element id not found
        {
            System.out.println("Element not found, try again!");
        }
        scn.close();
    }
}
/*1. Time Complexity = O(n)
  2. Space Complexity = O(n) + O(1) = O(n)*/