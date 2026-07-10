class demodata {

	public static void demodata() {
		tg_String var_Fname = "";
		var_Fname = tg.saveToVariable("Kartik", var_Fname);
		tg_String var_Lname = "";
		var_Lname = tg.saveToVariable("Makwana", var_Lname);
		tg.check.isVisible("ele_FirstNamePrForm");
		tg.click("ele_FirstNamePrForm", 1);
		tg.type("ele_FirstNamePrForm", var_Fname, true);
		tg.type("ele_lastNameEditText", var_Lname, true);
		tg.wait(5);
	}
}