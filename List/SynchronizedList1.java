package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList1 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        Thread t1 = new Thread(() -> {
            for(int i=1; i<=5; i++) {
                list.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i=6; i<=10; i++) {
                list.add(i);
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(list);
    }
}
