/*Reversing an Array of integers (here it will be input no. of users' ages) */
import java.util.Scanner;    //importing the Scanner class

public class ArrayReversal
{
    public static void main(String args[])
    {
        System.out.print("Enter the no. of people: ");
        
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();    //taking input for no. of people

        int[] ages = new int[size];  //array creation

        System.out.print("Enter the Ages of the people: ");
        for(int i=0; i<size; i++)
        {
            ages[i] = scn.nextInt(); //input the ages of the input no. of people
        }

        /*Original Array- before reversal */
        System.out.print("Ages Array: ");
        for(int i=0; i<size; i++)
        {
            System.out.print(ages[i]+" ");    //printing the ages
        }
        System.out.println();

        /*Reversed Array- After reversal */
        System.out.print("Reversed Ages Array: ");
        for(int i=size-1; i>=0; i--)
        {
            System.out.print(ages[i]+" ");    //printing the ages in reverse order
        }
        scn.close();
    } 
}