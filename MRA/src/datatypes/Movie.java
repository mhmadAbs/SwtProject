package datatypes;

import java.util.Date;

public class Movie {
	int mid;
	String title;
	int actor_id;
	int director_id;
	Date publishing_date;
	
	
	public Movie(int mid, String title, int actor_id, int director_id, Date publishing_date) {
		
		this.mid = mid;
		this.actor_id = actor_id;
		this.director_id = director_id;
		this.title = title;
		this.publishing_date = publishing_date;
		publishing_date = new Date();
		
	}


	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getActor_id() {
		return actor_id;
	}


	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}


	public int getDirector_id() {
		return director_id;
	}


	public void setDirector_id(int director_id) {
		this.director_id = director_id;
	}


	public Date getPublishing_date() {
		return publishing_date;
	}


	public void setPublishing_date(Date publishing_date) {
		this.publishing_date = publishing_date;
	}
	
	
	
	
	
	
}
