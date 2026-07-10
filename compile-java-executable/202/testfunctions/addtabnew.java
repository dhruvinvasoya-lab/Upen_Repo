class addtabnew {

	public static void addtabnew() {
		tg.wait(3);
		tg.wait("ele_SwitchtabsImageButton", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_SwitchtabsImageButton", 1);
		tg.wait(3);
		tg.wait("ele_NewTAB", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_NewTAB", 1);
		tg.wait(4);
	}
}