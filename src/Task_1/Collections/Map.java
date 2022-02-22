package Task_1.Collections;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 1:05 AM
 * IoT83 Internship
 */

import java.util.HashMap;
import java.util.*;
public class Map {

    public static void main(String[] args) {

        /**
         * HashMap class implements Map Interface
         * Consists of Key,Value pair
         */
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        /**
         * Key - ASCII Code
         * Value - Letter
         */
        hm.put(65, "A");
        hm.put(66, "B");
        hm.put(67, "C");
        hm.put(68, "D");
        hm.put(69, "E");
        hm.put(70, "F");

        // Finding the value for a key
        System.out.println("Value for 67  is " + hm.get(67));


    }
}

