/*2-D Arrays in Java */
/*Values and size are hardcoded because it is just an intro to 2-D Arrays, 
  will be taking input for both the values from the user in upcoming programs */

/*Marks of 4 Students:- */
public class TwoDArrays
{
    public static void main(String args[])
    {
        int[][] marks = new int[2][2];    //array creation
        
        marks[0][0] = 96;    //student 1
        marks[0][1] = 97;    //student 2
        marks[1][0] = 91;    //student 3
        marks[1][1] = 94;    //student 4

        /*Printing the 2-D Array using for loop */
        System.out.println("Marks of 4 students:-");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.println(marks[i][j]);
            }
        }
    }    
}
/*1. Time Complexity = O(1)
  2. Space Complexity = O(1) */