class gotit {

	public static void gotit() {
		tg.wait("ele_SettingsButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_GotitButton", 1);
		tg.wait(5);
	}
}