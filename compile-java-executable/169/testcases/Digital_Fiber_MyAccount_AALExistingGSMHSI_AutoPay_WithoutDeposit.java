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
public class digital_fiber_myaccount_aalexistinggsmhsi_autopay_withoutdeposit {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_fiber_myaccount_aalexistinggsmhsi_autopay_withoutdeposit() {
		tg.openBrowser();
		// [DISABLED] tg.testFunction("fnDigitalWebFiberTdmGSMHSIApiRequestQlab03");
		if(tg.performAssert(var_env, ComparisonType.EQUAL_TO, "Qlab03")){
		tg.navigateToUrl("https://digital-qlab03.t-mobile.com/home-internet/fiber");
		var_username = tg.saveToVariable("5218020206", var_username);
		var_password = tg.saveToVariable("pass@123", var_password);
		var_emailId = tg.saveToVariable("5218020206", var_emailId);
		var_firstName = tg.saveToVariable("Lowell", var_firstName);
		var_lastName = tg.saveToVariable("Runolfsson", var_lastName);
		var_ban = tg.saveToVariable("985964057", var_ban);
		var_mobileNumber = tg.saveToVariable("5218020206", var_mobileNumber);
		} else {
		tg.navigateToUrl("https://digital-qlab02.t-mobile.com/home-internet/fiber");
		var_firstName = tg.saveToVariable("Lowell", var_firstName);
		var_lastName = tg.saveToVariable("Runolfsson", var_lastName);
		var_emailId = tg.saveToVariable("7183141795@testtdm.com", var_emailId);
		var_mobileNumber = tg.saveToVariable("5218020206", var_mobileNumber);
		var_username = tg.saveToVariable("7183141795@testtdm.com", var_username);
		var_password = tg.saveToVariable("pass@123", var_password);
		}
		tg.wait("ele_digitalWebBtnCheckAvailability", ComparisonType.IS_CLICKABLE, 50);
		tg.click("ele_digitalWebLinkMyAccount", 1);
		tg.wait("ele_digitalWebLinkSignIn", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebLinkSignIn", 1);
		var_username = tg.saveToVariable(var_emailId, var_username);
		tg.printLogs(var_username);
		var_address = tg.saveToVariable("55 DELANCEY ST", var_address);
		if(tg.performAssert("ele_digitalWebBtnAcceptTmoNotice", ComparisonType.IS_VISIBLE)){
		tg.click("ele_digitalWebBtnAcceptTmoNotice");
		}
		tg.testFunction("fnDigitalWebMyTMOLogin");
		tg.wait("ele_digitalWebBtnCheckAvailability", ComparisonType.IS_VISIBLE, 50);
		if(tg.performAssert("ele_digitalMyTMOLoginVerificationCode", ComparisonType.IS_VISIBLE)){
		tg.click("ele_digitalMyTMOLoginVerificationCode", 1);
		tg.testFunction("fnDigitalWebGenerateIAM2FAPinUsingEmail");
		// [DISABLED] if(tg.performAssert(var_env, ComparisonType.EQUAL_TO, "Qlab03")){
		// [DISABLED] tg.testFunction("fnDigitalWebMiltonApiAuthTokenGenQlab03");
		// [DISABLED] tg.testFunction("fnDigitalWebFiberMiltonGenerate2FAPinQlab03");
		// [DISABLED] } else {
		// [DISABLED] tg.testFunction("fnDigitalWebFiberMiltonGenerate2FAPinQlab02");
		// [DISABLED] tg.testFunction("fnDigitalWebFiberMiltonGenerate2FAPinQlab02");
		// [DISABLED] }
		tg.type("ele_digitalMyTMOLoginVerificationCode", var_mpin);
		tg.wait("ele_digitalMyTMOBtnLoginPostVerificationCodeContinue", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalMyTMOBtnLoginPostVerificationCodeContinue", 1);
		}
		tg.wait("ele_mytmoHomepageLinkAccount", ComparisonType.IS_CLICKABLE, 40);
		tg.click("ele_mytmoHomepageLinkAccount");
		tg.swipe(Direction.UP);
		if(tg.performAssert("ele_mytmoAccountpageLinkSeedevicedetails", ComparisonType.IS_VISIBLE)){
		tg.click("ele_mytmoAccountpageLinkSeedevicedetails");
		} else {
		tg.wait("ele_mytmoaccountpageBtnFiberGateway", ComparisonType.IS_CLICKABLE);
		tg.click("ele_mytmoaccountpageBtnFiberGateway");
		tg.wait("ele_mytmoAccountpagebtnViewplandetails", ComparisonType.IS_CLICKABLE, 30);
		tg.click("ele_mytmoAccountpagebtnViewplandetails");
		}
		tg.wait(50);
		tg.wait("ele_digitalWebLinkAddALine", ComparisonType.IS_CLICKABLE, 50);
		tg.click("ele_digitalWebLinkAddALine");
		tg.testFunction("fnDigitalWebFiberEnterAddress");
		// [DISABLED] tg.testFunction("fnDigitalWebFiberCheckAvailability");
		tg.wait("ele_digitalWebBtnSelectPlanFiber300", ComparisonType.IS_CLICKABLE, 20);
		tg.click("ele_digitalWebBtnSelectPlanFiber300");
		tg.testFunction("fnDigitalWebFiberScheduleInstall");
		tg.testFunction("fnDigitalWebFiberReviewOrderAAL");
		tg.testFunction("fnDigitalWebFiberOrderConfirmation");
		tg.close();
	}
}