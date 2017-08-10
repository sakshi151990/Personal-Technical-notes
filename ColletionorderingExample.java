import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Comparison;

class Movie implements Comparable<Movie>{
	
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
	public int compareTo(Movie arg0) {

//return getName().compareToIgnoreCase(arg0.getName());
	
		return this.getRating()-arg0.getRating();
		
	}
	
	
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
		
		
		Collections.sort(list);
		Iterator<Movie> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next().getName());
		}
		

	}

	

	
}
