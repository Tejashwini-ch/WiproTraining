class CFlowLoop{
	public static void main(String[] args){
		//Simple for loop
		//1. initialization expression
		//2. conditional expression
		//3. iteration expression---Increment OR decrement
		System.out.println();
		System.out.println("Increment For Loop");
		System.out.println("---------------");
		System.out.println();
		for(int i=1;i<=5;i++){
			System.out.println("I: "+i);
		}
		//Decrement for loop
		System.out.println();
		System.out.println("Decrement For Loop");
		System.out.println("------------------");
		System.out.println();
		
		for(int i=5;i>=1;i--){
			System.out.println("I: "+i);
		}
		
		int[] arr = new int[4];
		arr[0]=333;
		arr[1]=3;
		arr[2]=33;
		arr[3]=933;
		
		//iterate thru the array elements
		for(int i=0;i<arr.length;i++){
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		//iterate using enhanced for loop
		// for each loop
		System.out.println();
		System.out.println("Enhanced For Loop");
		System.out.println("-----------------");
		System.out.println();
		
		for(int arrayelement:arr){
			System.out.println(arrayelement);
		}
	
		//Task 1 
		//Display the addition of first 20 even numbers.
		
		//Nested for loop
		System.out.println();
		System.out.println("Nested For Loop");
		System.out.println("---------------");
		System.out.println();
		for(int i=1;i<=5;i++){
			System.out.println("I: "+i);
			for(int j=1;j<=3;j++){
				System.out.println("   J: "+j);	
			}
		}
	
		//While loop
		System.out.println();
		System.out.println("While Loop");
		System.out.println("----------");
		System.out.println();
		int t=1;
		while(t<=5){
			System.out.println("T: "+t);
			t++;
		}
		
		System.out.println();
		System.out.println("Nested While Loop");
		System.out.println("-----------------");
		System.out.println();
		int r=1;
		int s=1;
		while(r<=5){
			System.out.println("R: "+r);
			s=1;
			while(s<=3){
				System.out.println("  S: "+s);
				s++;
			}
		r++;
		}	
		
		
		/*Pattern Question
		
		*
		**
		***
		****
		*****
		
		// The above apttern question should be solved
		// using Nested While loop.
		*/
	}
}	