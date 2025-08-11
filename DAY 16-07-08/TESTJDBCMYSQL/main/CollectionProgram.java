package main.java;
import java.util.*;

public class CollectionProgram {

    // 1. Shuffle elements in an array list
    public static void shuffleArrayList(List<String> list) {
        Collections.shuffle(list);
    }

    // 2. Extract a portion of an array list
    public static List<String> extractsubString(List<String> list, int firstIndex, int lastIndex) {
        return new ArrayList<>(list.subList(firstIndex, lastIndex));
    }

    // 4. Replace the second element of an ArrayList
    public static void replaceSecondElement(List<String> list, String newElement) {
        if (list.size() >= 2) {
            list.set(1, newElement);
        }
    }

   
    // 7. Clone a hash set to another hash set
    public static HashSet<String> cloneHashSet(HashSet<String> original) {
        return new HashSet<>(original);  
    }


    // 8. Convert hash set to tree set
    public static <T> TreeSet<T> convertToTreeSet(HashSet<T> hashSet) {
        return new TreeSet<>(hashSet);
    }

    // 10. Get collection view of keys in a map
    public static <K, V> Set<K> getKeys(Map<K, V> map) {
        return map.keySet();
    }
}
