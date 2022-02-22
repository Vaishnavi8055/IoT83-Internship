package Task_1.Abstraction;/*
 * Created by Vaishnavi Chaurasia
 * 22-Feb-22
 * 6:56 PM
 * IoT83 Internship
 */

/** abstract class **/
abstract class Students {

    /** abstract method **/
    abstract String collegeName();

    abstract String location();

    /** non-abstract method **/
    void display() {
        System.out.println("Welcome");
    }

}
