package com.jihe;

import java.io.File;
import java.util.Arrays;

public class Bianli {

	public static void main(String[] args) {
		File file=new File("d:\\out.txt");
		if (file.isDirectory()) {
			String[] fileNames=file.list();
			Arrays.stream(fileNames)
					.forEach(f->System.out.println(f));
		}
	}

}
