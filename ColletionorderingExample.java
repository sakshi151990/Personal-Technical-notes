import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;



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
		
		LinkedList<Movie> list=new LinkedList<Movie>();
		list.add(new Movie("Harry Potter","Emma Watson",9));
		list.add(new Movie("Tomb Rider","Angelina",8));
		list.add(new Movie("Kahani","Vidya",7));
		list.add(new Movie("Kahani","Vidya",7));
		
		ArrayList<Movie> list1=new ArrayList<Movie>();
		list.add(new Movie("Harry Potter","Emma Watson",9));
		list.add(new Movie("Tomb Rider","Angelina",8));
		list.add(new Movie("Kahani","Vidya",7));
		list.add(new Movie("Kahani","Vidya",7));	
		
		List<Integer> listnumber=new ArrayList<Integer>();
		listnumber.add(1);
		listnumber.add(1);
		listnumber.add(2);
		listnumber.add(2);
		listnumber.add(1);
		listnumber.add(16);
		
		
		//merging two lists
		list1.addAll(list);
	
		System.out.println("List after merging the list1");
		for (Movie movie : list1) {
			System.out.println(movie.getName());
		}
	list.addFirst(new Movie("Tomb Rider","Angelina",8));
	Set<Integer> set =new HashSet<Integer>(listnumber);
	listnumber.clear();
	listnumber.addAll(set);
	
	System.out.println("Listnumber after remoing the duplicates :");
	for (Integer num : listnumber) {
		System.out.println(num);
		
	}

		
	}
	
	

	

	
}
