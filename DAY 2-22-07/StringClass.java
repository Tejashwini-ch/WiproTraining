class Impl{
    public static void main(String[] args) {
		String str="Welcome";
		System.out.println("Length: "+str.length());
		System.out.println("str position: "+str.charAt(3));
		System.out.println("Substring: "+str.substring(0,3));
		System.out.println("Compare 2 string: "+"Welcome".equals(str));
		System.out.println("Compare 2 string: "+"welcome".equalsIgnoreCase(str));
		System.out.println("CompareTo: "+"Welcome".compareTo(str));
		System.out.println("str contains: "+str.contains("come"));
		System.out.println("Uppercase: "+str.toUpperCase());
		System.out.println("Lowercase: "+str.toLowerCase());
		System.out.println("trim: "+"hello ".trim());
		System.out.println("replace: "+str.replace("W","M"));
		//String argument[] = str.split(",");
		//System.out.println("split: "+argument);
		System.out.println("Index: "+str.indexOf('c'));
		System.out.println("isEmpty: "+str.isEmpty());

		
		
		//Immutable Example
		String s = "Hello";
		s.concat(" World");
		System.out.println(s);   // Output: Hello (not Hello World)
		//concat() does not change s, 
		//because strings are immutable.
		s = s.concat(" World");
		System.out.println(s);   // Output: Hello World

		
		//StringBuffer - mutable
		StringBuffer sb = new StringBuffer("Helloppppppppppppppppmmmmmmmmmmmmmmmm");       // with initial string
		sb.append("World");
		System.out.println(sb);	
		sb.insert(1, "Java");
		System.out.println(sb);	
		sb.replace(0, 5, "Hi");
		System.out.println(sb);	
		sb.delete(0, 2);
		System.out.println(sb);	
		sb.reverse();
		System.out.println(sb);	
		System.out.println("StringBuffer capacity: "+sb.capacity());
		sb.setCharAt(0, 'T');
		System.out.println(sb);	
				
		//StrinBuilder class
		StringBuilder sb2 = new StringBuilder("Helloppppppppppppppppmmmmmmmmmmmmmmmm");        
		System.out.println("Capacity StrinBuilder class: "+sb2.capacity());
	
	}
}	