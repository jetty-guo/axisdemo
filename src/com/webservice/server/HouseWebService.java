package com.webservice.server;

import com.webservice.domain.Person;

public interface HouseWebService {
	
	public Person getHouseList(String xmlStr);
}
