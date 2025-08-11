package Assessment;

public class ArrayReverse {
	int[] arr=new int[5];
	public ArrayReverse(int[] arr) {
		this.arr=arr;
	}
	public void reversed_Array() {
		int[] reversed_arr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			reversed_arr[i]=arr[arr.length-1-i];
		}
		System.out.println("The reversed array: ");
		for(int val:reversed_arr) {
			System.out.println(val+"");
		}
	}
	

}
