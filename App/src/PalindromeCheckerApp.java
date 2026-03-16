import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);     // FIFO
            stack.push(ch);    // LIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        for(int i = 0; i < input.length(); i++) {

            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if(fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if(isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}