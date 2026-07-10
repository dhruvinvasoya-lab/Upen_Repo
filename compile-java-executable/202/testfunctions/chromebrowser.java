class chromebrowser {

	public static void chromebrowser() {
		tg.check.isVisible("ele_UsewithoutanaccountButton");
		tg.click("ele_UsewithoutanaccountButton", 1);
		tg.wait(5);
		tg.wait("ele_SettingsButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_GotitButton", 1);
		tg.wait(5);
	}
}