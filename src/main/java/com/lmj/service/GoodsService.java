package com.lmj.service;

import java.util.List;
import java.util.Map;

import com.lmj.pojo.Goods;
import com.lmj.pojo.Type;

public interface GoodsService {

	List<Goods> list(Map<String, Object> map);
	List<Type> type();
	int add(Goods goods); 
	int del(String ids);
	Goods show(long id);
	int upd(Goods goods); 
	
}
