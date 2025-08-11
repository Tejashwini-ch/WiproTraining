package pkg;

public class Classvar {
	private int id;
	private String name;
	
	public void getData() {
		id=102;
		name="Steve";
	}
	public void printData() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classvar obj = new Classvar();
		obj.getData();
		obj.printData();
		Classvar obj2=new Classvar();
		System.out.println(obj2.id);
		//Memory space for s1 is 
		//4 bytes for id
		//This instance variable has separate copy of every object
		//Instance variable belongs to object not to the class
		//soo obj2 id will be 0
		//unlike instance variable static variable belongs to the class.

	}

}
