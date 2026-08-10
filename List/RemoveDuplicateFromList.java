package List;

import java.util.*;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : list) {
            if(!result.contains(num)) {
                result.add(num);
            }
        }
        System.out.println(result);
    }
}