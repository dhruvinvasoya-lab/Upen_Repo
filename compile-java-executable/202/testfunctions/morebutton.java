class morebutton {

	public static void morebutton() {
		tg.wait("ele_MoreButton", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_MoreButton");
		tg.click("ele_MoreButton", 1);
		tg.wait(4);
	}
}