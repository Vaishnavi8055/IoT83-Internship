package Task_1.MethodOverriding;/*
 * Created by Vaishnavi Chaurasia
 * 22-Feb-22
 * 11:33 PM
 * IoT83 Internship
 */

/** child class extends parent class **/
public class FirstYear extends Student {

    public String displayName(){
        return "Alok";
    }


    public int displayAge(int age){
        return age;
    }

    public static void main(String[] args) {

        Student student = new FirstYear();

        System.out.println( student.displayName() );

        System.out.println( student.displayAge(30) );

    }

}
