package Task_1.Exceptions;/*
 * Created by Vaishnavi Chaurasia
 * 22-Feb-22
 * 7:24 PM
 * IoT83 Internship
 */

public class Problem_1 {

    public static void main(String args[]){

        try{
            int arr[] = {1,2,3};
            //code that may raise exception
            System.out.println("Elements in array - ");
            for(int i=0 ; i<4 ; i++) {
                System.out.println(arr[i] + " ");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println( "Exception - " + e);
        }
        //rest code of the program
        System.out.println("Next Statement...");
    }

}
