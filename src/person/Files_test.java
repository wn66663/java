package person;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws Exception {
		Path lujing=Paths.get("d:\\dx\\❤");
		Files.createDirectories(lujing);
		Path wj=Paths.get("d:\\dx\\❤\\a.txt");
		Files.createFile(wj);
		List<String> list=new ArrayList<String>();
		list.add("这是一个测试文件");
		Files.write(wj, list, StandardOpenOption.APPEND);
		List<String> lines=Files.readAllLines(wj);
		System.out.println("文件的内容为:"+lines);
		System.out.println("文件的大小为:"+Files.size(wj));
	}

}
