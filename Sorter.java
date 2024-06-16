package duvallg.linkedlistproject;

import java.util.Stack;
import java.util.Collections;

/**
 *  Sorts the stack in ascending order.
 * 
 * @author Gwendolyn Duvall
 * @version 1.0
 * @since 6/1/2024 CSC6301 Week 4
 */
public class Sorter {
    
    /**
     * Constructs a new Sorter object.
     */
    public Sorter(){
        // Default constructor, no additional setup needed.
    }
    
     /**
      * Sorts the stack in ascending order.
      * 
      * @param list the stack of integers to be sorted
      * @return the sorted stack
      */
    public static Stack<Integer> sort(Stack<Integer> list) {
        if (!list.isEmpty()) {
            Collections.sort(list);
        }
    return list;    
    }
    
}