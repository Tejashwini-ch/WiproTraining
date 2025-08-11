package Assessment;

public class Palindrome {
	String str;
	public Palindrome(String str) {
		this.str=str;
	}
	//writing a method to check whether it is palindorme or not
	public void checkPalindrome() {
		String reversed_str="";
		for(int i=str.length()-1;i>=0;i--) {
			reversed_str+=str.charAt(i);
		}
		if(str.equals(reversed_str)) {
			System.out.println(str+" is a palindrome");
		}else {
			System.out.println(str+" is not a palindorme");
		}
		
	}
	

}
