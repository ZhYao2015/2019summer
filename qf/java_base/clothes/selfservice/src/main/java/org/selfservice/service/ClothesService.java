package org.selfservice.service;

import java.util.List;

import org.selfservice.bean.Clothes;
import org.selfservice.utils.BusinessException;

public interface ClothesService {
	public List<Clothes> list() throws BusinessException;
	public Clothes findById(String cid) throws BusinessException;
	public void update() throws BusinessException;
}
