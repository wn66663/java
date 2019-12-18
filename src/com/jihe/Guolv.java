package com.jihe;

import java.io.File;
import java.io.FileDescriptor;
import java.util.Arrays;

public class Guolv {

	public static void main(String[] args) {
		File file=new File("E:\\Java作业管理器");
		FileDir(file);
		/*if (file.isDirectory()) {
			String[] fileNames=file.list((dir,name)->name.endsWith(".txt"));
			Arrays.stream(fileNames)
				.forEach(f->System.out.println(f));
		}*/

	}

	private static void FileDir(File file) {
		File[] listFiles=file.listFiles();
		for (File files : listFiles) {
			if (files.isDirectory()) {
				FileDir(files);
			}
			else if (files.isFile()) {
				String[] fileNames=file.list((dir,name)->name.endsWith(".java"));
				Arrays.stream(fileNames)
					.forEach(f->System.out.println(f));
				//System.out.println(files);
			}
			//System.out.println(files);
		}
		
	}

}
