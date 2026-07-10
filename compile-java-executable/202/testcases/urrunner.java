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
public class urrunner {

	@Test
	public void urrunner() {
		tg.openDevice();
		tg.wait("ele_EditTextEnteremailaddress", ComparisonType.IS_VISIBLE);
		tg.click("ele_EditTextEnteremailaddress", 1);
		tg.wait("ele_EditTextEnteremailaddress", ComparisonType.IS_VISIBLE);
		tg.type("ele_EditTextEnteremailaddress", "km@gmail.com", true);
		tg.wait("ele_EditTextEnterpassword", ComparisonType.IS_VISIBLE);
		tg.click("ele_EditTextEnterpassword", 1);
		tg.wait("ele_EditTextEnterpassword", ComparisonType.IS_VISIBLE);
		tg.type("ele_EditTextEnterpassword", "12345", true);
		tg.wait("ele_ImageButton1717065403577", ComparisonType.IS_VISIBLE);
		tg.click("ele_ImageButton1717065403577", 1);
		tg.wait("ele_ButtonSignIn", ComparisonType.IS_VISIBLE);
		tg.click("ele_ButtonSignIn", 1);
		tg.close();
	}
}