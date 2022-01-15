package datatypes;

import java.util.ArrayList;
import java.util.List;

public class User {

	private List<Movie> movie_list ;
	int uid ;
	String uname;
	int age;
	String email;
	
	
	public User(int uid, int age, String uname, String email) {
			this.uid = uid;
			this.age = age;
			this.uname = uname;
			this.email = email;
			movie_list = new ArrayList<Movie>();
	}


	public List<Movie> getMovie_list() {
		return movie_list;
	}


	public void setMovie_list(List<Movie> movie_list) {
		this.movie_list = movie_list;
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
