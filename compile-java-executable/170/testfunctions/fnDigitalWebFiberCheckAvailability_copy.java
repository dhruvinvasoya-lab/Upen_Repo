import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
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

class fndigitalwebfibercheckavailability {

	public static void fndigitalwebfibercheckavailability() {
		tg.wait("ele_digitalWebBtnCheckAvailability", ComparisonType.IS_CLICKABLE, 50);
		tg.click("ele_digitalWebBtnCheckAvailability", 1);
		if(tg.performAssert("ele_digitalWebBtnAcceptTmoNotice", ComparisonType.IS_VISIBLE)){
		tg.click("ele_digitalWebBtnAcceptTmoNotice");
		}
		// [DISABLED] tg.wait(20);
		tg.wait("ele_digitalWebTextBoxEnterAdd", ComparisonType.IS_CLICKABLE, 20);
		tg.click("ele_digitalWebTextBoxEnterAdd", 1);
		tg.type("ele_digitalWebTextBoxEnterAdd", var_address);
		tg.click("ele_digitalWebDropDownSelectAddress");
		// [DISABLED] tg.wait(20);
		// [DISABLED] tg.pressKey(ENTER, 1);
		tg.wait("ele_digitalWebTextBoxUnitNo", ComparisonType.IS_CLICKABLE, 10);
		tg.click("ele_digitalWebTextBoxUnitNo");
		tg.wait("ele_digitalWebDropDownListUnitNo", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebDropDownListUnitNo");
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] WebElement unitDropDown = driver.findElement(By.xpath("//div[@id='fca-unit' and @role='combobox']"));
		// [DISABLED] unitDropDown.click();
		// [DISABLED] WebElement firstUnitOption = driver.findElement(
		// [DISABLED] By.xpath("//div[@id='fca-unit-list-box' and @role='listbox']//*[@role='option'][1]")
		// [DISABLED] );
		// [DISABLED] firstUnitOption.click();
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] tg.click("ele_digitalWebTextBoxUnitNo", 1);
		// [DISABLED] tg.pressKey(ARROW_DOWN, 6);
		// [DISABLED] tg.pressKey(ENTER, 2);
		// [DISABLED] tg.click("ele_digitalWebDropDownUnitNo", 1);
		tg.wait("ele_digitalWebBtnNext", ComparisonType.IS_CLICKABLE);
		tg.click("ele_digitalWebBtnNext", 1);
	}
}