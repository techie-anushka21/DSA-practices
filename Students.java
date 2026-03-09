/*Creating Arrays of different data types. */
/*Will access all elements at once using loops in the upcoming Java Programs. */
/*"Hardcoding" is not preferred in programming but using it just for initial codes. */
public class Students
{
    public static void main(String args[])
    {
        /*Integer Array */
        int[] ages = new int[2];    //declaration
        ages[0] = 34;    //value at 0th index
        ages[1] = 32;    //value at 1st index
        System.out.println(ages[0]);    //accessing element at 0th index
        System.out.println(ages[1]);    //accessing element at 1st index

        /*String Array */
        String[] names = new String[2];
        names[0] = "Surbhi";    //value at 0th index
        names[1] = "Saurabh";   //value at 1st index
        System.out.println(names[0]);    //accessing element at 0th index
        System.out.println(names[1]);    //accessing element at 1st index

        /*Boolean Array */
        boolean[] IsAStudent = new boolean[2];
        IsAStudent[0] = false;    //value at 0th index
        IsAStudent[1] = true;     //value at 1st index
        System.out.println(IsAStudent[0]);    //accessing element at 0th index
        System.out.println(IsAStudent[1]);    //accessing element at 1st index
    }    
}
