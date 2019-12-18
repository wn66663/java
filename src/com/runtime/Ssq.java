package com.runtime;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import org.apache.commons.collections4.functors.ForClosure;

public class Ssq {

	public static void main(String[] args) throws InterruptedException {
		Random a =new Random();
		System.out.println("你的号码是:");
		for (int i = 0; i < 6; i++) {
			int hq=a.nextInt(33)+1;
			System.out.print(hq+"  ");
			
		}
		System.out.println(a.nextInt(16)+1);
		
		System.out.println("双色球开奖了");
		
		System.out.println("六个红球的号码为:");
		Thread.sleep(1000);
		Random r=new Random();
		HashSet<Integer> hs=new HashSet<>();
		for (int i = 0; i < 10000; i++) {
			int hq=r.nextInt(33)+1;
			hs.add(hq);
			if(hs.size()==6) {
				break;
			//System.out.print(hq+"  ");
			//Thread.sleep(1000);
		}
	}
		for (Integer hq : hs) {
			System.out.print(hq+"  ");
			Thread.sleep(1000);
		}
	/*ForClosure<>()
		System.out.println();
		Random l=new Random();
		System.out.println("蓝球的号码为:");
		Thread.sleep(1000);
		
			System.out.println(r.nextInt(16)+1);
			Thread.sleep(1000);*/
			
		
	}

}
