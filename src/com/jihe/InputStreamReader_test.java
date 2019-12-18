package com.jihe;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
class InputStreamReader_test {

	public static void main(String[] args) throws Exception {
		//InputStream is=System.in;
		//InputStreamReader ir=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("porder.txt")));
		System.out.println("请输入您的姓名:");
		String sr=br.readLine();
		bw.write("您的姓名为:"+sr);
		System.out.println("您的姓名为:"+sr);
		br.close();
		bw.flush();
		bw.close();
	}

}
