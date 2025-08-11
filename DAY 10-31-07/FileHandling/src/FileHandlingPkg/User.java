package FileHandlingPkg;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	String username;
	String email;
	int age;

	// New field has bee added
	public User(String username, String email, int age) {
		super();
		this.username = username;
		this.email = email;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", age=" + age + "]";
	}


}
/*public class User implements Serializable {
//private static final long serialVersionUID = 1L;
String username;
String email;
int age;
public User(String username, String email) {
    this.username = username;
    this.email = email;
}
}
/*this is without declaring the serialversionUID ---------
and it provides error when you run the deserializable file-----------
so to remove that we used SERIALVERSIONUID in this file and also added a new field 
as int age, also constructor and to stringmethod
*/