package com.net.chart;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSender implements Runnable {
	private DatagramSocket ds; 
	private int port;
	public ChatSender(DatagramSocket ds, int port) {
		this.ds=ds;
		this.port=port;
	}

	@Override
	public void run() {

		Scanner sc=new Scanner(System.in);
			while(true) {
				System.out.println("我说：");
				//定义要发送的数据
				String str=sc.nextLine();
				try {
					
					
					//将数据转换为二进制字节数组
					byte[] zjsz=str.getBytes("UTF-8");
					System.out.println("这条信息要发送给哪个IP:");
					
					String ip=sc.nextLine();
					//创建要发送的数据报
					DatagramPacket dp=new DatagramPacket(zjsz, zjsz.length,InetAddress.getByName(ip),8900);
					ds.send(dp);
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				
				
			}
	}

}
