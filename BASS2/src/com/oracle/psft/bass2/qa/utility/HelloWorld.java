package com.oracle.psft.bass2.qa.utility;

import org.openqa.selenium.WebDriver;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Test");
		
		String userName=null;
		ValidationHelper.checkNull("username is numm", userName);
		
	}

}
