package org.selfservice;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.selfservice.bean.Clothes;
import org.selfservice.utils.ProductsXmlUtils;

public class ProductsXmlUtilsTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		List<Clothes> clothes=ProductsXmlUtils.parserProductFromXml();
		System.out.println(Arrays.toString(clothes.toArray()));
	}

}
