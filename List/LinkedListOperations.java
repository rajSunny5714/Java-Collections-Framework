package List;

import java.util.*;

public class LinkedListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Enter element to add at first: ");
        int first = sc.nextInt();
        list.addFirst(first);

        System.out.println("After addFirst: " + list);

        System.out.print("Enter element to add at last: ");
        int last = sc.nextInt();
        list.addLast(last);

        System.out.println("After addLast: " + list);

        System.out.print("Enter index to add element: ");
        int index = sc.nextInt();

        System.out.print("Enter value: ");
        int value = sc.nextInt();

        list.add(index, value);
        System.out.println("After insertion: " + list);

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        System.out.println("Element found: " + list.contains(search));

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Size: " + list.size());
    }
}