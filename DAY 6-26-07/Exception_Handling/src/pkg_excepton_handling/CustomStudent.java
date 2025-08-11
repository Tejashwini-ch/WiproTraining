package pkg_excepton_handling;
import java.util.Scanner;
public class CustomStudent
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int num=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter student name: ");
			String student=sc.nextLine();
			System.out.println("Enter student grade: ");
			int grade=sc.nextInt();
			sc.nextLine();
			GradeValidator gradevalidator=new GradeValidator();
			try {
				gradevalidator.validate(grade);
				System.out.println("Student "+student+" has grade "+grade);
			}catch(GradeException e) {
				System.out.println("Exception occured  "+e.getMessage());
			}
			finally {
				System.out.println("Vaidation complete");
				System.out.println("----------------");
				
			}
		}
		sc.close();
		
	}
}
class GradeValidator{
	public void validate(int grade) throws GradeException{
		if(grade>100) {
			throw new GradeException("It is an ivnvalid grade.");
		}
	}
}
class GradeException extends Exception{
	public GradeException(String message) {
		super(message);
	}
}