package com.jihe;

import java.io.File;
import java.text.SimpleDateFormat;


public class File_test {
	public static void main(String[] args) {
		File in=new File("test.txt");
		System.out.println("文件名称:"+in.getName());
		System.out.println("文件的相对路径:"+in.getPath());
		System.out.println("文件的绝对路径:"+in.getAbsolutePath());
		System.out.println("文件的父路径:"+in.getParent());
		System.out.println(in.canRead()?"文件可读":"文件不可读");
		System.out.println(in.canWrite()?"文件可写":"文件不可写");
		System.out.println(in.isFile()?"是一个文件":"是一个目录");
		System.out.println(in.isDirectory()?"是一个目录":"是一个文件");
		SimpleDateFormat a=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println("最后修改的时间为:"+a.format(in.lastModified()));
		System.out.println("文件大小为:"+in.length());
		System.out.println("是否成功删除文件"+in.delete());
		
	}
}
