package Task_1.Collections;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 12:58 AM
 * IoT83 Internship
 */


import java.util.HashSet;
import java.util.Iterator;

public class Set {

    public static void main(String[] args) {
        /**
         * HashSet class implements Set interface
         **/
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(45);
        set.add(55);
        set.add(65);
        set.add(75);
        set.add(85);

        // Traversing elements
        /**
        Iterator class implements Iterable Interface
         **/
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }
}

