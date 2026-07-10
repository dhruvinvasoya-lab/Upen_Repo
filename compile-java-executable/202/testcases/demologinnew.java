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
public class demologinnew {

	@Test
	public void demologinnew() {
		tg.openDevice();
		tg.wait(5);
		tg.testFunction("addtabnew");
		tg.wait(4);
		tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_SearchortypeURLEditText1");
		tg.type("ele_SearchortypeURLEditText1", "https://practicetestautomation.com/practice-test-login/", false);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click(); 
		END_CUSTOM_SCRIPT;
		tg.wait("ele_practiceopenmenubtn", ComparisonType.IS_VISIBLE, 10);
		tg.scroll("ele_SubmitButtonNew", Direction.DOWN);
		tg.wait(4);
		tg.type("ele_practiceusername", "kartik@123", true);
		tg.wait(4);
		tg.type("ele_practicepasswordbtn", "StringPassword", true);
		tg.wait(4);
		tg.click("ele_SubmitButtonNew");
		tg.wait(5);
		tg.scroll("ele_practiceopenmenubtn", Direction.UP);
		tg.close();
	}
}