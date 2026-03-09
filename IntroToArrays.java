/*Understanding basic syntax of Arrays in Java */
/*Syntax: data_type[] array_name = new data_type[size]; */

/*Array to store marks of 3 subjects */

public class IntroToArrays
{
    public static void main(String args[])
    {
        int[] marks = new int[3];    //Array declaration

        marks[0] = 97;     //marks of 1st subject
        marks[1] = 98;     //marks of 2nd subject
        marks[2] = 100;    //marks of 3rd subject
        
        /*Accessing all the elements (marks) of the Array Separately */
        System.out.println("Subject 1 = " + marks[0]);
        System.out.println("Subject 2 = " + marks[1]);
        System.out.println("Subject 3 = " + marks[2]);
    }    
}