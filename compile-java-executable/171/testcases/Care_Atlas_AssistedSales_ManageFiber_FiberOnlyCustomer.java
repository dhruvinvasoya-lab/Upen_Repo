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
public class care_atlas_assistedsales_managefiber_fiberonlycustomer {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void care_atlas_assistedsales_managefiber_fiberonlycustomer() {
		tg.openBrowser();
		if(tg.performAssert(var_env, ComparisonType.EQUAL_TO, "Qlab03")){
		tg.navigateToUrl("https://qlab03staging.globalnav.t-mobile.com/care");
		var_ban = tg.saveToVariable("974919756", var_ban);
		var_accPin = tg.saveToVariable("121613", var_accPin);
		var_mobileNumber = tg.saveToVariable("5774071196", var_mobileNumber);
		} else {
		tg.navigateToUrl("https://qlab02staging.globalnav.t-mobile.com/care");
		var_ban = tg.saveToVariable("985827181", var_ban);
		var_accPin = tg.saveToVariable("757575", var_accPin);
		var_mobileNumber = tg.saveToVariable("5215400345", var_mobileNumber);
		}
		var_repUsername = tg.saveToVariable("Test.konikineni@tmobilenet.com", var_repUsername);
		tg.wait(2);
		if(tg.performAssert("ele_digitalWebBtnAcceptTmoNotice", ComparisonType.IS_VISIBLE)){
		tg.click("ele_digitalWebBtnAcceptTmoNotice", 1);
		}
		tg.wait("ele_d2cLoginPageTextBoxUsername", ComparisonType.IS_CLICKABLE, 40);
		tg.click("ele_d2cLoginPageTextBoxUsername", 1);
		tg.type("ele_d2cLoginPageTextBoxUsername", var_repUsername);
		tg.wait("ele_d2cLoginPageLinkNext", ComparisonType.IS_CLICKABLE);
		tg.click("ele_d2cLoginPageLinkNext", 1);
		tg.wait("ele_d2cLoginPageTextBoxPassword", ComparisonType.IS_CLICKABLE);
		tg.click("ele_d2cLoginPageTextBoxPassword", 1);
		tg.typeEncrypted("ele_d2cLoginPageTextBoxPassword", var_repPassword);
		tg.wait("ele_d2cLoginPageLinkSignIn", ComparisonType.IS_CLICKABLE);
		tg.click("ele_d2cLoginPageLinkSignIn", 1);
		tg.wait("ele_digitalWebAtlasDropDownSelectRole", ComparisonType.IS_CLICKABLE, 50);
		tg.click("ele_digitalWebAtlasDropDownSelectRole", 1);
		tg.wait("ele_digitalWebAtlasDropDownEleLegacyManagerCare", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebAtlasDropDownEleLegacyManagerCare", 1);
		tg.wait("ele_digitalWebAtlasBtnContinueSelectUserProfile", ComparisonType.IS_CLICKABLE);
		tg.click("ele_digitalWebAtlasBtnContinueSelectUserProfile", 1);
		tg.wait("ele_digitalWebAtlasTextBoxBanLookUp", ComparisonType.IS_CLICKABLE, 40);
		tg.click("ele_digitalWebAtlasTextBoxBanLookUp", 1);
		tg.type("ele_digitalWebAtlasTextBoxBanLookUp", var_ban);
		tg.pressKey(TAB, 1);
		tg.wait("ele_digitalWebAtlasBtnSearch", ComparisonType.IS_CLICKABLE);
		tg.click("ele_digitalWebAtlasBtnSearch", 1);
		tg.wait("ele_digitalWebAtlasLinkSelectCustomerProfile", ComparisonType.IS_VISIBLE);
		tg.performDoubleClick("ele_digitalWebAtlasLinkSelectCustomerProfile");
		tg.wait("ele_digitalWebAtlasRadioBtnSelectCustomer", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebAtlasRadioBtnSelectCustomer", 1);
		tg.wait("ele_digitalWebAtlasTextBoxAccPin", ComparisonType.IS_CLICKABLE);
		tg.click("ele_digitalWebAtlasTextBoxAccPin", 1);
		tg.type("ele_digitalWebAtlasTextBoxAccPin", var_accPin);
		tg.wait("ele_digitalWebAtlasBtnVerifyPin", ComparisonType.IS_CLICKABLE);
		tg.click("ele_digitalWebAtlasBtnVerifyPin", 1);
		if(tg.performAssert("ele_digitalWebAtlasBtnByPassOTP", ComparisonType.IS_VISIBLE)){
		// [DISABLED] tg.wait("ele_digitalWebAtlasBtnByPassOTP", ComparisonType.IS_CLICKABLE, 30);
		tg.click("ele_digitalWebAtlasBtnByPassOTP", 1);
		tg.wait("ele_digitalWebAtlasDropDownByPassOtpReason", ComparisonType.IS_CLICKABLE, 30);
		tg.click("ele_digitalWebAtlasDropDownByPassOtpReason", 1);
		tg.wait("ele_digitalWebAtlasDropDownValueReasonByPassOtp", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebAtlasDropDownValueReasonByPassOtp", 1);
		tg.wait("ele_digitalWebAtlasBtnContinueByPassOtpReason", ComparisonType.IS_CLICKABLE);
		tg.click("ele_digitalWebAtlasBtnContinueByPassOtpReason", 1);
		}
		tg.wait(20);
		tg.wait("ele_digitalWebAtlasIconToolBox", ComparisonType.IS_VISIBLE, 50);
		tg.click("ele_digitalWebAtlasIconToolBox", 1);
		tg.wait(10);
		START_CUSTOM_SCRIPT;
		                                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		                                JavascriptExecutor js = (JavascriptExecutor) driver;
		END_CUSTOM_SCRIPT;
		// ✅ Step 1: Light DOM → find tmo-atlas-toolbox (REAL shadow host)
		START_CUSTOM_SCRIPT;
		                                WebElement atlasToolbox = wait.until(
		                                    ExpectedConditions.presenceOfElementLocated(
		                                        By.tagName("tmo-atlas-toolbox")
		                                    )
		                                );
		END_CUSTOM_SCRIPT;
		// ✅ Step 2: Pierce FIRST shadow root
		START_CUSTOM_SCRIPT;
		                                SearchContext sr1 = atlasToolbox.getShadowRoot();
		END_CUSTOM_SCRIPT;
		// ✅ Step 3: Find tools-launchpad inside atlas shadow
		START_CUSTOM_SCRIPT;
		                                WebElement toolsLaunchpad = sr1.findElement(By.id("tools-launchpad"));
		END_CUSTOM_SCRIPT;
		// ✅ Step 4: Find app-tools (SECOND shadow host)
		START_CUSTOM_SCRIPT;
		                                WebElement appTools = toolsLaunchpad.findElement(By.tagName("app-tools"));
		END_CUSTOM_SCRIPT;
		// ✅ Step 5: Pierce SECOND shadow root
		START_CUSTOM_SCRIPT;
		                                SearchContext sr2 = appTools.getShadowRoot();
		END_CUSTOM_SCRIPT;
		// ✅ Step 6: Find Fiber tile
		START_CUSTOM_SCRIPT;
		                                WebElement fiberSubTool = sr2.findElement(
		                                    By.cssSelector("app-sub-tool[title='Fiber']")
		                                );
		END_CUSTOM_SCRIPT;
		// ✅ Step 7: Scroll Fiber into view
		START_CUSTOM_SCRIPT;
		                                js.executeScript("arguments[0].scrollIntoView(true);", fiberSubTool);
		END_CUSTOM_SCRIPT;
		// ✅ Step 8: Find Add Fiber link (NO shadow here)
		START_CUSTOM_SCRIPT;
		SearchContext fiberShadow = fiberSubTool.getShadowRoot();
		WebElement manageFiberLink = fiberShadow.findElement(
		        By.cssSelector("a#manage-fiber-account")
		    );
		END_CUSTOM_SCRIPT;
		// ✅ Step 9: Click (JS click = stable)
		START_CUSTOM_SCRIPT;
		                       js.executeScript("arguments[0].scrollIntoView(true);", manageFiberLink);
		                                js.executeScript("arguments[0].click();", manageFiberLink);
		                                System.out.println("Manage Fiber Account");
		END_CUSTOM_SCRIPT;
		tg.wait(1);
		// Capture current window
		if(tg.performAssert("ele_atlasAlternateverificationTextBoxOneTimePIN", ComparisonType.IS_VISIBLE)){
		tg.click("ele_atlasAlternateverificationTextBoxOneTimePIN");
		tg.testFunction("fnDigitalWebGenerateIAM2FAPinUsingMSISDN");
		// [DISABLED] tg.testFunction("fnDigitalWebMiltonApiAuthTokenGenerationQlab02");
		// [DISABLED] tg.testFunction("fnDigitalWebFiberMiltonGenerate2FAPinUsingMSISDNQlab02");
		// [DISABLED] tg.testFunction("fnDigitalWebMiltonApiAuthTokenGenQlab03");
		// [DISABLED] tg.testFunction("fnDigitalWebFiberMiltonGenerate2FAPinUsingMSISDNQlab03");
		tg.type("ele_atlasAlternateverificationTextBoxOneTimePIN", var_mpin);
		tg.wait("ele_atlasAlternateverificationBtnVerify", ComparisonType.IS_CLICKABLE);
		tg.click("ele_atlasAlternateverificationBtnVerify");
		}
		START_CUSTOM_SCRIPT;
		    String parentWindow = driver.getWindowHandle();
		END_CUSTOM_SCRIPT;
		// Wait for new window to open
		START_CUSTOM_SCRIPT;
		    WebDriverWait windowWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    windowWait.until(driver -> driver.getWindowHandles().size() > 1);
		END_CUSTOM_SCRIPT;
		// Switch to the new window
		START_CUSTOM_SCRIPT;
		    for (String windowHandle : driver.getWindowHandles()) {
		        if (!windowHandle.equals(parentWindow)) {
		            driver.switchTo().window(windowHandle);
		            break;
		        }
		    }
		    System.out.println("✅ Switched to Manage Fiber Account window");
		System.out.println("Current URL: " + driver.getCurrentUrl());
		END_CUSTOM_SCRIPT;
		// [DISABLED] tg.wait(5);
		// [DISABLED] if(tg.performAssert("ele_atlasAlternateverificationTextBoxOneTimePIN", ComparisonType.IS_VISIBLE)){
		// [DISABLED] tg.click("ele_atlasAlternateverificationTextBoxOneTimePIN");
		// [DISABLED] tg.testFunction("fnDigitalWebMiltonApiAuthTokenGenQlab03");
		// [DISABLED] tg.testFunction("fnDigitalWebFiberMiltonGenerate2FAPinQlab03");
		// [DISABLED] tg.type("ele_atlasAlternateverificationTextBoxOneTimePIN", var_mpin);
		// [DISABLED] tg.wait("ele_atlasAlternateverificationBtnVerify", ComparisonType.IS_CLICKABLE);
		// [DISABLED] tg.click("ele_atlasAlternateverificationBtnVerify");
		// [DISABLED] }
		tg.wait(40);
		tg.wait("ele_digitalWebLotusFlareLinkSubscriberID", ComparisonType.IS_CLICKABLE, 30);
		tg.click("ele_digitalWebLotusFlareLinkSubscriberID");
		tg.wait("ele_digitalWebLotusFlareLabelSamsonMSISDN", ComparisonType.IS_VISIBLE, 20);
		tg_String var_samsonmsisdn = "";
		var_samsonmsisdn = tg.saveToVariable("ele_digitalWebLotusFlareLabelSamsonMSISDN", var_samsonmsisdn);
		tg.check.isEqualTo(var_samsonmsisdn,var_mobileNumber);
		tg.close();
	}
}