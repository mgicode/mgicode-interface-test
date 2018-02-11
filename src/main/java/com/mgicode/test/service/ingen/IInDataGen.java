package com.mgicode.test.service.ingen;

import java.util.List;

import com.mgicode.test.domain.ApiConfig;
import com.mgicode.test.domain.ApiRequest;
import com.mgicode.test.domain.Asserts;

public interface IInDataGen {

	public List<ApiRequest> gen(Asserts as, ApiConfig apiConfig);
	
}
