package com.lmj.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lmj.mapper.GoodsMapper;
import com.lmj.pojo.Goods;
import com.lmj.pojo.Type;
@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsMapper gMapper;
	
	public List<Goods> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return gMapper.list(map);
	}

	public List<Type> type() {
		// TODO Auto-generated method stub
		return gMapper.type();
	}

	public int add(Goods goods) {
		// TODO Auto-generated method stub
		return gMapper.add(goods);
	}

	public int del(String ids) {
		String[] split = ids.split(",");
		return gMapper.del(split);
	}

	public Goods show(long id) {
		// TODO Auto-generated method stub
		return gMapper.show(id);
	}

	public int upd(Goods goods) {
		// TODO Auto-generated method stub
		return gMapper.upd(goods);
	}

}
