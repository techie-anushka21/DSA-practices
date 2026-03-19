/*Accessing the element of the index entered by the User in 1-D Array. */
import java.util.Scanner;    //importing the Scanner class

class Access
{
    void elementSearch(Scanner scn)
    {
        /*Inputting the Size of the Array */
        System.out.print("Enter the no. of inputs: ");
        int size = scn.nextInt();    //Scanning the input size

        int[] ar = new int[size];    //Array Creation

        System.out.print("Enter the Array elements: ");
        for(int i=0; i<size; i++)
        {
            ar[i] = scn.nextInt();
        }

        /*Inputting the Array Elements */
        System.out.println("The Array:-");
        for(int i=0; i<size; i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        /*Accessing the Element */
        System.out.print("Enter the index whose element you want to access: ");
        int index = scn.nextInt();    //Scanning the index input by the User
        boolean isThere = false;    /*boolean variable inittially set to "false"
                                      assuming the index is invalid */
        for(int i=0; i<size; i++)
        {
            if(i==index)    //if the index is valid
            {
                isThere = true;    //isThere is set to "true"
                System.out.println("Index valid, the element is here is: " + ar[i]);
                break;
            }
        }
        if(!isThere)    //if the index is invalid
        {
            System.out.println("Invalid index, try again!");
        }
    }
}
public class ArrayElAccess
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        Access obj = new Access();
        obj.elementSearch(scn);

        scn.close();
    }
}
/*Time Complexity = O(n)
  Space Complexity = O(n) + O(1) = O(n) */