package com.mgicode.test.domain;

public class ApiRequest {

	private String chineseName;
	
	private RestApi restApi;
	private Asserts asserts;
	
	private String description;
			
	public RestApi getRestApi() {
		return restApi;
	}
	public void setRestApi(RestApi restApi) {
		this.restApi = restApi;
	}
	public Asserts getAsserts() {
		return asserts;
	}
	public void setAsserts(Asserts asserts) {
		this.asserts = asserts;
	}
	
	public String getChineseName() {
		return chineseName;
	}
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
