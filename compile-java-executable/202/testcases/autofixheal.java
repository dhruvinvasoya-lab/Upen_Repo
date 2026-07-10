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
public class autofixheal {

	@Test
	public void autofixheal() {
		tg.openDevice();
		tg.wait(5);
		tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_SearchortypeURLEditText1");
		tg.type("ele_SearchortypeURLEditText1", "https://www.amazon.in/", true);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click(); 
		END_CUSTOM_SCRIPT;
		tg.wait(10);
		tg.wait("ele_OpenMenuButton", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_OpenMenuButton");
		tg.click("ele_OpenMenuButton", 1);
		tg.wait(3);
		tg.close();
	}
}