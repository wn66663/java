package com.jihe;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class zycs {
	static HashMap<String, Integer> hm=new HashMap<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("18rj2.txt")));
		String xm=br.readLine();
		while (xm!=null) {
			hm.put(xm, 0);
			xm=br.readLine();
		}
		File ml=new File("D:\\18软件2班作业");
		fileDir(ml);
		System.out.println(hm);
	}
	private static void fileDir(File ml) {
		File[] wjsz=ml.listFiles();
		for (File file : wjsz) {
			if (file.isDirectory()) {
				String wjm=file.getName();
				hm.forEach((xsm,cs)->{
					if (wjm.contains(xsm)) {
						cs=cs+1;
						hm.put(xsm, cs);
					}
				});
				fileDir(file);
			}
		}
		
	}

}
