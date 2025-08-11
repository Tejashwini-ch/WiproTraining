package Assessment;
import java.util.*;
public class TwoDimensionalArrayImpl {
	public static void main(String[]args) {
		int[][] matrix1=new int[2][3];
		int[][] matrix2=new int[2][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values for matrix1: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("matrix1["+i+"]"+j+"] : ");
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("ENter the values for matrix2: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("matrix2["+i+"]"+j+"] : ");
				matrix2[i][j]=sc.nextInt();
			}
		}
		//now adding the two matrix 1 and 2
		int sum[][]=new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("The sum of two matrices is:");
		TwoDimensionalArray.printMatrix(sum);
		
	}

}
