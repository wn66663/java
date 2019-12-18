package person;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Chakan {

	public static void main(String[] args) throws Exception {
		Path path=Paths.get("d:\\班级信息.txt");
		Path bjmc=Paths.get("d:\\求班级编号.txt");
		Path bjbh=Paths.get("d:\\班级编号.txt");
		List<String> lines=Files.readAllLines(path);
		List<String> names=Files.readAllLines(bjmc);
		List<String> neirong=new ArrayList<String>();
		Files.createFile(bjbh);
		System.out.println("文件的内容为:"+lines);
		System.out.println("文件的大小为:"+Files.size(path)+"个字节");
		for (String name : names) {
			for (String string : lines) {
			String[] zfszs=string.split("	");
			if (name.equals(zfszs[1])) {
				//System.out.println("班级编号:"+zfszs[0]);
				neirong.add(zfszs[0]);
			}
			
		}	
		}
		Files.write(bjbh, neirong, StandardOpenOption.APPEND);
		
	}

}
