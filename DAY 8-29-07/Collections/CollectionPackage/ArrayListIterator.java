package CollectionsPackage;

import java.util.ArrayList;
import java.util.Iterator;
 
class ArrayListIterator {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
 
        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
 
			/* 
        	Creating a reference of type Iterator<String>, 
			which points to an object that is an instance of a  
         	class that implements the Iterator interface.
           */
		Iterator<String> iterator = fruits.iterator();
        // Traverse the ArrayList using Iterator
        System.out.println("Fruits in the list:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
		}    
		//Enhanced for loop
		for(String favfruits:fruits){
			System.out.println(favfruits);
		}
	} 
}
