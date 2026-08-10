package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SynchronizedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        synchronized (list) {
            for (int num : list) {
                System.out.print(num+" ");
            }
        }
    }
}
