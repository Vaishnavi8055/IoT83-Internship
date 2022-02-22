package Task_1.Interface;/*
 * Created by Vaishnavi Chaurasia
 * 22-Feb-22
 * 4:50 PM
 * IoT83 Internship
 */

public class DBMS implements Subjects {

    @Override
    public String displaySubName() {
        return "DBMS";
    }

    @Override
    public int displayMarks() {
        return 35;
    }

    public static void main(String[] args) {

        DBMS sub = new DBMS();

        sub.displaySubName();
        sub.displayMarks();

        System.out.println(sub.displaySubName());
        System.out.println(sub.displayMarks());

    }
}
