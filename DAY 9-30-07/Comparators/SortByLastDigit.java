package Comparators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortByLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//another way to declare them
		ArrayList<Integer> nums=new ArrayList<Integer>(Arrays.asList(24,25,8,39,46,2));
		System.out.println("Before sorting the list:");
		System.out.println(nums);
		/*/using anonymous class
		nums.sort(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return Integer.compare(a%10,b%10);
			}
		});
		System.out.println("After sorting by last digit using anonymous class: ");
		System.out.println(nums);*/
		
		//Using Lambda Expression
		System.out.println("Custom sorting using Comparator and  Lambda Expression");
		nums.sort((x,y)->Integer.compare(x%10,y%10));
		/*the error we got here is dues to ArrayList<>
		we haven't declared its type to Integer.
		The coorected one is written in line 11 as ArrayList<Integer> by mentioning the type*/
		System.out.println(nums);


	}

}
