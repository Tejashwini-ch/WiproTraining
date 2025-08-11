class CFlow{
	public static void main(String[] args){
		//if statement
		int x=20;
		int y=30;
		
		if(x==20){
			System.out.println("Valid Value: "+x);
		}
		else{
			System.out.println("Invalid Value");
		}
		
		//Example 2
		//if(x==20 && y==40){
		if(x>=20 && x<=40){
			
			System.out.println("Valid Value: "+x+","+y);
		}
		else{
			System.out.println("Invalid Value Again");
		}
		
		//Example 3 ---if...elseif Ladder
		//x=20 and y=30
		if(x<10){
			System.out.println("Valid X");
		}
		else if(y>=30){
			System.out.println("Valid y");
		}
		else{
			System.out.println("Invalid Values of x and y");
		}
		
		//Example 4
		//Independent if statements
		if(x==20){
			System.out.println("Valid X");
		}
		if(y>=30){
			System.out.println("Valid y");
		}
		if(x==y){
			System.out.println("valid Values of x and y");
		}
		else{
			System.out.println("XXXXXXXXXXXX");
		}			
	
		String ch=null;
		switch(ch){
			case "n":{
				System.out.println("No");
				break;
			}
			//null --->It is an undetermined value.
			// You cannot determine the value of null.
			case null:{
				System.out.println("Big NO");
				break;
			}
			case "Y":
			case "y":{
				System.out.println("Yes");
				break;
			}
			default:{
				System.out.println("No Choice");
				break; //optional 
			}
		}
			//if statement using with switch statement
			String str="Jan";
			if(str==null){
				System.out.println("NULL");
			}
			else{
				switch(str){
					case "Jan":{
						System.out.println("Jan");
						break;
					}
					case "Feb":{
						System.out.println("Feb");
						break;
					}
					case "Mar":{
						System.out.println("Mar");
						break;
					}
				}
			}
	
			//Nested switch statement
			int m=1;
			int num=100;
			switch(m){
					case 1:{
						switch(num){
							case 100:{
								System.out.println("100");
								break;
							}
							case 200:{
								System.out.println("200");
								break;
							}
						}
					break;
					}
					default:{
						System.out.println("Invalid statement");
					}
			}
	}
	}	