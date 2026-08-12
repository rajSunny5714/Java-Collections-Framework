package set;

import java.util.*;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter first array elements:");
        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];

        System.out.println("Enter second array elements:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1) {
            set.add(num);
        }
        for(int num : arr2) {
            set.add(num);
        }
        System.out.println("Union: " + set);
    }
}
