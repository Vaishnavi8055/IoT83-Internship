package Task_1.SortCollection;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 9:24 AM
 * IoT83 Internship
 */

import java.util.Comparator;

public class SortByLibCode implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLibCode() - o2.getLibCode();
    }
}
