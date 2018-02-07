package com.mgicode.test.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiConfig {

	private RestApi restApi;	
	private InRule inRule;	
	private OutRule outRule;
	
	private List<Asserts> asserts=new ArrayList<>();
	

	public RestApi getRestApi() {
		return restApi;
	}

	public void setRestApi(RestApi restApi) {
		this.restApi = restApi;
	}

	public InRule getInRule() {
		return inRule;
	}

	public void setInRule(InRule inRule) {
		this.inRule = inRule;
	}

	public OutRule getOutRule() {
		return outRule;
	}

	public void setOutRule(OutRule outRule) {
		this.outRule = outRule;
	}

	public List<Asserts> getAsserts() {
		return asserts;
	}

	public void setAsserts(List<Asserts> asserts) {
		this.asserts = asserts;
	}
	
	
	
}
