/*Accessing all the Array elements together using for loop- Part 2 (String data) */
public class ArrayWithLoops2
{
    public static void main(String args[])
    {
        String[] names = new String[4];    //array creation
        names[0] = "Ajit";       //names value for 1st index;
        names[1] = "Aadya";      //names value for 2nd index;
        names[2] = "Saurabh";    //names value for 3rd index; 
        /*names value for 4th index not assigned- upon accessing,
         we get index 3's values as "null" */
        
        for(int i=0; i<4; i++)    //for loop to print names of all the 3 People
        {
            System.out.println(names[i]);
        }
        /*Finding the length of the Array using the "length" property 
          SYNTAX: array_name.length*/
          System.out.println(names.length);
    }    
}
/*Time Complexity: O(1) -> Because no. of operations are fixed (hardcoded)
  Space Complexity: O(1) -> Because the size of Array is fixed (hardcoded)*/