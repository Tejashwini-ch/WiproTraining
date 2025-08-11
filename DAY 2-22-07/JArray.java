import java.util.Arrays;
class JArray{
	public static void main(String[] args){
		//Declaration of an integer array
		int[] numbers;
		//Initialization of an integer array
		numbers = new int[5];
		System.out.println(numbers);
		
		// 1st way 
		numbers[0]=444;
		numbers[1]=4344;
		numbers[2]=4464;
		numbers[3]=4414;
		numbers[4]=44554;
		
		// Iterate the elements of an array using simple for loop
		for(int i=0;i<numbers.length;i++){
			System.out.println("numbers["+i+"]: "+numbers[i]);
		}
		
		// using enhanced for loop
		for(int num: numbers){
			System.out.println(num);
		}
		
		//To declare and initialize a single dim. array
		int[] nums={2554,5467,77,87,8,86,6,67,6,7};
		for(int num_1: nums){
			System.out.print(num_1+",");
		}
		System.out.println();
		//To sort an array using Arrays class
		System.out.println("Sorted Array");
		
		// To sort an array using Arrays class
		Arrays.sort(nums);
		//To display the sorted array....
		System.out.println(Arrays.toString(nums));

		//BinarySearch using an Arrays class
		int[] arr = {1, 2, 5, 9};
		int index = Arrays.binarySearch(arr, 2);  // returns index: 2
		System.out.println("The element is at index: "+index);
		
		// To fill array with the val;ue using Arrays class 
		//"fill()" static method
		int[] arr1 = new int[5]; // 1 row and 5 columns
		Arrays.fill(arr1, 6);  // arr becomes {6,6,6,6,6}
		for(int n: arr1){
			System.out.println(n);
		}
	
		//Comparing arrays with the Arrays equals() method
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 3};
		boolean result = Arrays.equals(a, b);  // true
		System.out.println(result);
	
		//Copying an array using Arrys copyOf() method
		int[] original = {1, 2, 3};
		int[] copy = Arrays.copyOf(original, original.length);  // {1, 2, 3, 0, 0}
		for(int cpy:copy){
			System.out.println("Copy Array: "+cpy);
		}
	
		//ParallelSort using Arrays class
		int[] psarr = {5, 2, 1, 9};
		Arrays.parallelSort(psarr);  // like sorting, but uses multithreading
		System.out.println(Arrays.toString(psarr));
	
		//Multi-dimensional arrays
		int[][] mdarr=new int[4][5]; // 4 rows 5 cols.
		
		int[][] darr = {{1,2,3,4,6},
						{2,5,8,9,3},
						{2,6,7,8,5},
						{8,9,0,4,1}
					   };
		for(int row=0;row<4;row++){
			for(int col=0;col<5;col++){
				System.out.println("darr["+row+"]["+col+"]: "+darr[row][col]);
			}				
		}
		
		//Manually
		mdarr[0][0]=33;
		
		//Deep Equality for MD Arrays
		int[][] a1 = {{1, 2}, {3, 4}};
		int[][] b1 = {{1, 2}, {3, 4}};
		System.out.println(Arrays.deepEquals(a1, b1));  // true

		// If we can implement copyOf() method in MD arrays
		int[][] darr_1 = {{1,2,3,4,6},
						{2,5,8,9,3},
						{2,6,7,8,5},
						{8,9,0,4,1}
					   };
		int[][] copy_1 = Arrays.copyOf(darr_1, darr_1.length);  // {1, 2, 3, 0, 0}
		for(int r=0;r<4;r++){
			for(int c=0;c<5;c++){
				System.out.println(copy_1[r][c]);
			}
		}
		
		//Ternary operator
		int q=12;
		int w=34;
		int res = (q>w)?q:w;
		System.out.println("Result: "+res);
		
	
	}
}	