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
public class recordplay {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void recordplay() {
		tg.openDevice();
				tg.wait("ele_TabBarItemTitleTextField1783682569971", ComparisonType.IS_VISIBLE);
				tg.click("ele_TabBarItemTitleTextField1783682569971", 1);
				tg.wait("ele_URLTextField1783682576631", ComparisonType.IS_VISIBLE);
				tg.click("ele_URLTextField1783682576631", 1);
				tg.wait("ele_URLTextField1783682576631", ComparisonType.IS_VISIBLE);
				tg.type("ele_URLTextField1783682576631", "192.168.88.17:80/Demo", true);
				tg.wait("ele_GoButton1783682589558", ComparisonType.IS_VISIBLE);
				tg.click("ele_GoButton1783682589558", 1);
				tg.wait(2);
		tg.close();
	}
}