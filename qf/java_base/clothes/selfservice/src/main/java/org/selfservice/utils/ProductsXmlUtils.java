package org.selfservice.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.selfservice.bean.Clothes;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;

public class ProductsXmlUtils {
	
	public static List<Clothes> parserProductFromXml(){
		List<Clothes> products=new ArrayList<>();
		XStream xstream=new XStream(new Xpp3Driver());
		xstream.alias("list", products.getClass());
		xstream.alias("clothes", Clothes.class);
		xstream.useAttributeFor(Clothes.class,"id");
		
		try{
			BufferedInputStream inputStream=new BufferedInputStream(
					new FileInputStream("products.xml"));
			products=(List<Clothes>)xstream.fromXML(inputStream);
			inputStream.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return products;
		
	}
	
	public static void writeProductToXml(List<Clothes> products){
		XStream xstream=new XStream(new Xpp3Driver());
		xstream.alias("list", products.getClass());
		xstream.alias("clothes", Clothes.class);
		xstream.useAttributeFor(Clothes.class,"id");
		
		try{
			BufferedOutputStream outputStream=new BufferedOutputStream(
					new FileOutputStream("products.xml"));
			outputStream.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>".getBytes());
			xstream.toXML(products, outputStream);
			outputStream.close();
		}catch(IOException e){
			
		}
	}
}
