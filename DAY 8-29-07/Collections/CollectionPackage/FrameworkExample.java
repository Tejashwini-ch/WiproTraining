package CollectionsPackage;

import java.util.*;

class FrameworkExample {

    public static void main(String[] args) {

        //Step 2 - create an object of the ArrayList bclass

		List<String> names = new ArrayList<>();

		//Step 3 - Add elements to the list

		names.add("Steven");

        names.add("Bob");

        names.add("Alex");

		names.add("Alex");

		names.add("Turner");

		names.add("Martin");

		names.add("Fox");

		names.add("Jack");

		names.add("Lily");

		//names.add(null);

		System.out.println("Before the sorting......"+names);
 
        Collections.sort(names);

        System.out.println("After the Sorting: " + names);

    }

}

