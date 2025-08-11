package Comparators;


import java.util.ArrayList;

import java.util.Collections;

import java.util.List;
 
public class StudentMain {
 
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		List<Student> list = new ArrayList<>();

		list.add(new Student("Garry",21));

		list.add(new Student("Binny",26));

		list.add(new Student("Fenny",22));

		//SortByAge

		System.out.println("Before sorting: The age of the Students");

		for(Student sage:list) {

			System.out.println(sage.getAge());

		}

		System.out.println("After sorting: The age of the Students");

		Collections.sort(list,new AgeComparator());

		for(Student sage:list) {

			System.out.println(sage.getAge());

		}

		//SortByName

		System.out.println("Before sorting: The name of the Students");

		for(Student name:list) {

			System.out.println(name.getName());

		}

		System.out.println("After sorting: The name of the Students");

		Collections.sort(list, new NameComparator());

		for(Student name:list) {

			System.out.println(name.getName());

		}

	}
 
}

 
