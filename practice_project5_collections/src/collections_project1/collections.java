package collections_project1;
import java.util.*;

public class collections {

	private static final String Sysout  = null;

	public static void main(String[] args) {
		ArrayList <String>name=new ArrayList<String>();
		//name.add("ashok");
		 System.out.println("creating array list");
		 name.add("ashok");
		 name.add("ashok");
	
	 name.add("reddy");
	 System.out.println(name); 
	 System.out.println("\n");
	 System.out.println("creating linked list");
	 LinkedList<String> ll=new LinkedList<String>();
	 ll.add("radio");
	 ll.add("tv");
	 ll.add("tv");
	 System.out.println(ll);

	 System.out.println("\n");

	 System.out.println("hashset");
	 HashSet<Integer> hs=new HashSet<Integer>();
  hs.add(1);
   hs.add(2);
   hs.add(1);
   hs.add(3);
  
	 System.out.println(hs);
	  System.out.println("\n");
	 System.out.println("vector");
	 Vector<Integer> v=new Vector<Integer>();
  v.add(12);
   v.add(32);
   v.add(12);
   v.add(30);
   System.out.println(v);
   
   System.out.println("\n");

	 System.out.println("linked hashset");
	LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
lhs.add(11);
 lhs.add(21);
 lhs.add(11);
 lhs.add(37);
 System.out.println(lhs);
	 
		}
	}


