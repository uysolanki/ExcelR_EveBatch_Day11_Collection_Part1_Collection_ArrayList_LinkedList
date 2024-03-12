package day10.collection;

import java.util.List;
import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) {
		Vector maha=new Vector();
		//add() of collections
		//public boolean add(Object o)
		maha.add("Pune");
		maha.add("Mumbai");
		maha.add("Nagpur");
		maha.capacity();
		
		System.out.println(maha);  //Pune Mumbai Nagpur
//		
//		ArrayList raj=new ArrayList();
//		//add() of collections
//		//public boolean add(Object o)
//		raj.add("Jaipur");
//		raj.add("Bikaner");
//		raj.add("Udaipur");
//		System.out.println(raj);
//		raj.add(1, "Sikar");
//		System.out.println(raj);
//		//System.out.println(raj);  //Jaipur Bikaner  Udaipur
//		//raj.remove("Udaipur");
//		//System.out.println(raj);  //Jaipur Bikaner
//		//raj.remove(1);
//		//System.out.println(raj.remove(3));
//		
//		ArrayList India =new ArrayList();
//		India.addAll(maha);
//		India.addAll(raj);
//		India.add("Delhi");
//		System.out.println(India);//[Pune Mumbai Nagpur Jaipur, Sikar, Bikaner, Udaipur, Delhi]
//		System.out.println(India.size());
//		
////		India.removeAll(maha);
////		System.out.println(India);//[Pune Mumbai Nagpur Jaipur, Sikar, Bikaner, Udaipur, Delhi]
////		System.out.println(India.size());
//		
////		India.retainAll(maha);
////		System.out.println(India);
////		India.clear();
////		System.out.println(India.isEmpty());
//		
//		System.out.println(India.contains("Chennai"));
	}

}
