package com.jihe;

import java.awt.Frame;
import java.io.FileWriter;


public class FileWriter_test {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("test.txt");
		int len=0;
		char[] buff=new char[1024];
		
		fw.write("轻轻的我走了,\r\n");
		fw.write("正如我轻轻的来,\r\n");
		fw.write("我轻轻的招手,\r\n");
		fw.write("作别西天的云彩,\r\n");
		fw.close();
	}

}
