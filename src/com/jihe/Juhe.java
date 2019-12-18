package com.jihe;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Juhe {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("亚索");
		list.add("易");
		list.add("瑞文");
		list.add("菲奥娜");
		list.add("亚小索");
		list.add("亚托克斯");
		
		Stream<String> stream=list.stream();
		stream.forEach(i->System.out.println(i));
		Stream<String> stream2=list.stream();
		Stream<String> stream3=stream2.filter(j->j.startsWith("亚"));
		System.out.println("所有姓亚的:");
		stream3.forEach(k->System.out.println(k));
		
		System.out.println("第二个和第三个姓亚的:");
		list.stream().filter(j->j.startsWith("亚")).skip(1).limit(2).forEach(k->System.out.println(k));
		
		System.out.println("第二个和第三个姓亚的用和连接:");
		
		
		System.out.println(	list.stream().filter(j->j.startsWith("亚")).skip(1).limit(2).collect(Collectors.joining("和")));
	
	}

}
