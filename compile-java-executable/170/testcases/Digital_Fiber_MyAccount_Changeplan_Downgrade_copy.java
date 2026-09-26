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
public class Digital_Fiber_MyAccount_Changeplan_Downgrade_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void Digital_Fiber_MyAccount_Changeplan_Downgrade_copy() {
		tg.openBrowser();
		if(tg.performAssert(var_env, ComparisonType.EQUAL_TO, "Qlab03")){
		tg.navigateToUrl("https://digital-qlab03.t-mobile.com/home-internet/fiber");
		var_username = tg.saveToVariable("fsbautomation20260406064223@gmail.com", var_username);
		var_password = tg.saveToVariable("pass@123", var_password);
		var_emailId = tg.saveToVariable("fsbautomation20260406064223@gmail.com", var_emailId);
		} else {
		tg.navigateToUrl("https://digital-qlab02.t-mobile.com/home-internet/fiber");
		var_emailId = tg.saveToVariable("fsbautomation20260422114457@gmail.com", var_emailId);
		var_password = tg.saveToVariable("pass@123", var_password);
		var_username = tg.saveToVariable("fsbautomation20260422114457@gmail.com", var_username);
		}
		tg_String var_CurrentPlan = "Fiber 1 Gig (1000 Mbps)";
		tg.wait("ele_digitalWebBtnCheckAvailability", ComparisonType.IS_VISIBLE, 50);
		tg.click("ele_digitalWebLinkMyAccount", 1);
		tg.wait("ele_digitalWebLinkSignIn", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebLinkSignIn", 1);
		tg.testFunction("fnDigitalWebMyTMOLogin_copy");
		tg.wait("ele_digitalMyTMOLoginVerificationCode", ComparisonType.IS_VISIBLE, 50);
		tg.click("ele_digitalMyTMOLoginVerificationCode", 1);
		tg.testFunction("fnDigitalWebGenerateIAM2FAPinUsingEmail_copy");
		// [DISABLED] if(tg.performAssert(var_env, ComparisonType.EQUAL_TO, "Qlab03")){
		// [DISABLED] tg.testFunction("fnDigitalWebMiltonApiAuthTokenGenQlab03_copy");
		// [DISABLED] tg.testFunction("fnDigitalWebFiberMiltonGenerate2FAPinQlab03_copy");
		// [DISABLED] } else {
		// [DISABLED] tg.testFunction("fnDigitalWebMiltonApiAuthTokenGenerationQlab02_copy");
		// [DISABLED] tg.testFunction("fnDigitalWebFiberMiltonGenerate2FAPinQlab02_copy");
		// [DISABLED] }
		tg.type("ele_digitalMyTMOLoginVerificationCode", var_mpin);
		tg.wait("ele_digitalMyTMOBtnLoginPostVerificationCodeContinue", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalMyTMOBtnLoginPostVerificationCodeContinue", 1);
		tg.wait(10);
		if(tg.performAssert("ele_digitalWebBtnAcceptTmoNotice", ComparisonType.IS_VISIBLE)){
		tg.click("ele_digitalWebBtnAcceptTmoNotice", 1);
		}
		tg.wait("ele_digitalWebLinkEditPlanOnExistingPlan", ComparisonType.IS_VISIBLE, 50);
		tg.wait("ele_digitWebLabelExistingPlan", ComparisonType.IS_VISIBLE);
		tg_String var_existingPlan = "";
		var_existingPlan = tg.saveToVariable("ele_digitWebLabelExistingPlan", var_existingPlan);
		tg.printLogs(var_existingPlan);
		tg.check.isEqualTo(var_CurrentPlan,var_existingPlan);
		tg.click("ele_digitalWebLinkEditPlanOnExistingPlan", 1);
		if(tg.performAssert("ele_digitalWebBtnContinueOnPendingPlanChange", ComparisonType.IS_VISIBLE)){
		tg.click("ele_digitalWebBtnContinueOnPendingPlanChange", 1);
		}
		// [DISABLED] tg.wait("ele_digitalWebBtnContinueOnPendingPlanChange", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_digitalWebBtnContinueOnPendingPlanChange", 1);
		tg.wait("ele_digitalWebBtnSelectPlan300Downgrade", ComparisonType.IS_CLICKABLE, 50);
		tg.click("ele_digitalWebBtnSelectPlan300Downgrade", 1);
		tg.wait("ele_digitalWebBtnConfirmPlanChange", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebBtnConfirmPlanChange", 1);
		tg.wait("ele_digitalWebLabelPlanChangedConfirmation", ComparisonType.IS_VISIBLE, 40);
		tg_String var_confirmMsg = "";
		var_confirmMsg = tg.saveToVariable("ele_digitalWebLabelPlanChangedConfirmation", var_confirmMsg);
		tg.printLogs(var_confirmMsg);
		tg.check.isVisible("ele_digitalWebLabelPlanChangedConfirmation");
		tg.close();
	}
}