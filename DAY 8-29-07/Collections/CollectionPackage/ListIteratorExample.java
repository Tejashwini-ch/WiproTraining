package CollectionsPackage;

import java.util.LinkedList;
import java.util.ListIterator;
 
class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
 
        ListIterator<String> iterator = list.listIterator();
 
        // Traverse forward
        while (iterator.hasNext()) {
            System.out.println("Next: " + iterator.next());
        }
 
        // Traverse backward
        while (iterator.hasPrevious()) {
            System.out.println("Previous: " + iterator.previous());
        }
 
        // Modify during iteration
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("B")) {
                iterator.set("Bee");        // Replace "B" with "Bee"
                iterator.add("D");          // Add "D" after "Bee"
            }
        }
 
        System.out.println("Modified list: " + list);
    }
}
