import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Comparison;

class Movie {
	
	private String name;
	private String actor;
	private int rating;
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public Movie(String name, String actor,int rating) {
		super();
		this.name = name;
		this.actor = actor;
		this.rating=rating;
	}

public static Comparator<Movie> Moviename=new Comparator<Movie>() {

	public int compare(Movie arg0, Movie arg1) {
	
		
		
		return arg0.getName().compareTo(arg1.getName());
	}
	
};
	
public static Comparator<Movie> Movierating=new Comparator<Movie>() {

	public int compare(Movie arg0, Movie arg1) {
	
		
		
		return arg0.getRating() - arg1.getRating();
	}
	
};
}


public class ColletionorderingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(new Movie("Harry Potter","Emma Watson",9));
		list.add(new Movie("Tomb Rider","Angelina",8));
		list.add(new Movie("Kahani","Vidya",7));
		
		
		Collections.sort(list,Movie.Moviename);
		Iterator<Movie> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next().getName());
		}
		
		Collections.sort(list,Movie.Movierating);
		Iterator<Movie> itr1=list.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next().getName());
		}
	}

	

	
}
