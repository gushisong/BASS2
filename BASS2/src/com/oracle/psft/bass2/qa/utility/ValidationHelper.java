package com.oracle.psft.bass2.qa.utility;

public class ValidationHelper {
	
	public static <T> T checkNull(String message, T object)
	{
		if (object == null) {
            throw new NullPointerException(message);
        }
        return object;
	}



}
