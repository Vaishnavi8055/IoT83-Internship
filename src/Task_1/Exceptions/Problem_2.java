package Task_1.Exceptions;/*
 * Created by Vaishnavi Chaurasia
 * 22-Feb-22
 * 9:45 PM
 * IoT83 Internship
 */

public class Problem_2 {

    public static void main(String[] args) {

        try {

            String str = null;
            System.out.println(str.length());

        } catch (NullPointerException e) {

            System.out.println("Exception - " + e);

        }
        /** This block always executes **/
        finally{
            String s = "hello";
            System.out.println(s);
        }
        //rest code of the program
        System.out.println("Next Statement...");
    }
}
