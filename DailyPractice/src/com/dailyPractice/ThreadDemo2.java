package com.dailyPractice;

public class ThreadDemo2 {

	public static void main(String[] args) {
     Thread t = new Thread(new ThreadJob());
     t.start();
     
     
     for  (int i=0;i<=5;i++) {
    System.out.println(i);	 
     try {Thread.sleep(100);} catch(Exception e) {}
     }
	}

}

class ThreadJob implements Runnable{

	@Override
	public void run() {
    System.out.println("child thread called");		
	}
	
}
