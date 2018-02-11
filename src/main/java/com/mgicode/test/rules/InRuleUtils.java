package com.mgicode.test.rules;

import com.mgicode.test.domain.InRule;

public class InRuleUtils {

	public static InRule loop(InRule inrule, InRuleCallBack icb) {

		return loop(0, "", inrule, icb);

	}

	public static InRule loop(int level, String name, InRule inrule, InRuleCallBack icb) {

		String dotName = name;
		if (dotName == null || dotName.trim().isEmpty()) {
			dotName = "";
		} else {
			dotName = name + inrule.getName();
		}
		icb.exec(level, dotName, inrule);
		if (inrule.getDataRule() != null && inrule.getDataRule().size() > 0) {
			for (InRule child : inrule.getDataRule().values()) {
				icb.exec(level + 1, dotName,child);
			}
		}

		return inrule;
	}

	/**
	 * 把inrule的excluded设定为false
	 * 
	 * @param inrule
	 */
	public static void initInRuleState(InRule inrule) {

		loop(inrule, (level, name, inrule1) -> {
			inrule1.setExcluded(false);
		});

	}

	public interface InRuleCallBack {

		public void exec(int level, String name, InRule inrule);
	}

}
