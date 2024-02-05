package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> phone;
	private Set<String> Addresses;
	private Map<String, String> courses;
	private Properties props;
	
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddresses() {
		return Addresses;
	}
	public void setAddresses(Set<String> addresses) {
		Addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
		
	public Emp(String name, List<String> phone, Set<String> addresses, Map<String, String> courses, Properties props) {
		super();
		this.name = name;
		this.phone = phone;
		Addresses = addresses;
		this.courses = courses;
		this.props = props;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
