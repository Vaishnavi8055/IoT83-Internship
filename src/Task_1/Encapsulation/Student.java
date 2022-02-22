package Task_1.Encapsulation;/*
 * Created by Vaishnavi Chaurasia
 * 22-Feb-22
 * 4:04 PM
 * IoT83 Internship
 */

public class Student {

    /*** private variables ***/
    private int stuRollNo;
    private  String name;
    private int stuID;

    /*** Non-Parameterised Constructor ***/
    public Student() {
        this.stuRollNo = stuRollNo;
        this.name = name;
        this.stuID = stuID;
    }

    /*** Getter and Setter methods ***/
    public int getStuRollNo() {
        return stuRollNo;
    }

    public void setStuRollNo(int stuRollNo) {
        this.stuRollNo = stuRollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }


    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Vaishnavi");
        student.setStuRollNo(181500777);
        student.setStuID(56);

        System.out.println("Student Name - " + student.getName() + "\n" + "Student Roll Number - " + student.getStuRollNo()
            + "\n"  + "Student ID - " + student.getStuID() );

    }
}
