package com.thread;

import org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolver;

class DeadLockThread implements Runnable{
	//定义两个不同的锁对象
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
	public DeadLockThread(boolean flag) {
		this.flag=flag;
	}
	
	@Override
	public void run() {
		if (flag) {
			while (true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
					synchronized (knifeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
					}
				}
			}
			
		}else {
			while(true) {
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
					synchronized (chopsticks) {
						System.out.println(Thread.currentThread().getName()+"---else---chopsticks");
					}
				}
			}
		}
	}
}
public class Thread_test14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		
		new Thread(new DeadLockThread(true),"chinese").start();
		new Thread(new DeadLockThread(false),"American").start();
		
		

	}

}
