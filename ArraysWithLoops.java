/*Accessing all the Array elements together using for loop- Part 1 (Integer data) */
public class ArraysWithLoops
{
    public static void main(String args[])
    {
        int[] age = new int[3];    //array creation
        age[0] = 45;    //age value for 1st index;
        age[1] = 42;    //age value for 2nd index;
        age[2] = 47;    //age value for 3rd index;

        System.out.println("Ages of 3 Employees are as follows:-");

        for(int i=0; i<3; i++)    //for loop to print ages of all the 3 Employees
        {
            System.out.println(age[i]);
        }

        System.out.println("Ages of the 1st 2 Employees:-");

        for(int i=0; i<2; i++)    //for loop to print ages of all the 3 Employees
        {
            System.out.println(age[i]);
        }
    }    
}