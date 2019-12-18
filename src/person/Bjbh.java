package person;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bjbh {

	public static void main(String[] args) throws Exception {
		Path path=Paths.get("d:\\班级信息.txt");
		Path bjmc=Paths.get("d:\\求班级编号.txt");
		Path bjbh=Paths.get("d:\\班级编号.txt");
		List<String> lines=Files.readAllLines(path);
		List<String> names=Files.readAllLines(bjmc);
		List<String> neirong=new ArrayList<String>();
		Map<String, String> map=new HashMap<>();
		Files.createFile(bjbh);
		for (String line : lines) {
			String[] zfszs=line.split("	");
			map.put(zfszs[1],zfszs[0]);
		}
		for (String name : names) {
			neirong.add(map.get(name));
		}
		Files.write(bjbh, neirong, StandardOpenOption.APPEND);
	}

}
