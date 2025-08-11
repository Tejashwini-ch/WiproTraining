package pkg;
class Student1{
	//instance variables belong to the object
	int id;
	String name;
	int rollNo;
	//static varibales belong to the class
	// A single copy in the memory and shared by every object.
	static int groupId;
}
public class ClassVarStudent {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.id=101;
		System.out.println("Student 1 Id: "+s1.id);
		Student1 s2 = new Student1();
		System.out.println("Student 2 Id: "+s2.id);
		Student1 s3 = new Student1();
		Student1 s4 = new Student1();
		Student1 s5 = new Student1();
		s3.groupId=101;
		System.out.println("Group Id for Student 3: "+s3.groupId);
		System.out.println("Group Id for Student 4: "+s4.groupId);
		s5.groupId=105;
		System.out.println("Group Id for Student 3: "+s3.groupId);
		System.out.println("Group Id for Student 4: "+s4.groupId);
		System.out.println("Group Id for Student 5: "+s3.groupId);


	}
 
}