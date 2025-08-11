package Comparators;

//Natural sorting using Comparable

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Student2 implements Comparable<Student2> {
  private int id;
  private String name;
  Student2(int id, String name) {
      this.id = id;
      this.name = name;
  }

  // Natural ordering by id
  public int compareTo(Student2 s) {
	return this.id - s.id;   
  }

  public String toString() {
      return this.id + " " + this.name;
  }
}

class ComparableExample {
  public static void main(String[] args) {
      List<Student2> list = new ArrayList<>();
      list.add(new Student2(3, "Garry"));
      list.add(new Student2(1, "Jane"));
      list.add(new Student2(2, "Jackson"));

	Collections.sort(list); 
//Bydefault the sort() static method of Collections class internally calls    //compareTo() method //to compare the 2 objects.

      for (Student2 s : list) {
          System.out.println(s);
      }
  }
}