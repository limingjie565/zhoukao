package com.lmj.mapper;

import java.util.List;
import java.util.Map;

import com.lmj.pojo.Goods;
import com.lmj.pojo.Type;

public interface GoodsMapper {

	List<Goods> list(Map<String, Object> map);
	List<Type> type();
	int add(Goods goods); 
	int del(String [] array);
	Goods show(long id);
	int upd(Goods goods); 
	
}
