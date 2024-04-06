import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class stackproblem {

    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesesHelper(n, 0, 0, new Stack<>(), "", result);
        return result;
    }

    private static void generateParenthesesHelper(int n, int openCount, int closeCount, Stack<Character> stack, String current, List<String> result) {
        // Base case: if both open and close parentheses count reach n
        if (openCount == n && closeCount == n) {
            result.add(current);
            return;
        }

        // Add '(' if open count is less than n
        if (openCount < n) {
            stack.push('(');
            generateParenthesesHelper(n, openCount + 1, closeCount, stack, current + "(", result);
            stack.pop();
        }

        // Add ')' if close count is less than open count
        if (closeCount < openCount) {
            stack.push(')');
            generateParenthesesHelper(n, openCount, closeCount + 1, stack, current + ")", result);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        List<String> result = generateParentheses(n);
        System.out.println("Valid combinations of parentheses for n = " + n + ":");
        for (String parentheses : result) {
            System.out.println(parentheses);
        }
    }
}
