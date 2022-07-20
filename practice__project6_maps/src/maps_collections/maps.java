package maps_collections;
import java.util.*;
public class maps {

	public static void main(String[] args) {

		 System.out.println("hashmap");
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();
	  hm.put(101,"ashok");
	   hm.put(102,"avi");
	   hm.put(103,"hari");
	   
	  for(Map.Entry m:hm.entrySet()){
		 System.out.println(m.getKey()+" "+m.getValue());
		  
	}
	  System.out.println("\n");

		 System.out.println("hashtable");
		 Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
	  ht.put(106,"kumar");
	   ht.put(107,"reddy");
	   ht.put(105,"krishna");
	   
	  for(Map.Entry m:ht.entrySet()){
		 System.out.println(m.getKey()+" "+m.getValue());
		  
	}
	  System.out.println("\n");

		 System.out.println("treemap");
		 TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
	  tm.put(101,"ashok");
	   tm.put(104,"avi");
	   tm.put(103,"hari");
	   
	  for(Map.Entry m:tm.entrySet()){
		 System.out.println(m.getKey()+" "+m.getValue());
		  
	}
	  System.out.println("\n"); 
	}
}
