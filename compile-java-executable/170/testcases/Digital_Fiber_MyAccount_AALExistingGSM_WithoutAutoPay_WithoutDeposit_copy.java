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
public class Digital_Fiber_MyAccount_AALExistingGSM_WithoutAutoPay_WithoutDeposit_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void Digital_Fiber_MyAccount_AALExistingGSM_WithoutAutoPay_WithoutDeposit_copy() {
		tg.openBrowser();
		// [DISABLED] tg.testFunction("fnDigitalWebFiberTdmGsmApiRequestQlab03_copy");
		if(tg.performAssert(var_env, ComparisonType.EQUAL_TO, "Qlab03")){
		tg.navigateToUrl("https://digital-qlab03.t-mobile.com/home-internet/fiber");
		} else {
		tg.navigateToUrl("https://digital-qlab02.t-mobile.com/home-internet/fiber");
		// [DISABLED] var_var_emailId = tg.getJsonData(, "");
		}
		// [DISABLED] tg.testFunction("fnDigitalWebFiberTdmGsmApiRequest_copy");
		tg.wait("ele_digitalWebBtnCheckAvailability", ComparisonType.IS_CLICKABLE, 50);
		tg.click("ele_digitalWebLinkMyAccount", 1);
		tg.wait("ele_digitalWebLinkSignIn", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebLinkSignIn", 1);
		var_username = tg.saveToVariable(var_emailId, var_username);
		tg.printLogs(var_username);
		var_address = tg.saveToVariable("55 Delancey St", var_address);
		if(tg.performAssert("ele_digitalWebBtnAcceptTmoNotice", ComparisonType.IS_VISIBLE)){
		tg.click("ele_digitalWebBtnAcceptTmoNotice");
		}
		tg.testFunction("fnDigitalWebMyTMOLogin_copy");
		tg.wait("ele_digitalWebBtnCheckAvailability", ComparisonType.IS_VISIBLE, 50);
		if(tg.performAssert("ele_digitalMyTMOLoginVerificationCode", ComparisonType.IS_VISIBLE)){
		tg.click("ele_digitalMyTMOLoginVerificationCode", 1);
		tg.testFunction("fnDigitalWebGenerateIAM2FAPinUsingEmail_copy");
		// [DISABLED] tg.testFunction("fnDigitalWebMiltonApiAuthTokenGenQlab03_copy");
		// [DISABLED] tg.testFunction("fnDigitalWebFiberMiltonGenerate2FAPinQlab03_copy");
		tg.type("ele_digitalMyTMOLoginVerificationCode", var_mpin);
		tg.wait("ele_digitalMyTMOBtnLoginPostVerificationCodeContinue", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalMyTMOBtnLoginPostVerificationCodeContinue", 1);
		}
		tg.wait("ele_mytmoHomepageLinkAccount", ComparisonType.IS_CLICKABLE, 40);
		tg.click("ele_mytmoHomepageLinkAccount");
		if(tg.performAssert("ele_mytmoAccountpageLinkSeedevicedetails", ComparisonType.IS_VISIBLE)){
		tg.click("ele_mytmoAccountpageLinkSeedevicedetails");
		} else {
		tg.wait("ele_mytmoaccountpageBtnFiberGateway", ComparisonType.IS_CLICKABLE, 30);
		tg.click("ele_mytmoaccountpageBtnFiberGateway");
		tg.wait("ele_mytmoAccountpagebtnViewplandetails", ComparisonType.IS_CLICKABLE, 30);
		tg.click("ele_mytmoAccountpagebtnViewplandetails");
		}
		tg.wait("ele_digitalWebLinkAddALine", ComparisonType.IS_CLICKABLE, 50);
		tg.click("ele_digitalWebLinkAddALine");
		tg.testFunction("fnDigitalWebFiberEnterAddress_copy");
		// [DISABLED] tg.testFunction("fnDigitalWebFiberCheckAvailability_copy");
		tg.wait("ele_digitalWebBtnSelectPlanFiber300", ComparisonType.IS_CLICKABLE, 20);
		tg.click("ele_digitalWebBtnSelectPlanFiber300");
		tg.testFunction("fnDigitalWebFiberScheduleInstall_copy");
		tg.testFunction("fnDigitalWebFiberReviewOrderAAL_copy");
		tg.testFunction("fnDigitalWebFiberOrderConfirmation_copy");
		tg.close();
	}
}