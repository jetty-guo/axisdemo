package com.webservice.server.impl;

import com.webservice.domain.Person;
import com.webservice.server.HouseWebService;

public class HouseWebServiceImpl implements HouseWebService {

	@Override
	public Person getHouseList(String xmlStr) {
		
		System.out.println(xmlStr);
		Person person = new Person();
		person.setAge(23);
		person.setName("郭帅");
		
		return person ;
	}

}
