package Task_1.SortCollection;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 1:20 AM
 * IoT83 Internship
 */

import Task_1.Encapsulation.Student;

import java.util.ArrayList;
import java.util.Collections;

/** Sort the collection by univRollNo **/
public class StudentDetails implements Comparable<StudentDetails> {

    private String name;
    private int univRollNo;
    private int libCode;

    public StudentDetails(String name, int univRollNo, int libCode) {
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

    /** compareTo method **/
    @Override
    public int compareTo(StudentDetails o) {
        return this.univRollNo - o.getUnivRollNo();
    }

    public static void main(String[] args) {

        ArrayList<StudentDetails> details = new ArrayList<StudentDetails>();

        details.add(new StudentDetails("Jhanvi" , 129 , 7845));
        details.add(new StudentDetails("Arun" , 54 , 678));
        details.add(new StudentDetails("Shweta", 12 , 124));
        details.add(new StudentDetails("Muskan", 14 , 126));
        details.add(new StudentDetails("Vaishnavi", 4 , 129));


        Collections.sort(details);

        for (StudentDetails s: details) {

            System.out.println(s.getName() + " " + s.getUnivRollNo() +" " + s.getLibCode());

        }
    }
}
