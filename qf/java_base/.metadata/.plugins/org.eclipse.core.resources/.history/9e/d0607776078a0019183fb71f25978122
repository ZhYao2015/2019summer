package org.selfservice.service.impl;

import java.util.List;

import org.selfservice.bean.Clothes;
import org.selfservice.service.ClothesService;
import org.selfservice.utils.BusinessException;
import org.selfservice.utils.ProductsXmlUtils;

public class ClothesServiceImpl implements ClothesService {

	@Override
	public List<Clothes> list() throws BusinessException {
		// TODO Auto-generated method stub
		List<Clothes> clothes=ProductsXmlUtils.parserProductFromXml();
		
		return clothes;
	}
	
}
