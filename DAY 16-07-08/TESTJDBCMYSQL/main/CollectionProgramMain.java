package main.java;

import java.util.*;

public class CollectionProgramMain {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Arrays.asList("Apples","Banana","Carrot","Dumplings", "Eggplant","Fries","Grapes"));
        System.out.println("Original ArrayList: " + arrayList);
        CollectionProgram.shuffleArrayList(arrayList);
        System.out.println("Shuffled ArrayList: " + arrayList);

        List<String> portion = CollectionProgram.extractsubString(arrayList, 1, 3);//prints only 1,2 index
        System.out.println("\nExtracted Portion: " + portion);

        CollectionProgram.replaceSecondElement(arrayList, "Brinjal");
        System.out.println("\nAfter replacing 2nd element: " + arrayList);

        HashSet<String> mobiles = new HashSet<>(Arrays.asList("Apple","Microsoft","Nokia","Vivo","Oppo"));
        HashSet<String> clonedSet = CollectionProgram.cloneHashSet(mobiles);
        System.out.println("\nOriginal HashSet: " + mobiles);
        System.out.println("Cloned HashSet: " + clonedSet);

        TreeSet<String> treeSet = CollectionProgram.convertToTreeSet(mobiles);
        System.out.println("\nTreeSet from HashSet: " + treeSet);

        Map<String, Integer> map = new HashMap<>();
        map.put("Jaquar", 10);
        map.put("Benz", 20);
        map.put("Nexon", 30);
        
        System.out.println("\nMap Keys: " + CollectionProgram.getKeys(map));
    }
}

