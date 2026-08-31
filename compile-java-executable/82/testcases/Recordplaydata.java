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
public class recordplaydata {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void recordplaydata() {
		tg.openDevice();
				tg.wait("ele_TabBarItemTitleTextField1788193259746", ComparisonType.IS_VISIBLE);
				tg.click("ele_TabBarItemTitleTextField1788193259746", 1);
				tg.wait("ele_URLTextField1788193268520", ComparisonType.IS_VISIBLE);
				tg.click("ele_URLTextField1788193268520", 1);
				tg.wait("ele_URLTextField1788193268520", ComparisonType.IS_VISIBLE);
				tg.type("ele_URLTextField1788193268520", "https://public.testgrid.io/signup", false);
				tg.wait("ele_GoButton1788193279811", ComparisonType.IS_VISIBLE);
				tg.click("ele_GoButton1788193279811", 1);
				tg.wait(5);
		tg.close();
	}
}