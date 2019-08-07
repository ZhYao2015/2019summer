package org.tud.zyao.service;

import org.tud.zyao.domain.PageBean;

public interface StudentService {
	PageBean findByPage(int pageNum,int pageSize);
}
