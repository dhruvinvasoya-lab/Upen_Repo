class withoutaccountfunc {

	public static void withoutaccountfunc() {
		tg.wait(2);
		if(tg.performAssert("ele_withoutaccount", ComparisonType.IS_VISIBLE)){
		tg.click("ele_withoutaccount", 1);
		}
		tg.wait(5);
	}
}