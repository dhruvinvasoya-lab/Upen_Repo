class nothanks {

	public static void nothanks() {
		if(tg.performAssert("ele_NothanksButton1", ComparisonType.IS_VISIBLE)){
		tg.click("ele_NothanksButton", 1);
		}
		tg.wait(5);
	}
}