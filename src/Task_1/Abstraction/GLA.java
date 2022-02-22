package Task_1.Abstraction;/*
 * Created by Vaishnavi Chaurasia
 * 22-Feb-22
 * 6:58 PM
 * IoT83 Internship
 */

/** child class inherit abstract class **/
public class GLA extends Students {

    @Override
    String collegeName() {
        return "GLA";
    }

    @Override
    String location() {
        return "Mathura";
    }

    public static void main(String[] args) {

        Students students = new GLA();

        // call to abstract method
        System.out.println(students.collegeName());
        System.out.println(students.location());

        // call to non-abstract method
        students.display();

    }

}
