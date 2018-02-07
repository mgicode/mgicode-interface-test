package com.mgicode.test.domain;

import java.util.List;
import java.util.Map;

public class InRule {
	private String type;//obj,list,string,data,long,int,float,date,boolean
	private boolean required;//true,false;
	private boolean unique;	
	private String dbType;
	private String desc;
	private String createRule;
	private String restraint;
	private String limit;
	
	private Map<String, InRule> dataRule;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	public boolean isUnique() {
		return unique;
	}
	public void setUnique(boolean unique) {
		this.unique = unique;
	}
	
	public Map<String, InRule> getDataRule() {
		return dataRule;
	}
	public void setDataRule(Map<String, InRule> dataRule) {
		this.dataRule = dataRule;
	}
	public String getDbType() {
		return dbType;
	}
	public void setDbType(String dbType) {
		this.dbType = dbType;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCreateRule() {
		return createRule;
	}
	public void setCreateRule(String createRule) {
		this.createRule = createRule;
	}
	public String getRestraint() {
		return restraint;
	}
	public void setRestraint(String restraint) {
		this.restraint = restraint;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}

	
	
	//---inRule---
//	{
//		"required": false,
//		"type": "obj",
//		"unique": true,
//		"dataRule": {
//			"laneEnSeriaNo": {
//				"required": false,
//				"unique": true,
//				"type": "string",
//				"dbType": "text",
//				"desc": "车道编码+出口时间",
//				"createRule": "",
//				"restraint": "正则表达式",//"length": "1...20"//[1...20]
//
//				"limit": "1...20"
//			},
//			"enTime": {
//				"required": false,
//				"type": "date",
//				"dbType": "text",
//				"unique": true,
//				"desc": "En",
//				"createRule": "",
//				"restraint": "正则表达式"
//			},
//			"enTime": {
//				"required": false,
//				"type": "int",
//				"dbType": "text",
//				"unique": true,
//				"desc": "车道编码+出口时间",
//				"createRule": "",
//				"restraint": "正则表达式",
//				"limit": "[1...20]"//最小值和最大值，包括边界值
//
//			},
//			"enTime": {
//				"required": false,
//				"type": "long",
//				"dbType": "text",
//				"unique": true,
//				"desc": "En+站点编码+车道编码+出口时间(年月日时分秒毫 秒)",
//				"createRule": "",//_constom:fnName
//
//				"restraint": "正则表达式",//__email,__integer,__az09,__chinese
//
//				"limit": "1...20"//最小值和最大值，
//
//			},
//			"enTime": {
//				"required": false,
//				"type": "float",
//				"dbType": "text",
//				"unique": true,
//				"desc": "车道编码+出口时间",
//				"createRule": "",
//				"restraint": "正则表达式",
//				"limit": "1...20"//最小值和最大值
//
//			},
//			"users": {
//				"required": false,
//				"type": "list",
//				"unique": true,
//				"dataRule": {
//					
//				}
//			}
//		}
//	}		

}
