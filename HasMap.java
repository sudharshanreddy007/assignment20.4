package hash;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMap {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap class implements the map interface by using a hash 
				//table. It inherits AbstractMap class and implements Map 
				//interface.HashMap<k,v>
				//K: It is the type of keys maintained by this map.
				//V: It is the type of mapped values.
		HashMap<Integer,String> employeeNames=new HashMap<Integer,String>();
		//put(K key, V value) method is used to associate the specified 
				//value with the specified key in this map.
		
		employeeNames.put(1,"mounika");
		 employeeNames.put(2,"Manisha");
		 employeeNames.put(4,"sai");
		 employeeNames.put(3,"mohan");
		
		 System.out.println(employeeNames);
		 //create the object of keys set
		 Set<Integer> keys=employeeNames.keySet();
		 for(Integer key:keys)//print the keys using ternary values
		 {
			 System.out.println(key);
		 }
		 System.out.println(employeeNames);
		 
		 Collection<String> values=employeeNames.values();
		 for(String value:values)
		 {
			 System.out.println(value);
		 }
// The Java collections framework (JCF) is a set of classes and 
//interfaces that implement commonly reusable collection data structures.
	//synchronzing the employees 
// Map interface provides methods for storing values based on key basis.
	Map map=Collections.synchronizedMap(employeeNames);
	System.out.println("After synchronizing:");
	Collection value=map.entrySet();//enter into the set
	synchronized(employeeNames)
	{
		
		Iterator i=value.iterator();
		while(i.hasNext())
		{
			//create the object and displaying
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
	}
}
}