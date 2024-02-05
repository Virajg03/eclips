package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	Certi certi;
	List<String> list;

	Person(String name, int personId, Certi certi, List<String> list) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.list = list;
	}

	@Override
	public String toString() {

		return this.name + ":" + this.personId + "{ " + certi.name + " }" + this.list;
	}

}
