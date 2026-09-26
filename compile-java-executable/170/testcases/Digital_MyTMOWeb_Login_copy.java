import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
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
public class Digital_MyTMOWeb_Login_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void Digital_MyTMOWeb_Login_copy() {
		tg.openBrowser();
		tg_String var_configSF2URL = "";
		tg_String var_qlab06SF2Url = "";
		tg_String var_configEnv = "";
		tg_String var_qlab06Config = "";
		START_CUSTOM_SCRIPT;
		JSONObject envConfigObject;
		 var_configSF2URL = driver.getCurrentUrl();
		  if (var_configSF2URL.startsWith(var_qlab06SF2Url)) {
		var_configEnv = "qlab06";
		  }
		END_CUSTOM_SCRIPT;
		tg.testFunction("fnClickViewBill_copy");
		tg.close();
	}
}