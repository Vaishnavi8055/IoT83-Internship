package Task_1.MethodOverloading;
/*
 * Created by Vaishnavi Chaurasia
 * 22-Feb-22
 * 6:17 PM
 * IoT83 Internship
 */

public class Addition {

    /** static method **/
    public static int add(int val1 , int val2){
        return val1 + val2;
    }

    public static double add(double val1 , int val2){
        return val1 + val2;
    }

    public static double add(double val1 , double val2){
        return val1 + val2;
    }

    public static void main(String[] args) {

        System.out.println(add(1,1));

        System.out.println(add(1.2 , 4));

        System.out.println(add(2.2 , 2.2));


    }

}
