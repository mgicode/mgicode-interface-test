package com.mgicode.test.domain;

import java.util.List;
import java.util.Map;

public class Asserts {
	
	private String count="1"; //"1,2,3,n, <10"
	private Map<String, ?> in;
	private List<Map<String, ?>> out;
	private  List<Map<String, ?>> write;
		
	

	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public Map<String, ?> getIn() {
		return in;
	}
	public void setIn(Map<String, ?> in) {
		this.in = in;
	}
	public List<Map<String, ?>> getOut() {
		return out;
	}
	public void setOut(List<Map<String, ?>> out) {
		this.out = out;
	}
	public List<Map<String, ?>> getWrite() {
		return write;
	}
	public void setWrite(List<Map<String, ?>> write) {
		this.write = write;
	}
	
	
	
//	{
//		"random": true,
//		"in": {
//			"laneEnSeriaNo": "{{user.name}}",
//			"enTime": "322eee"
//		},
//		"out": [
//			{
//				"name": "data.user.name",
//				"relative": "~=",
//				"value": "desd"
//			}
//		],
//		"write": [{
//			"name": "desdd",
//			"value": ""
//		}]
}
