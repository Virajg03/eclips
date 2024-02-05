package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person1 {

	private List<String> friends;
	private Map<String, Integer> feeStruct;
	private Properties props;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeeStruct() {
		return feeStruct;
	}

	public void setFeeStruct(Map<String, Integer> feeStruct) {
		this.feeStruct = feeStruct;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

}
