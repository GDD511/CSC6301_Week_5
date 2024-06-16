package duvallg.linkedlistproject;

import java.util.Stack;
import java.util.Scanner;

/**
 * Receives and manages user input to create a stack.
 * 
 * @author Gwendolyn Duvall
 * @version 1.0
 * @since 6/1/2024 CSC6301 Week 4 
 */
public class Input {
    
    /**
     * Constructs a new Input object.
     */
    public Input(){
        // Default constructor, no additional setup needed.
    }
    
    /**
     * Prompts user for input, integers added to list. 
     * User enters 'done' to complete the list.
     * 
     * @exception NumberFormatException notifies user of invalid input
     * @return the stack created from data from user
     */

    public static Stack<Integer> getInput() {
    /**
     * Constructor for a stack object.
     */
        Stack<Integer> s = new Stack<>();
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("""
                           Enter an integer to add to the list. Press 'ENTER' \
                           after each number.
                           \tEnter 'done' to complete.""");
        String input = scanner.nextLine();   
        while (!input.equalsIgnoreCase("done")) {
            // Parse the input string as an integer
            int num;
            try {
                num = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer "
                    + "or 'done' to complete.");
                input = scanner.nextLine();
                continue;
            }
            s.push(num);
            input = scanner.nextLine();
            }
        }
        return s;
    }
}