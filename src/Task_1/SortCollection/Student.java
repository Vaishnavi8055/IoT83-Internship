package Task_1.SortCollection;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 9:19 AM
 * IoT83 Internship
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {

    private String name;
    private int univRollNo;
    private int libCode;

    public Student(String name, int univRollNo, int libCode) {
        this.name = name;
        this.univRollNo = univRollNo;
        this.libCode = libCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnivRollNo() {
        return univRollNo;
    }

    public void setUnivRollNo(int univRollNo) {
        this.univRollNo = univRollNo;
    }

    public int getLibCode() {
        return libCode;
    }

    public void setLibCode(int libCode) {
        this.libCode = libCode;
    }


    public static void main(String[] args) {

        ArrayList<Student> details = new ArrayList<Student>();

        details.add(new Student("Jhanvi", 129, 7845));
        details.add(new Student("Arun", 54, 678));
        details.add(new Student("Shweta", 12, 124));
        details.add(new Student("Muskan", 14, 126));
        details.add(new Student("Vaishnavi", 4, 129));

        /** Sort by Name **/
        SortByName byName = new SortByName();
        Collections.sort(details, byName);

        for (Student s : details) {

            System.out.println(s.getName() + " " + s.getUnivRollNo() + " " + s.getLibCode());

        }

        System.out.println();

        /** Sort by LibCode **/
        SortByLibCode byCode = new SortByLibCode();
        Collections.sort(details, byCode);

        for (Student s : details) {

            System.out.println(s.getName() + " " + s.getUnivRollNo() + " " + s.getLibCode());

        }

    }
}
