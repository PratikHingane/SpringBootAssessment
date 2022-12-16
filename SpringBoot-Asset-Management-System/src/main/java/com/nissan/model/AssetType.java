package com.nissan.model;

public class AssetType {

	private Integer at_id;
	private String at_name;
	public AssetType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssetType(Integer at_id, String at_name) {
		super();
		this.at_id = at_id;
		this.at_name = at_name;
	}
	public Integer getAt_id() {
		return at_id;
	}
	public void setAt_id(Integer at_id) {
		this.at_id = at_id;
	}
	public String getAt_name() {
		return at_name;
	}
	public void setAt_name(String at_name) {
		this.at_name = at_name;
	}
	@Override
	public String toString() {
		return "AssetType [at_id=" + at_id + ", at_name=" + at_name + "]";
	}
	
	

}
