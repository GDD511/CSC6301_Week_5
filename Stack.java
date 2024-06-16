package duvallg.linkedlistproject;

//import java.util.Stack;

/**
 * Collects data from user input to create a stack, which is then 
 * sorted and printed.
 * 
 * A project to demonstrate modularization. This code was an example of code
 * reusability, with input, sorting, and printing completed using the files
 * generated in the Week 4 project for the LinkedList. This reduced duplication 
 * of code. Also, use of the java utilities for Stack, Scanner, and Collections,
 * relies on the built-in functionality of java, reducing overhead for these 
 * tasks. By relying on these already established lines of code, this week's
 * project required minimal new code and updates to the documentation to convert
 * the linked list project into a stack project.
 * 
 * This was compiled on Command line using javac -d. *.java;
 * then run on Command line using java Stack.java.
 * 
 * JavaDocs created on Command line using javadoc -d docs *.java.
 * 
 * @author Gwendolyn Duvall
 * @version 2.0
 * @since 6/1/2024 CSC6301 Week 5
 */
public class Stack {
    
    /**
     * Constructs a new Stack object.
     */
    public Stack(){
        // Default constructor, no additional setup needed.
    };

    /**
     * Creates a stack of integers from user input, sorts the stack
     * in ascending order, prints the sorted stack, pops the top element
     * from the stack, and peeks at the remaining top element.
     * 
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        java.util.Stack<Integer> s = Input.getInput();
        System.out.println("Sorting your stack...");
        java.util.Stack<Integer> sortedStack = Sorter.sort(s);
        System.out.println("Your sorted stack is: ");
        Printer.print(sortedStack);
        System.out.println("Removing top element from the stack...");
        System.out.println("The element removed is: " + sortedStack.pop());
        System.out.println("Now the top element is: " + sortedStack.peek());
    }
}
