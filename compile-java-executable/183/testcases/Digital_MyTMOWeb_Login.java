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

@Listeners(TestListener.class);
public class digital_mytmoweb_login {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_login() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy");
		tg.testFunction("fnAcceptCookies_copy");
		tg.testFunction("fnClickViewBill_copy");
		// [DISABLED] tg.testFunction("fnClickOnPastBills_copy");
		// [DISABLED] tg.testFunction("fnDontAllowNotificationPopUp_copy");
		// [DISABLED] tg.testFunction("fnClickOnRecentPastBills_copy");
		// [DISABLED] tg.testFunction("fnClickBackButton_copy");
		// [DISABLED] tg.testFunction("fnlogoutRestored_copy");
		tg.close();
	}
}