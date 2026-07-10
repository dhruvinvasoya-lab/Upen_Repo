import io.testgrid.listeners.TestListener;
import io.testgrid.tg;
import org.testng.annotations.Listeners;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class tdmdoublejson {

	@Test
	public void tdmdoublejson() {
		tg.openDevice();
		tg.wait(5);
		tg.testFunction("addtabnew");
		tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_SearchortypeURLEditText1");
		tg.type("ele_SearchortypeURLEditText1", "https://demo.automationtesting.in/Register.html", true);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click(); 
		END_CUSTOM_SCRIPT;
		tg.wait(10);
		JSONObject var_Data = tg.getJsonData("https://testing.testgrid.io/s/csv-to-json/20240924/aW0lSy.json");
		tg.printLogs(var_Data);
		tg_String var_name = "";
		var_name = tg.saveToVariable(var_name, var_Data, "$.records[0].FirstName");
		tg.type("ele_Firstnameregister", var_name, true);
		tg.wait(2);
		tg_Double var_DB = 1.1;
		var_DB = tg.saveToVariable(2.2, var_DB);
		tg.click("ele_Lastnamereg", 1);
		tg.type("ele_Lastnamereg", var_DB, true);
		tg.wait(2);
		tg.close();
	}
}