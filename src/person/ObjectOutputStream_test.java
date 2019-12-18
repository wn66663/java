package person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_test {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("d:\\xingmin.txt"));
		Person p1=new Person("yaasuo",18);
		out.writeObject(p1);
		//输入流
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:\\xingmin.txt"));
		Person p=(Person)in.readObject();
		System.out.println("name="+p.getName());
		System.out.println("age="+p.getAge());
	}

}
