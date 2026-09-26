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
public class Care_Atlas_AssistedSales_AALExistingGSM_WithAutoPay_WithoutDeposit_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void Care_Atlas_AssistedSales_AALExistingGSM_WithAutoPay_WithoutDeposit_copy() {
		tg.openBrowser();
		if(tg.performAssert(var_env, ComparisonType.EQUAL_TO, "Qlab03")){
		tg.navigateToUrl("https://qlab03staging.globalnav.t-mobile.com/care");
		} else {
		tg.navigateToUrl("https://qlab02staging.globalnav.t-mobile.com/care");
		}
		tg.testFunction("fnDigitalWebFiberTdmGsmApiRequest_copy");
		var_repUsername = tg.saveToVariable("Test.konikineni@tmobilenet.com", var_repUsername);
		// [DISABLED] var_accPin = tg.saveToVariable("12161345", var_accPin);
		// [DISABLED] var_ban = tg.saveToVariable("974837555", var_ban);
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
		tg.wait("ele_digitalWebAtlasBtnByPassOTP", ComparisonType.IS_CLICKABLE, 30);
		tg.click("ele_digitalWebAtlasBtnByPassOTP", 1);
		tg.wait("ele_digitalWebAtlasDropDownByPassOtpReason", ComparisonType.IS_CLICKABLE, 30);
		tg.click("ele_digitalWebAtlasDropDownByPassOtpReason", 1);
		tg.wait("ele_digitalWebAtlasDropDownValueReasonByPassOtp", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebAtlasDropDownValueReasonByPassOtp", 1);
		tg.wait("ele_digitalWebAtlasBtnContinueByPassOtpReason", ComparisonType.IS_CLICKABLE);
		tg.click("ele_digitalWebAtlasBtnContinueByPassOtpReason", 1);
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
		WebElement addFiberLink = fiberShadow.findElement(
		        By.cssSelector("a#add-fiber-line")
		    );
		END_CUSTOM_SCRIPT;
		// ✅ Step 9: Click (JS click = stable)
		START_CUSTOM_SCRIPT;
		                       js.executeScript("arguments[0].scrollIntoView(true);", addFiberLink);
		                                js.executeScript("arguments[0].click();", addFiberLink);
		                                System.out.println("✅ Clicked Add Fiber line");
		END_CUSTOM_SCRIPT;
		tg.wait(1);
		// Capture current window
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
		    System.out.println("✅ Switched to Add Fiber Line window");
		System.out.println("Current URL: " + driver.getCurrentUrl());
		END_CUSTOM_SCRIPT;
		tg.wait("ele_d2cTextBoxDealerCode", ComparisonType.IS_VISIBLE, 100);
		tg.testFunction("fnD2CEnterDelaerCodeAndContinue_copy");
		var_address = tg.saveToVariable("55 DELANCEY ST", var_address);
		tg.testFunction("fnDigitalWebFiberEnterAddress_copy");
		tg.testFunction("fnDigitalWebFiberSelectPlan300_copy");
		tg.testFunction("fnDigitalWebFiberScheduleInstall_copy");
		tg.wait("ele_digitalWebBtnSubmitOrder", ComparisonType.IS_VISIBLE, 100);
		tg.click("ele_digitalWebBtnSubmitOrder");
		tg.wait("ele_digitWebTextThanksForYourOrder", ComparisonType.IS_VISIBLE, 50);
		tg_String var_eleOrderNumber = "";
		tg.wait("ele_digitalWebD2CLabelOrderNo", ComparisonType.IS_VISIBLE, 50);
		var_eleOrderNumber = tg.saveToVariable("ele_digitalWebD2CLabelOrderNo", var_eleOrderNumber);
		tg.printLogs(var_eleOrderNumber);
		tg.close();
	}
}