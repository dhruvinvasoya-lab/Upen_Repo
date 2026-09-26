import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

class fnlogoutrestored {

	public static void fnlogoutrestored() {
		if(tg.performAssert("ele_loginUserButton", ComparisonType.IS_INVISIBLE)){
		tg.wait("ele_backButton", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_backButton", 1);
		}
		tg.wait("ele_loginUserButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_loginUserButton", 1);
		tg.wait("ele_logoutButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_logoutButton", 1);
		tg.check.isVisible("ele_loginDiv");
	}
}