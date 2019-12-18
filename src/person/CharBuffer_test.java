package person;

import java.nio.CharBuffer;

public class CharBuffer_test {

	public static void main(String[] args) {
		CharBuffer cbf=CharBuffer.allocate(6);
		System.out.println("这个字符缓冲区容量为:"+cbf.capacity());
		System.out.println("这个字符缓冲界限值为:"+cbf.limit());
		System.out.println("这个字符缓冲区初始位置是:"+cbf.position());
		//添加
		cbf.put('a');cbf.put('b');cbf.put('c');
		System.out.println("添加元素后这个字符缓冲区容量为:"+cbf.capacity());
		System.out.println("添加元素后这个字符缓冲界限值为:"+cbf.limit());
		System.out.println("添加元素后这个字符缓冲区初始位置是:"+cbf.position());
		//反转
		cbf.flip();
		System.out.println("添加元素后反转这个字符缓冲区容量为:"+cbf.capacity());
		System.out.println("添加元素后反转这个字符缓冲界限值为:"+cbf.limit());
		System.out.println("添加元素后反转这个字符缓冲区初始位置是:"+cbf.position());
		//取出第一个元素
		System.out.println("取出第一个元素:"+cbf.get());
		System.out.println("添加元素后反转取出第一个元素后这个字符缓冲区容量为:"+cbf.capacity());
		System.out.println("添加元素后反转取出第一个元素后这个字符缓冲界限值为:"+cbf.limit());
		System.out.println("添加元素后反转取出第一个元素后这个字符缓冲区初始位置是:"+cbf.position());
		//执行删除后
		cbf.clear();
		System.out.println("执行clear后这个字符缓冲区容量为:"+cbf.capacity());
		System.out.println("执行clear后这个字符缓冲界限值为:"+cbf.limit());
		System.out.println("执行clear后这个字符缓冲区初始位置是:"+cbf.position());
	}

}
