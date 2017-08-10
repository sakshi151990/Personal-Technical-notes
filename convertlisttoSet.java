import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;


public class convertlisttoSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<Integer>();


		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(8);
		
		//copying from addAll method 
		for(Integer n: list){
	Collections.addAll(set,n);
		}
		
	
		
		//copying from constructor
Set<Integer> setcopy=new HashSet<Integer>(list);
	System.out.println("Set " + set);
System.out.println("setcopy "+ setcopy );
	
	Collections.sort(list);
	Iterator<Integer> itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	
	}
	Collections.reverseOrder();

	
	Iterator<Integer> itr1=list.iterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	
	}
	
	}
}
