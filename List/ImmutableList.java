package List;

import java.util.*;

public class ImmutableList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }
        List<Integer> immutableList = Collections.unmodifiableList(list);
        System.out.println(immutableList);
    }
}