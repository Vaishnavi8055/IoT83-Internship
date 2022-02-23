package Task_1.SortCollection;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 9:22 AM
 * IoT83 Internship
 */

import java.util.Comparator;

public class SortByName implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
