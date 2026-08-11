package List;

import java.util.*;

public class VectorOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
            vector.add(sc.nextInt());
        }
        System.out.println("Vector: " + vector);

        System.out.print("Enter element to add: ");
        int add = sc.nextInt();
        vector.add(add);

        System.out.println("After adding: " + vector);

        System.out.print("Enter element to remove: ");
        int remove = sc.nextInt();
        vector.remove(Integer.valueOf(remove));

        System.out.println("After removal: " + vector);

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        System.out.println("Element found: " + vector.contains(search));
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
    }
}