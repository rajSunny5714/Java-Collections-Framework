package List;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }
        for(Integer num : list) {
            if(num%2==0) {
                list.remove(num);
            }
        }
        System.out.println(list);
    }
}