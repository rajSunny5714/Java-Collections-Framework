package Collection_Interface;
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CollectionMethods cm = new CollectionMethods();

        System.out.print("Enter number of languages: ");
        int n = sc.nextInt();

        System.out.println("Enter languages:");
        for (int i = 0; i < n; i++) {
            cm.addLanguage(sc.next());
        }

        cm.displayElements();
        cm.displayUsingIterator();
        cm.displayUsingForEach();
        cm.displaySize();

        System.out.print("\nEnter element to search: ");
        String search = sc.next();
        cm.searchElement(search);

    }
}