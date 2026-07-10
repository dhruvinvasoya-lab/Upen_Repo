class searchfunction {

	public static void searchfunction() {
		tg.wait(3);
		tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_SearchortypeURLEditText1");
		tg.type("ele_SearchortypeURLEditText1", "https://demo.automationtesting.in/Register.html", true);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click(); 
		END_CUSTOM_SCRIPT;
		tg.wait(3);
	}
}