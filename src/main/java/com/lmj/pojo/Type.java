package com.lmj.pojo;

public class Type {

	private Integer pid;
	private String pname;

	public Type(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public Type() {
		super();
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Type [pid=" + pid + ", pname=" + pname + "]";
	}

}
