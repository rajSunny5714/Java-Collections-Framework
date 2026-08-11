package List;

import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Enter index to update: ");
        int index = sc.nextInt();

        System.out.print("Enter new value: ");
        int value = sc.nextInt();

        list.set(index, value);
        System.out.println("After update: " + list);

        System.out.print("Enter element to remove: ");
        int remove = sc.nextInt();

        list.remove(Integer.valueOf(remove));
        System.out.println("After removal: " + list);

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        System.out.println("Element found: " + list.contains(search));
        System.out.println("Size of ArrayList: " + list.size());
    }
}