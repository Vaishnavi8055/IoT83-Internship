package Task_1.Collections;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 12:39 AM
 * IoT83 Internship
 */

import java.util.ArrayList;

/** List Interface **/
public class List {

    public static void main(String[] args) {

        /** ArrayList class implements List interface **/
        ArrayList list = new ArrayList();

        list.add(2);
        list.add(2);
        list.add("hello");
        list.add("4.900");
        list.add("World");
        list.add(48);

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        // remove
        list.remove(3);

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i) + " ");
        }

    }

}
