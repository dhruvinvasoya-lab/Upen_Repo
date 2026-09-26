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

@Listeners(TestListener.class);
public class digital_fiber_myaccount_cancelorder {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_fiber_myaccount_cancelorder() {
		tg.openBrowser();
		if(tg.performAssert(var_env, ComparisonType.EQUAL_TO, "Qlab03")){
		tg.navigateToUrl("https://digital-qlab03.t-mobile.com/home-internet/fiber");
		var_password = tg.saveToVariable("pass@123", var_password);
		var_username = tg.saveToVariable("redferrari@gmail.com", var_username);
		var_emailId = tg.saveToVariable("redferrari@gmail.com", var_emailId);
		} else {
		tg.navigateToUrl("https://digital-qlab02.t-mobile.com/home-internet/fiber");
		var_username = tg.saveToVariable("zxbnxb.bnb@gmail.com", var_username);
		var_password = tg.saveToVariable("pass@123", var_password);
		var_emailId = tg.saveToVariable("zxbnxb.bnb@gmail.com", var_emailId);
		}
		tg.wait("ele_digitalWebBtnCheckAvailability", ComparisonType.IS_VISIBLE, 50);
		tg.click("ele_digitalWebLinkMyAccount");
		tg.wait("ele_digitalWebLinkSignIn", ComparisonType.IS_CLICKABLE);
		tg.click("ele_digitalWebLinkSignIn");
		if(tg.performAssert("ele_digitalWebBtnAcceptTmoNotice", ComparisonType.IS_VISIBLE)){
		tg.click("ele_digitalWebBtnAcceptTmoNotice");
		}
		tg.testFunction("fnDigitalWebMyTMOLogin");
		tg.testFunction("fnDigitalWebGenerateIAM2FAPinUsingEmail");
		// [DISABLED] if(tg.performAssert(var_env, ComparisonType.EQUAL_TO, "Qlab03")){
		// [DISABLED] tg.testFunction("fnDigitalWebMiltonApiAuthTokenGenQlab03");
		// [DISABLED] tg.testFunction("fnDigitalWebFiberMiltonGenerate2FAPinQlab03");
		// [DISABLED] } else {
		// [DISABLED] tg.testFunction("fnDigitalWebMiltonApiAuthTokenGenerationQlab02");
		// [DISABLED] tg.testFunction("fnDigitalWebFiberMiltonGenerate2FAPinQlab02");
		// [DISABLED] }
		tg.wait("ele_digitalMyTMOLoginVerificationCode", ComparisonType.IS_VISIBLE, 50);
		tg.click("ele_digitalMyTMOLoginVerificationCode", 1);
		// [DISABLED] tg.type("ele_digitalMyTMOLoginVerificationCode", "111111");
		tg.type("ele_digitalMyTMOLoginVerificationCode", var_mpin);
		tg.wait("ele_digitalMyTMOBtnLoginPostVerificationCodeContinue", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalMyTMOBtnLoginPostVerificationCodeContinue", 1);
		tg.wait(15);
		if(tg.performAssert("ele_digitalWebBtnAcceptTmoNotice", ComparisonType.IS_VISIBLE)){
		tg.click("ele_digitalWebBtnAcceptTmoNotice");
		}
		tg.wait("ele_digitalWebLinkCancelOrder", ComparisonType.IS_CLICKABLE, 50);
		tg.click("ele_digitalWebLinkCancelOrder");
		tg.wait(5);
		tg.check.isVisible("ele_DigitalWebMessageNeedHelp");
		tg.check.isVisible("ele_DigitalWebBtnCallus");
		tg.close();
	}
}