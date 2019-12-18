package com.jihe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class FileInputStream_test {

	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("D:\\132.jpg");
		FileOutputStream out=new FileOutputStream("c:\\132.jpg");
		long kssj=System.currentTimeMillis();
		byte[] zjhc=new byte[1024];
		int b=fin.read();
		while (b!=-1) {
			//System.out.print((char)b);
			out.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		long jssj=System.currentTimeMillis();
		System.out.println("载入图片耗时:"+(jssj-kssj)+"毫秒");
		//out.write("come on".getBytes());
		fin.close();
		out.close();
	}

}
