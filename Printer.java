package duvallg.linkedlistproject;

import java.util.Stack;

/**
 * Prints the stack.
 * 
 * @author Gwendolyn Duvall
 * @version 1.0
 * @since 6/1/2024 CSC6301 Week 4
 */
public class Printer {
     /**
      * Constructs a new Printer object.
      */
    public Printer(){
        // Default constructor, no additional setup needed.
    }
    
    /**
     * Prints the provided stack of integers. The user is notified if the
     * stack is empty.
     * 
     * @param list the list of integers to be printed
     */
    public static void print(Stack<Integer> list){
       if (!list.isEmpty()) {
           System.out.println("The stack: " + list);
       } else {
           System.out.println("The stack is empty.");
       }
    }
}
