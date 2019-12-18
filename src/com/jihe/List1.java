package com.jihe;


import java.util.*;
import java.util.stream.Stream;;

public class List1 {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("张三","李四","王五","赵六");
		Stream<String> pStream=list.parallelStream();
		if (pStream.isParallel()) {
			System.out.println("这是一个并行流");
		}
		pStream.limit(4).forEach(ps->System.out.println(ps));
	}
}
