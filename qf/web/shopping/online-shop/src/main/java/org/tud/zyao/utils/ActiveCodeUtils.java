package org.tud.zyao.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ActiveCodeUtils {
	public static String createActiveCode() {
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String s1=df.format(date);
		String s2=Integer.toHexString((new Random()).nextInt(900)+100);
		return s1+s2;
	}
}
