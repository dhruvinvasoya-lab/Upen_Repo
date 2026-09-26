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

class fndigitalwebloginprod {

	public static void fndigitalwebloginprod() {
		tg.wait("ele_myaccountSpan", ComparisonType.IS_VISIBLE);
		tg.click("ele_myaccountSpan", 1);
		tg.wait("ele_loginLink", ComparisonType.IS_VISIBLE, 20);
		tg.check.isClickable("ele_loginLink");
		tg.click("ele_loginLink", 1);
		tg.wait("ele_emailOrPhoneInput", ComparisonType.IS_VISIBLE);
		tg.click("ele_emailOrPhoneInput", 1);
		tg.type("ele_emailOrPhoneInput", var_ra_Username);
		tg.wait("ele_nextButton", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_nextButton", 1);
		tg.startSecureBlock();
		tg.wait("ele_passwordInput", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_passwordInput", 1);
		tg.wait("ele_passwordInput", ComparisonType.IS_VISIBLE);
		tg.type("ele_passwordInput", var_Password);
		tg.endSecureBlock();
		tg.wait("ele_LoginButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_LoginButton", 1);
		tg.printLogs("Complete Login");
	}
}