package com.mgicode.test.service;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mgicode.test.domain.Asserts;
import com.mgicode.test.domain.InRule;
import com.google.gson.Gson;
import com.mgicode.test.domain.ApiConfig;
import com.mgicode.test.domain.RestApi;
import com.mgicode.test.domain.OutRule;

public class ConfigParser {

	// ---interface---
	// ---inRule---
	// ---outRule---
	// ---assert---
	// ---

	public ApiConfig read(String path) throws IOException {
		FileReader reader = new FileReader(path);
		BufferedReader br = new BufferedReader(reader);
		String s1 = null;

		StringBuffer restApiSb = new StringBuffer();
		StringBuffer inRuleSb = new StringBuffer();
		StringBuffer outRuleSb = new StringBuffer();
		List<StringBuffer> assertSbs = new ArrayList<>();

		StringBuffer temp = null;
		while ((s1 = br.readLine()) != null) {
			if (s1.equals("//---interface---")) {
				temp = restApiSb;
			}
			if (s1.equals("//---inRule---")) {
				temp = inRuleSb;
			}
			if (s1.equals("//---outRule---")) {
				temp = outRuleSb;
			}

			if (s1.equals("//---assert---")) {
				assertSbs.add(new StringBuffer());
				temp = assertSbs.get(0);
			}
			if (s1.equals("//---")) {
				assertSbs.add(new StringBuffer());
				temp = assertSbs.get(assertSbs.size() - 1);
			}
			temp.append(s1);

		}
		br.close();
		reader.close();

		return convert(restApiSb, inRuleSb, outRuleSb, assertSbs);
	}

	public ApiConfig convert(StringBuffer restApiSb, StringBuffer inRuleSb, StringBuffer outRuleSb,
			List<StringBuffer> assertSbs) {

		RestApi restApi = convertInterfaces(restApiSb);
		InRule inRule = convertInRules(inRuleSb);
		OutRule outRule = convertOutRules(outRuleSb);
		List<Asserts> asserts = convertAsserts(assertSbs);
		ApiConfig apiConfig = new ApiConfig();

		apiConfig.setRestApi(restApi);
		apiConfig.setInRule(inRule);
		apiConfig.setOutRule(outRule);
		apiConfig.setAsserts(asserts);
		return apiConfig;
	}

	private RestApi convertInterfaces(StringBuffer sb) {

		RestApi restApi = new Gson().fromJson(sb.toString(), RestApi.class);
		return restApi;

	}

	private InRule convertInRules(StringBuffer sb) {

		InRule inRule = new Gson().fromJson(sb.toString(), InRule.class);
		return inRule;

	}

	private OutRule convertOutRules(StringBuffer sb) {
		OutRule outRule = new Gson().fromJson(sb.toString(), OutRule.class);
		return outRule;

	}

	private List<Asserts> convertAsserts(List<StringBuffer> asserts) {
		if (asserts == null) {
			return null;
		}

		List<Asserts> asList = new ArrayList<>();
		for (StringBuffer sb : asserts) {

			Asserts asserts1 = new Gson().fromJson(sb.toString(), Asserts.class);
			asList.add(asserts1);
		}
		return asList;

	}

	// 入参模板
	// 出参模板

	// 入参数据
	// 出参数据

	// url
	// 请求方式

	// 返回的数据格式（json,纯文本）

	// 多个断言
	// 写入到全局变量

	// private Interfaces interfaces;
	//
	// private InRule inRule;
	//
	// private OutRule outRule;
	//
	// private List<Assert> asserts=new ArrayList<>();

}
