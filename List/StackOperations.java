package List;

import java.util.*;

public class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println("Stack: " + stack);

        System.out.print("Enter element to push: ");
        int push = sc.nextInt();
        stack.push(push);

        System.out.println("After push: " + stack);

        System.out.println("Top element: " + stack.peek());

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        System.out.println("Element found at position: " + stack.search(search));

        System.out.println("Popped element: " + stack.pop());
        System.out.println("After pop: " + stack);

        System.out.println("Is stack empty: " + stack.empty());
    }
}