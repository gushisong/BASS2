package com.oracle.psft.bass2.qa.utility;
import org.apache.log4j.Logger;
public class ThreadUtil {
	
	public static void sleep() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void sleep(int second) {
		try {
			Thread.sleep(second*1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private static void sleepMinutes(int minutes) {
		
		sleep(minutes*60);
		
	}
}
