package com.springcore;

public class Library {
	private String libName;
	private String libAddress;
	
	
	public String getLibName() {
		return libName;
	}
	public void setLibName(String libName) {
		this.libName = libName;
	}
	public String getLibAddress() {
		return libAddress;
	}
	public void setLibAddress(String libAddress) {
		this.libAddress = libAddress;
	}
	
	
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Library [libName=" + libName + ", libAddress=" + libAddress + "]";
	}
	
}
