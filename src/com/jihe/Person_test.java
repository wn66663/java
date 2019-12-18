package com.jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Person_test {
	public static void main(String[] args) {
		List<Person1> list=new ArrayList<>();
		Person1 p1=new Person1("wang wen",18,"男");
		Person1 p2=new Person1("li jing",20,"女");
		Person1 p3=new Person1("li qin",22,"男");
		Person1 p4=new Person1("ya suo",28,"男");
		list=Arrays.asList(p1,p2,p3,p4);
		
		//old
		for (Person1 pm : list) {
			System.out.println(pm.getName());
		}
		
		//new 1
		List<String>list2=list.stream().map(a->a.getName()).collect(Collectors.toList());
		System.out.println(list2);
		
		List<String>list3=list.stream().map(Person1::getName).collect(Collectors.toList());
 		System.out.println(list3);
		
		List<String>list4=list.stream().map(a->{
			return a.getName();
		}).collect(Collectors.toList());
		System.out.println(list4);
	}

}
