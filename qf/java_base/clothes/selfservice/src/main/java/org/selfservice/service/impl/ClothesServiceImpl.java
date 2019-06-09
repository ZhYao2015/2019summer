package org.selfservice.service.impl;

import java.util.List;

import org.selfservice.bean.Clothes;
import org.selfservice.service.ClothesService;
import org.selfservice.utils.BusinessException;
import org.selfservice.utils.ClothesIO;
import org.selfservice.utils.ProductsXmlUtils;

public class ClothesServiceImpl implements ClothesService {

	
	private ClothesIO clothesIO=new ClothesIO();
	
	@Override
	public List<Clothes> list() throws BusinessException {
		// TODO Auto-generated method stub
		
		return clothesIO.list();
	}

	@Override
	public Clothes findById(String cid) throws BusinessException {
		// TODO Auto-generated method stub
		return clothesIO.findById(cid);
	}

	@Override
	public void update() throws BusinessException {
		// TODO Auto-generated method stub
		clothesIO.update();
	}
	
}
