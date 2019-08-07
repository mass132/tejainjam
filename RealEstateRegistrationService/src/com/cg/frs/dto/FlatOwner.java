package com.cg.frs.dto;

public class FlatOwner {
	@Override
	public String toString() {
		return "FlatOwner [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
	private int id;
	private String name;
	private String mobile;
	public FlatOwner(int id, String name, String i) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = i;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
