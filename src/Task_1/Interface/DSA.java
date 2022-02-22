package Task_1.Interface;/*
 * Created by Vaishnavi Chaurasia
 * 22-Feb-22
 * 5:13 PM
 * IoT83 Internship
 */

public class DSA implements Subjects{


    @Override
    public String displaySubName() {
        return "Data Structures";
    }

    @Override
    public int displayMarks() {
        return 40;
    }

    public static void main(String[] args) {

        DSA sub = new DSA();

        sub.displaySubName();
        sub.displayMarks();

        System.out.println(sub.displaySubName());
        System.out.println(sub.displayMarks());

    }
}
