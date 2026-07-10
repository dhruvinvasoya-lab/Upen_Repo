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
public class tdmjson {

	@Test
	public void tdmjson() {
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
		tg_String var_fname = "null";
		tg_String var_lname = "null";
		tg_int var_count = 0;
		while(tg.verify.isLessThan(var_count, 3)){
		tg.wait(5);
		var_fname = tg.saveToVariable(var_fname, var_Data, "$.records["+var_count+"].FirstName");
		tg.type("ele_Firstnameregister", var_fname, false);
		tg.wait(5);
		var_lname = tg.saveToVariable(var_lname, var_Data, "$.records["+var_count+"].LastName");
		tg.type("ele_Lastnameregister1", var_lname, false);
		tg.wait(4);
		var_count = tg.increments(var_count, 1);
		}
		tg.close();
	}
}