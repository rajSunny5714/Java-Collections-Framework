package Collection_Interface;
import java.util.*;

public class CollectionMethods {
    private Collection<String> languages = new ArrayList<>();

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void displayElements() {
        System.out.println("\nCollection Elements:");
        System.out.println(languages);
    }

    public void displayUsingIterator() {
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = languages.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void displayUsingForEach() {
        System.out.println("\nUsing For-Each:");
        for (String language : languages) {
            System.out.println(language);
        }
    }

    public void displaySize() {
        System.out.println("\nSize: " + languages.size());
    }

    public void searchElement(String element) {
        if (languages.contains(element)) {
            System.out.println(element + " is present.");
        } else {
            System.out.println(element + " is not present.");
        }
    }
}