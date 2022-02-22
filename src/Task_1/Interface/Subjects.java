package Task_1.Interface;/*
 * Created by Vaishnavi Chaurasia
 * 22-Feb-22
 * 4:46 PM
 * IoT83 Internship
 */

/** Interface fields are public, static and final by default, and the methods are public and abstract. **/
public interface Subjects {

    /** final variable **/
    int numberOfSubject = 1;

    /** abstract  method **/
    public String displaySubName();

    public int displayMarks();

}
