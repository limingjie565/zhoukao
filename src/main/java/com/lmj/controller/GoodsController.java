package com.lmj.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmj.pojo.Goods;
import com.lmj.pojo.Type;
import com.lmj.service.GoodsService;

@Controller
public class GoodsController {

	@Resource
	private GoodsService gService;
	
	@RequestMapping("list")
	public String list(String name,Model model,@RequestParam(defaultValue = "1")Integer pageNum) {
		PageHelper.startPage(pageNum, 3);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		List<Goods> list = gService.list(map);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		model.addAttribute("page", page);
		return "list";
	}
	@RequestMapping("type")
	@ResponseBody
	public List<Type> type(){
		List<Type> type = gService.type();
		return type;
	}
	
	@RequestMapping("add")
	public String add(Goods goods) {
		Date datea = new Date();
		goods.setDatea(datea);
		gService.add(goods);
		return "redirect:list";
	}
	
	@RequestMapping("del")
	@ResponseBody
	public boolean del(String ids){
		gService.del(ids);
		return true;
	}
	
	@RequestMapping("show")
	@ResponseBody
	public Goods show(long id){
		Goods show = gService.show(id);
		return show;
	}
	
	@RequestMapping("upd")
	public String upd(Goods goods) {
		Date datea = new Date();
		goods.setDatea(datea);
		gService.upd(goods);
		return "redirect:list";
	}
}
