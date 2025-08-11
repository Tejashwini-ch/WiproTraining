package pkg_excepton_handling;
class ExCatchBlock{
	public static void main(String[] args){
		int x=0;
		try{
			x= 12/0;
		}catch(ArithmeticException ae){
			System.out.println("ArithmeticExceptiopn Caught hers: "+ae);
			try{
				String str=null;
				int str_length = str.length();
			}catch(NullPointerException ne){
				System.out.println("NullPointerException Occured");
			}
		}
		finally{
				x=12/2;
			System.out.println("X: "+x+" Finally block executed...."); 
		}
	}
}	
/*here in this program at first we have try block
with arithmetic exception in it and it is ahndled in catch block..a
but in catch block it have another try block where it gives null pointer exception.
it also executes that.
*/