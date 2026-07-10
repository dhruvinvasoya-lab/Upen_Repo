class gmailsearch {

	public static void gmailsearch() {
		tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_SearchortypeURLEditText1");
		tg.type("ele_SearchortypeURLEditText1", "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=ARpgrqeHUgYX-9BV_8F2bSkWJb8dMKMznEwqMWBn8U6E-aEZZIELcLGCQ2-tsDM1nP221pbAXEIo&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S355937431%3A1727107661075557&ddm=0", true);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click(); 
		END_CUSTOM_SCRIPT;
		tg.wait(10);
	}
}