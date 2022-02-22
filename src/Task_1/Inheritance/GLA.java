package Task_1.Inheritance;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 12:00 AM
 * IoT83 Internship
 */

public class GLA extends Colleges {

   public int NumberofStudents(){
       return 1100;
   }

    public static void main(String[] args) {

       // Colleges colleges = new GLA();
        GLA colleges = new GLA();

       String name =  colleges.collegeName("GLA");
       String loc =  colleges.collegeLocation("Mathura");
       String grade =  colleges.collegeGrade("A");
       int no = colleges.NumberofStudents();

        System.out.println(name);
        System.out.println(loc);
        System.out.println(grade);
        System.out.println(no);

    }

}
