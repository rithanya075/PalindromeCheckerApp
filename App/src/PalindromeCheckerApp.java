import java.util.Stack;

public class PalindromeCheckerApp {

    // Method 1: Reverse String
    public static boolean reverseMethod(String str) {
        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equals(reversed);
    }

    // Method 2: Stack Method
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            stack.push(c);
        }

        for(char c : str.toCharArray()) {
            if(c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Two Pointer Method
    public static boolean twoPointerMethod(String str) {

        int start = 0;
        int end = str.length() - 1;

        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "madam";

        // Reverse Method Timing
        long startTime = System.nanoTime();
        boolean r1 = reverseMethod(input);
        long endTime = System.nanoTime();
        System.out.println("Reverse Method Time: " + (endTime - startTime) + " ns");

        // Stack Method Timing
        startTime = System.nanoTime();
        boolean r2 = stackMethod(input);
        endTime = System.nanoTime();
        System.out.println("Stack Method Time: " + (endTime - startTime) + " ns");

        // Two Pointer Timing
        startTime = System.nanoTime();
        boolean r3 = twoPointerMethod(input);
        endTime = System.nanoTime();
        System.out.println("Two Pointer Method Time: " + (endTime - startTime) + " ns");
    }
}