package person;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class WenjianCopy {

	public static void main(String[] args) throws Exception {
		//源文件
		RandomAccessFile ywj=new RandomAccessFile("D:\\2013030507151891.jpg", "rw");
		//获取源文件
		FileChannel yfc=ywj.getChannel();
		//目标文件
		RandomAccessFile mbwj=new RandomAccessFile("D:\\20130305071518912.jpg", "rw");
		//获取目标通道
		FileChannel mbfc=mbwj.getChannel();
		//执行复制
		long cg=yfc.transferTo(0, yfc.size(), mbfc);
		if (cg>0) {
			System.out.println("复制成功");
		}else {
			System.out.println("复制失败");
		}
		yfc.close();
		ywj.close();
		mbfc.close();
		mbwj.close();
	}

}
