package com.jihe;

import java.util.Arrays;

public class Array_test {
	public static void main(String[] args) {
		int[] arr= {9,8,3,5,2,6,12};
		System.out.println("排序前:");
		printArray(arr);
		Arrays.sort(arr);
		System.out.println("\n排序后:");
		printArray(arr);
		int index=Arrays.binarySearch(arr,9);
		System.out.println("\n元素9在arr内 的索引是:"+index);
		//拷贝
		int[] copy=Arrays.copyOfRange(arr, 2, 8);
		System.out.println("被拷贝的数组是:");
		printArray(copy);
		//替换
		Arrays.fill(copy, 8);
		System.out.println("\n被拷贝的数组元素替换为8以后是:");
		printArray(copy);
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}
}
