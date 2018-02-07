package com.mgicode.test.domain;


//---interface---
//{
//	"url": "http://{{ip}}:{{port}}/tesd/dsds",
//	"requestWay": "get/post/put/patch",
//	"inway": "form-data、text/plain、aplication/json、text/xml",
//	"outway": "json、text"
//}
public class RestApi {
	private String url;
	private String requestWay; // "get/post/put/patch"
	private String inway; // "form-data、text/plain、aplication/json、text/xml",
	private String outway;  //"json、text"
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRequestWay() {
		return requestWay;
	}
	public void setRequestWay(String requestWay) {
		this.requestWay = requestWay;
	}
	public String getInway() {
		return inway;
	}
	public void setInway(String inway) {
		this.inway = inway;
	}
	public String getOutway() {
		return outway;
	}
	public void setOutway(String outway) {
		this.outway = outway;
	}
	
	
	
}
