import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v1 = new Vector();		//<Integer> genrics to set type
		v1.add(12);
		v1.add(15);
		v1.addElement(16);
		v1.addElement(17);
		
		
		//Enumeration only use for vector or legacy class (v 1.0)
		Enumeration e1 = v1.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		
		Iterator i1 =  v1.iterator();	//iterator use for all collection
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
