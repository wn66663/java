package com.jhart;

import java.util.ArrayList;

import java.util.Collections;

public class Arraylist_test {
	
	public static void main(String[] args) {
			ArrayList<String> list=new ArrayList<>();
			Collections.addAll(list,"赵","钱","孙","李","周");
			System.out.println("正常排序:"+list);
			Collections.reverse(list);
			System.out.println("反转后排序:"+list);
			Collections.sort(list);
			System.out.println("自然排序:"+list);
			Collections.shuffle(list);
			System.out.println("随机排序:"+list);
			Collections.swap(list, 0, list.size()-1);
			System.out.println("首尾交换后排序:"+list);
			
			ArrayList<Integer> list2=new ArrayList<>();
			Collections.addAll(list2,5,-2,3,7,9);
			System.out.println("集合中的元素:"+list2);
			System.out.println("集合中最大的元素为:"+Collections.max(list2));
			System.out.println("集合中最小的元素为:"+Collections.min(list2));
			Collections.replaceAll(list2, 7, 0);
			System.out.println("替换后的集合为:"+list2);
			Collections.sort(list2);
			System.out.println("自然排序:"+list2);
			System.out.println("集合通过二分查找法查找元素9的下标为:"+Collections.binarySearch(list2, 9));
	}
}
