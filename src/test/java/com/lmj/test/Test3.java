package com.lmj.test;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lmj.mapper.GoodsMapper;
import com.lmj.pojo.Goods;

public class Test3 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		GoodsMapper bean = ctx.getBean(GoodsMapper.class);
	}
	
}
