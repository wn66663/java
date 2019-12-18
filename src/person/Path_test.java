package person;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_test {

	public static void main(String[] args) {
		Path path=Paths.get("E:\\Java作业管理器\\java\\src\\com\\zhuanghuan\\String_StringBuffer.java");
		System.out.println("根路径为:"+path.getRoot());
		System.out.println("父路径为:"+path.getParent());
		System.out.println("名称数位:"+path.getNameCount());
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println("索引为"+i+"的路径名称为"+path.getName(i));
			
		}
		System.out.println("URI路径为"+path.toUri());
		System.out.println("绝对路径为:"+path.toAbsolutePath());
	}

}
