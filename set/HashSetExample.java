package set;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
            set.add(sc.nextInt());
        }
        System.out.println("HashSet: " + set);

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        System.out.println("Element found: " + set.contains(search));

        System.out.print("Enter element to remove: ");
        int remove = sc.nextInt();

        set.remove(remove);

        System.out.println("After removal: " + set);
        System.out.println("Size: " + set.size());
    }
}
