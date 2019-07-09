package org.tud.zyao.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Utils {
	public static String md5(String password) {
		try {
			MessageDigest messageDigest=MessageDigest.getInstance("md5");
			messageDigest.update(password.getBytes());
			
			byte[] encode=messageDigest.digest();
			
			BigInteger b=new BigInteger(1,encode);
			
			return b.toString(16);
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
