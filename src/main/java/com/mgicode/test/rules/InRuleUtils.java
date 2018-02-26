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
			dotName = name +"."+ inrule.getName();
		}
		icb.exec(level, dotName, inrule);
		if (inrule.getDataRule() != null && inrule.getDataRule().size() > 0) {
			for (InRule child : inrule.getDataRule().values()) {
				icb.exec(level + 1, dotName, child);
			}
		}

		return inrule;
	}

	public static boolean loopBreak(InRule inrule, InRuleCallBack icb) {

		return loopBreak(0, "", inrule, icb);

	}

	public static boolean loopBreak(int level, String name, InRule inrule, InRuleCallBack icb) {

		String dotName = name;
		if (dotName == null || dotName.trim().isEmpty()) {
			dotName = "";
		} else {
			dotName = name + inrule.getName();
		}
		boolean flag = icb.exec(level, dotName, inrule);
		if (flag == false) {
			return false;
		}
		if (inrule.getDataRule() != null && inrule.getDataRule().size() > 0) {
			for (InRule child : inrule.getDataRule().values()) {

				boolean flag1 = icb.exec(level + 1, dotName, child);
				if (flag1 == false) {
					break;
				}
			}
		}

		return true;
	}

	/**
	 * 把inrule的excluded设定为false
	 * 
	 * @param inrule
	 */
	public static void initInRuleState(InRule inrule) {

		loop(inrule, (level, name, inrule1) -> {
			inrule1.setExcluded(false);
			return true;
		});

	}

	public interface InRuleCallBack {

		public boolean exec(int level, String name, InRule inrule);
	}

}
