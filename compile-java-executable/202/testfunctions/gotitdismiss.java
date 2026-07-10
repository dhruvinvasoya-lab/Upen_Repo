class gotitdismiss {

	public static void gotitdismiss() {
		tg.wait(2);
		if(tg.performAssert("ele_EnhancedadprivacyinChromeTextView", ComparisonType.IS_VISIBLE)){
		tg.swipe(Direction.UP);
		tg.click("ele_GotitButton", 1);
		}
		tg.wait(5);
	}
}