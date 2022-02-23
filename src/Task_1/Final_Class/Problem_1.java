package Task_1.Final_Class;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 10:45 AM
 * IoT83 Internship
 */

/** final class - can't be inherited **/
public final class Problem_1 {

    /** Final variable -  can't be modified **/
    final double PIE = 3.14;

    /** Final method -  can't be override **/
    final void display()
    {
        System.out.println("This is a final method");
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3};

        // final with for-each statement
        // legal statement
        for (final int i : arr)
            System.out.println(i + " ");

    }
}
