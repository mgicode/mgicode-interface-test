package com.mgicode.test.service;

import java.util.ArrayList;
import java.util.List;

import com.mgicode.test.domain.ApiConfig;
import com.mgicode.test.domain.ApiRequest;
import com.mgicode.test.domain.Asserts;
import com.mgicode.test.domain.InRule;

public class RequestGen {

	public List<ApiRequest> gen(ApiConfig apiConfig) {
		if (apiConfig == null) {
			return null;
		}

		List<ApiRequest> retList = new ArrayList<ApiRequest>();

		for (Asserts as : apiConfig.getAsserts()) {
			retList.addAll(gen(as, apiConfig));
		}

		return retList;
	}
	
	
	public List<ApiRequest> gen(Asserts as, ApiConfig apiConfig) {
        		
		if(as.getCount().equals("n")) {			
			
			InRule inRule;
			//as.getIn()
			apiConfig.getInRule();
						
			
		}
		
		
		
		return null;
	}
	

	
	//public List<ApiRequest>
	
	/**
	 * 把生成的数据生成json返回
	 * @param apis
	 * @return
	 */
	public String toJson( List<ApiRequest> apis) {		
		return null;
	}

}
