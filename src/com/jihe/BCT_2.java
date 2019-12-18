package com.jihe;



import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


class Mycomparator1 implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Integer key1=(Integer) o1;
		Integer key2=(Integer) o2;
		return key2.compareTo(key1);
	}
	
}
public class BCT_2 {

	public static void main(String[] args) {
		Map<Integer,String> tmap=new TreeMap<Integer,String>(new Mycomparator1());
		tmap.put(2,"John");
		tmap.put(1,"Lucy");
		tmap.put(5,"Amamda");
		tmap.put(4,"Aimee");
		tmap.put(3,"Smith");
		System.out.println(tmap);
		System.out.println("用键集来遍历Map集合");
		Set<Integer> jianji=tmap.keySet();	
		Iterator<Integer>  diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value=tmap.get(key);
			System.out.println(key+":"+value);
		}
	}

}
