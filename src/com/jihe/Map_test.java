package com.jihe;

import java.util.*;

public class Map_test {

	public static void main(String[] args) {
		Map<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1,"Jack");
		hmap.put(2,"Rose");
		hmap.put(3,"Yasuo");
		hmap.put(4,"Ruiwen");
		System.out.println(hmap);
		if (hmap.containsKey(3)) {
			System.out.println("这个Map包含键3");
			System.out.println("这个Map键3的元素为:"+hmap.get(3));
		}
		//仅输出Map的键的元素  和  值的元素用keySet()和values()
		System.out.println("这个Map集合中所有键的集合为:"+hmap.keySet());
		System.out.println("这个Map集合中所有值的集合为:"+hmap.values());
		//修改Map里面的元素replace
		hmap.replace(1, "yi");
		System.out.println(hmap);
		//增加键5元素
		hmap.put(5, "manwang");
		System.out.println(hmap);
		//删除Map里面的元素remove
		hmap.remove(1);
		System.out.println(hmap);
		System.out.println("用键集来遍历Map集合");
		Set<Integer> jianji=hmap.keySet();	
		Iterator<Integer> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value=hmap.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("用键值对集遍历双列集合的键和值");
		Set<Map.Entry<Integer, String>> jianzhiduiji=hmap.entrySet();	
		Iterator<Map.Entry<Integer, String>>  diedai2=jianzhiduiji.iterator();
		while (diedai2.hasNext()) {
			Map.Entry< Integer,String>  jianzhidui = (Map.Entry<Integer, String> ) diedai2.next();
			Object key=jianzhidui.getKey();
			Object value=jianzhidui.getValue();	
			System.out.println(key+":"+value);
		}
		System.out.println("使用foreach循环");
		hmap.forEach((key,value)->System.out.println(key+":"+value));
		System.out.println("");
		Collection<String> zhiji=hmap.values();
		zhiji.forEach(value->System.out.println(value));
		Map<Integer,String> hmap2=new LinkedHashMap<Integer,String>();
		hmap2.put(3,"Jack");
		hmap2.put(1,"Rose");
		hmap2.put(2,"Yasuo");
		hmap2.put(4,"Ruiwen");
		hmap2.forEach((key,value)->System.out.println(key+":"+value));
		
	}

}
