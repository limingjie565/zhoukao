package com.lmj.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Goods {

	private Integer id;
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date datea;
	private Integer pid;
	private Double price;
	private int status;

	private String pname;

	public Goods(Integer id, String name, Date datea, Integer pid, Double price, int status, String pname) {
		super();
		this.id = id;
		this.name = name;
		this.datea = datea;
		this.pid = pid;
		this.price = price;
		this.status = status;
		this.pname = pname;
	}

	public Goods() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDatea() {
		return datea;
	}

	public void setDatea(Date datea) {
		this.datea = datea;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", datea=" + datea + ", pid=" + pid + ", price=" + price
				+ ", status=" + status + ", pname=" + pname + "]";
	}

	public Goods(String name, Date datea, Integer pid, Double price) {
		super();
		this.name = name;
		this.datea = datea;
		this.pid = pid;
		this.price = price;
	}

	public Goods(Integer id, String name, Date datea, Integer pid, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.datea = datea;
		this.pid = pid;
		this.price = price;
	}

	
}
