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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
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

class fndigitalwebfiberverifyemail {

	public static void fndigitalwebfiberverifyemail() {
		tg.wait("ele_digitalWebTextBoxEmailCodeInput", ComparisonType.IS_CLICKABLE, 20);
		tg.testFunction("fnDigitalWebGenerateIAMCVSPinUsingEmail");
		tg_String var_emailCode = "";
		var_emailCode = tg.saveToVariable(var_cvsPin, var_emailCode);
		tg.printLogs(var_emailCode);
		tg.click("ele_digitalWebTextBoxEmailCodeInput", 1);
		START_CUSTOM_SCRIPT;
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement emailCodeField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='fvs-email-code-input']") ));
		 emailCodeField.click();
		END_CUSTOM_SCRIPT;
		// Clear robustly (do twice to beat autocomplete races)
		START_CUSTOM_SCRIPT;
		  emailCodeField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  emailCodeField.sendKeys(Keys.DELETE);
		  emailCodeField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		  emailCodeField.sendKeys(Keys.DELETE);
		  for (char c : var_emailCode.toCharArray()) {
		      emailCodeField.sendKeys(String.valueOf(c));
		      System.out.println(c);
		  }
		  emailCodeField.sendKeys(Keys.TAB);
		END_CUSTOM_SCRIPT;
		tg.wait("ele_digitalWebBtnSubmitCode", ComparisonType.IS_CLICKABLE, 40);
		tg.click("ele_digitalWebBtnSubmitCode", 1);
	}
}