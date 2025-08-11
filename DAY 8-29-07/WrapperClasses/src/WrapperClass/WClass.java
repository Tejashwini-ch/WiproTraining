package WrapperClass;

public class WClass {
	public static void main(String[] args) {
		//boxing-converting primitive datatype Autoboxing
		int num = 10;                      // primitive data type
		Integer ibox = Integer.valueOf(num);
		System.out.println("Inbox value: "+ibox);// manual boxing
		//this is unboxing 
		int unbox = ibox;         // manual unboxing
		System.out.println("UNbox value: "+unbox);

}
}
