/*Checking the no. of Odd and Even nos. in a 1-D Array */

import java.util.Scanner;    /*importing the Scanner class */
public class Even_Odd
{
    public static void main(String args[])
    {
        /*Inputting Size of the Array */
        System.out.print("Enter the size of the Array: ");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();    //Scanning the Input Size

        /*Array Creation */
        int[] ar = new int[size];

        /*Inputting the Array Elements */
        System.out.println("Enter the Array Elements:-");
        for(int i=0; i<size; i++)
        {
            ar[i] = scn.nextInt();  //Scanning the Elements input into the Array by the user
        }

        /*Printing the Array */
        System.out.println("Array:-");
        for(int i=0; i<size; i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        int odd=0, even=0;    //initializing 2 variables- 1 for odd, another for even nos.

        for(int i=0; i<size; i++)    /*for loop used so that Each Element of the Array is
                                       checked */ 
        {
            if(ar[i] % 2 == 0)    //condition for Even no.
            {
                even++;    /*if element found Even, the no. of Even nos. is incremented 
                             by 1 every time, else no increment */
            }
            if(ar[i] % 2 != 0)
            {
                odd++;    /*if element found Even, the no. of Odd nos. is incremented 
                            by 1 every time, else no increment */
            }
        }
        /*Printing the Counted Outputs */
        System.out.println("No. of Even nos. in the Array = " + even);
        System.out.println("No. of Odd nos. in the Array = " + odd);

        scn.close();
    }    
}