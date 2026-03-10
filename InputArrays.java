/*Array creation to take Input from user for: 1. no. of inputs
                                              2. Array values*/
import java.util.Scanner;    //importing the Scanner class

public class InputArrays
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the no. of inputs: ");
        int size = scn.nextInt();    //Scanning the no. of inputs of Array (entered by user)

        int[] age = new int[size];   //Array creation for storing the Ages

        System.out.println("Enter the Elements of the Array:-");
        for(int i=0; i<size; i++)    //for loop to scan and input the Array values
        {
           age[i] = scn.nextInt();
        }

        System.out.println("Ages-");
        for(int i=0; i<size; i++)    //for loop to print all the values
        {
            System.out.println(age[i]);
        }
        scn.close();
    }    
}
/*Time Complexity = O(n) -> This time the no. of operations is not hardcoded.
                         -> Loops = 2, so O(n+n) = O(2n)
                         -> After eliminating constants, Time Complexity = O(n) 

  Space Complexity = O(n) -> Because the size is also not hardcoded and depends on
                             the User's input. */
