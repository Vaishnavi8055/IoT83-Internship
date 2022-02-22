package Task_1.Exceptions;/*
 * Created by Vaishnavi Chaurasia
 * 22-Feb-22
 * 10:10 PM
 * IoT83 Internship
 */

public class Problem_3 {

    public static void main(String[] args) {

            int n1 = 4;
            int n2 = 5;

            int res = n1 / n2;

            if (n2 == 0) {
                throw new ArithmeticException("Number cannot be divided by 0");
            } else {
                System.out.println(res);
            }


    }
}
