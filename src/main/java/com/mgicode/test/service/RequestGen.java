package com.mgicode.test.service;

import java.util.ArrayList;
import java.util.List;

import com.mgicode.test.domain.ApiConfig;
import com.mgicode.test.domain.ApiRequest;
import com.mgicode.test.domain.Asserts;
import com.mgicode.test.domain.InRule;
import com.mgicode.test.rules.InRuleUtils;
import com.mgicode.test.service.ingen.IInDataGen;
import com.mgicode.test.service.ingen.SimpleInDataGen;

public class RequestGen {

	public List<ApiRequest> gen(ApiConfig apiConfig) {
		if (apiConfig == null) {
			return null;
		}

		List<ApiRequest> retList = new ArrayList<ApiRequest>();

		for (Asserts as : apiConfig.getAsserts()) {
			InRuleUtils.initInRuleState(apiConfig.getInRule());
			retList.addAll(gen(as, apiConfig));
		}

		return retList;
	}

	public List<ApiRequest> gen(Asserts as, ApiConfig apiConfig) {

		// todo:到时候通过参数来进行配置
		IInDataGen inDataGen = new SimpleInDataGen();
		List<ApiRequest> list = inDataGen.gen(as, apiConfig);

		return list;

	}

	// public List<ApiRequest>

	/**
	 * 把生成的数据生成json返回
	 * 
	 * @param apis
	 * @return
	 */
	public String toJson(List<ApiRequest> apis) {
		return null;
	}

}
