/**
 *  Java program to crete, update, and delete data from TreeSet.
 */

package com.mycollections;

import java.util.Set;
import java.util.TreeSet;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an instance of TreeSet.
        Set<Character> mySet = new TreeSet<>();

        // Add.
        mySet.add('v');
        mySet.add('w');
        mySet.add('g');
        mySet.add('e');
        mySet.add('s');
        mySet.add('k');
        mySet.add('f');
        mySet.add('l');

        // Print.
        System.out.println(mySet); // Output: [e, f, g, k, l, s, v, w]

        // Update.
        mySet.add('f');
        mySet.add('a');
        mySet.add('b');
        mySet.add('n');
        mySet.add('m');

        // Print.
        System.out.println(mySet); // Output: [a, b, e, f, g, k, l, m, n, s, v, w]

    }
}