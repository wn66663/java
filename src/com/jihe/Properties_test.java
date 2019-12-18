package com.jihe;


import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.util.Properties;

public class Properties_test {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		p.load(new FileInputStream("d:\\t.properties"));
		p.forEach((k,v)->System.out.println(k+"="+v));
		FileOutputStream out=new FileOutputStream("d:\\t.properties");
		p.setProperty("charset", "UTF-8");
		p.store(out, "新增charset编码");
	}

}
