import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
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
public class up {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void up() {
		tg.openDevice();
		tg.wait("ele_EnteremailaddressEditText1792599978719", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnteremailaddressEditText1792599978719", 1);
		tg.wait("ele_EnteremailaddressEditText1792599982281", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnteremailaddressEditText1792599982281", 1);
		tg.wait("ele_EnteremailaddressEditText1792599982281", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText1792599982281", "upenm", true);
		tg.wait("ele_EnterpasswordEditText1792599989873", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnterpasswordEditText1792599989873", 1);
		tg.wait("ele_EnterpasswordEditText1792599989873", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnterpasswordEditText1792599989873", "123", true);
		tg.wait(5);
		tg.close();
	}
}