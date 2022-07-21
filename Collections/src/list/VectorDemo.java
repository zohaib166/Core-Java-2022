package list;

import java.util.Iterator;
import java.util.Vector;

/**
 * Vector uses a dynamic array to store the data elements. 
 * It is similar to ArrayList.  * However, It is synchronized 
 * and contains many methods that are not the part of Collection framework.
 * **/
public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(3);
		v.add(4);
		v.add(7);

		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
	}
}
