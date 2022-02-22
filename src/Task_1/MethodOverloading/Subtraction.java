package Task_1.MethodOverloading;/*
 * Created by Vaishnavi Chaurasia
 * 22-Feb-22
 * 6:17 PM
 * IoT83 Internship
 */

public class Subtraction {

    /** non-static method **/
    public int sub(int val1 , int val2){
        return val1 - val2;
    }

    public double sub(double val1 , int val2){
        return val1 - val2;
    }

    public double sub(double val1 , double val2){
        return val1 - val2;
    }

    public static void main(String[] args) {

        Subtraction subtraction = new Subtraction();

        System.out.println(subtraction.sub(1,1));

        System.out.println(subtraction.sub(1.2 , 4));

        System.out.println(subtraction.sub(2.2 , 2.2));

    }

}
