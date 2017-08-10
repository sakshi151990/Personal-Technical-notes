import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import sun.org.mozilla.javascript.internal.ast.ForLoop;

public class contacts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first 2-3 letter of the contact you want to search: ");
		String a = scan.next();
		
		

		HashMap<Integer, ArrayList<String>> contact = new HashMap<Integer, ArrayList<String>>();
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sakshi");
		list.add("agarwal");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Tarni");
		list1.add("agarwal");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Account");
		list2.add("Info");

		contact.put(1, list);

		contact.put(2, list1);

		contact.put(3, list2);
		String match = null;

		ArrayList<Integer> keys = new ArrayList<Integer>();
		Pattern p = Pattern.compile("^\\s*" + a, Pattern.CASE_INSENSITIVE);

		for (Entry<Integer, ArrayList<String>> map : contact.entrySet())
			for (String name : map.getValue()) {

				Matcher ms = p.matcher(name);
				if (ms.find()) {
					keys.add(map.getKey());
					
				}

			}
if(keys.isEmpty())
System.out.println("No contact are matched");
		for (Integer key : keys) {
			System.out.println(contact.get(key));
		}

	}

}
