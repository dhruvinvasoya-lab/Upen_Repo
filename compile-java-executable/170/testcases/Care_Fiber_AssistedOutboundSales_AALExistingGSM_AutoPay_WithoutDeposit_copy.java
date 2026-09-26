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
public class Care_Fiber_AssistedOutboundSales_AALExistingGSM_AutoPay_WithoutDeposit_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void Care_Fiber_AssistedOutboundSales_AALExistingGSM_AutoPay_WithoutDeposit_copy() {
		tg.openBrowser();
		tg.testFunction("fnDigitalWebFiberTdmGsmApiRequest_copy");
		var_databaseName = tg.saveToVariable("samson", var_databaseName);
		var_envName = tg.saveToVariable("QLAB02", var_envName);
		tg.testFunction("fnDigitalWebFiberGetCustomerFromSamson_copy");
		tg_String var_formattedDoB = "";
		START_CUSTOM_SCRIPT;
		String cleanedDob = var_dateOfBirth.replace("\u202F", " ");
		var_formattedDoB =
		    LocalDateTime.parse(
		        cleanedDob,
		        DateTimeFormatter.ofPattern("MMM d, yyyy, hh:mm:ss a")
		    ).format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		System.out.println("Formatted DOB = " + var_formattedDoB);
		END_CUSTOM_SCRIPT;
		if(tg.performAssert(var_env, ComparisonType.EQUAL_TO, "Qlab03")){
		tg.navigateToUrl("https://qlab03.fiber.t-mobile.com/channel/assistedProspect?Source=Outbound");
		} else {
		tg.navigateToUrl("https://qlab02.fiber.t-mobile.com/channel/assistedProspect?Source=Outbound");
		}
		tg.wait("ele_d2cLoginPageTextBoxUsername", ComparisonType.IS_CLICKABLE, 40);
		var_repUsername = tg.saveToVariable("Test.konikineni@tmobilenet.com", var_repUsername);
		tg.click("ele_d2cLoginPageTextBoxUsername", 1);
		tg.type("ele_d2cLoginPageTextBoxUsername", var_repUsername);
		tg.wait("ele_d2cLoginPageLinkNext", ComparisonType.IS_CLICKABLE);
		tg.click("ele_d2cLoginPageLinkNext", 1);
		tg.wait("ele_d2cLoginPageTextBoxPassword", ComparisonType.IS_CLICKABLE);
		tg.click("ele_d2cLoginPageTextBoxPassword", 1);
		tg.typeEncrypted("ele_d2cLoginPageTextBoxPassword", var_repPassword);
		tg.wait("ele_d2cLoginPageLinkSignIn", ComparisonType.IS_CLICKABLE);
		tg.click("ele_d2cLoginPageLinkSignIn", 1);
		tg.wait("ele_d2cTextBoxDealerCode", ComparisonType.IS_CLICKABLE, 50);
		if(tg.performAssert("ele_digitalWebBtnAcceptTmoNotice", ComparisonType.IS_VISIBLE)){
		tg.click("ele_digitalWebBtnAcceptTmoNotice");
		tg.wait(2);
		}
		tg_String var_dealerCode = "0000002";
		START_CUSTOM_SCRIPT;
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement dealerCodeField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='dealerCode']") ));
		 dealerCodeField.click();
		  for (char c : var_dealerCode.toCharArray()) {
		      dealerCodeField.sendKeys(String.valueOf(c));
		      System.out.println(c);
		  }
		END_CUSTOM_SCRIPT;
		tg.pressKey(TAB, 1);
		tg.wait("ele_digitalWebBtnContinueAfterEnteringDelaerCode", ComparisonType.IS_CLICKABLE, 20);
		tg.click("ele_digitalWebBtnContinueAfterEnteringDelaerCode");
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		// [DISABLED] String timestamp = LocalDateTime.now().format(formatter);
		// [DISABLED] String email = "fsbautomation_TG_" + timestamp + "@yahoo.com";
		// [DISABLED] var_emailId = email;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		var_address = tg.saveToVariable("61 DELANCEY ST", var_address);
		// [DISABLED] var_firstName = tg.saveToVariable(var_firstName, "regex", "^[A-Z][a-z]{3,10}$");
		// [DISABLED] var_lastName = tg.saveToVariable(var_lastName, "regex", "^[A-Z][a-z]{5,15}$");
		tg_String var_name = "";
		START_CUSTOM_SCRIPT;
		var_name = var_firstName + " " + var_lastName;
		END_CUSTOM_SCRIPT;
		tg.printLogs(var_name);
		// [DISABLED] var_mobileNumber = tg.saveToVariable(var_mobileNumber, "regex", "^[2-9][0-9]{9}$");
		// [DISABLED] tg_String var_dob = "01/01/1985";
		// [DISABLED] tg_String var_emailPin = "121613";
		tg.testFunction("fnDigitalWebFiberEnterAddress_copy");
		tg.wait("ele_digitalWebDataTitleGreatNews", ComparisonType.IS_VISIBLE, 20);
		tg.check.isVisible("ele_digitalWebDataTitleGreatNews");
		tg.wait("ele_digitalWebBtnSelectPlanFiber300", ComparisonType.IS_VISIBLE, 50);
		tg_String var_elePlanSelected = "";
		var_elePlanSelected = tg.getElementAttribute("ele_digitalWebBtnSelectPlanFiber300", "value", var_elePlanSelected);
		tg.click("ele_digitalWebBtnSelectPlanFiber300", 1);
		tg.wait("ele_digitalWebTextBoxFirstName", ComparisonType.IS_VISIBLE);
		tg.printLogs(var_elePlanSelected);
		// [DISABLED] tg.click("ele_digitalWebTextBoxFirstName", 1);
		// [DISABLED] tg.type("ele_digitalWebTextBoxFirstName", var_firstName);
		START_CUSTOM_SCRIPT;
		                WebElement firstNameField = driver.findElement(By.xpath("//input[@id='first-name']"));
		                 for (char ch: var_firstName.toCharArray()) {
		                     firstNameField.sendKeys(String.valueOf(ch));
		                 }
		                WebElement lastNameField = driver.findElement(By.xpath("//input[@id='last-name']"));
		                 for (char ch: var_lastName.toCharArray()) {
		                     lastNameField.sendKeys(String.valueOf(ch));
		                 }
		END_CUSTOM_SCRIPT;
		// [DISABLED] tg.wait("ele_digitalWebTextBoxLastName", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_digitalWebTextBoxLastName", 1);
		// [DISABLED] tg.type("ele_digitalWebTextBoxLastName", var_lastName);
		START_CUSTOM_SCRIPT;
		          System.out.println(var_mobileNumber);
		                 WebElement phoneField = driver.findElement(By.xpath("//input[@id='phone']"));
		                 for (char digit : var_mobileNumber.toCharArray()) {
		                     phoneField.sendKeys(String.valueOf(digit));
		                 }
		END_CUSTOM_SCRIPT;
		tg.wait(2);
		START_CUSTOM_SCRIPT;
		                WebElement emailIdField = driver.findElement(By.xpath("//input[@id='email']"));
		                 for (char ch: var_emailId.toCharArray()) {
		                     emailIdField.sendKeys(String.valueOf(ch));
		                 }
		END_CUSTOM_SCRIPT;
		// [DISABLED] tg.click("ele_digitalWebTextBoxEmail", 1);
		// [DISABLED] tg.type("ele_digitalWebTextBoxEmail", var_emailId);
		// tg.click("ele_digitalWebTextBoxDOB");
		// tg.type("ele_digitalWebTextBoxDOB", "01/01/1994");
		START_CUSTOM_SCRIPT;
		                 WebElement dobField = driver.findElement(By.xpath("//input[@id='date-of-birth']"));
		                 for (char ch : var_formattedDoB.toCharArray()) {
		                     dobField.sendKeys(String.valueOf(ch));
		                 }
		                 WebElement emailPinField = driver.findElement(By.xpath("//input[@id='pin']"));
		                 for (char ch : var_accPin.toCharArray()) {
		                     emailPinField.sendKeys(String.valueOf(ch));
		                 }
		END_CUSTOM_SCRIPT;
		// tg.click("ele_DigitalWebTextBoxPin", 1);
		// tg.type("ele_DigitalWebTextBoxPin", "121613");
		tg.click("ele_digitalWebBtnNextOnGetStartedPage", 1);
		tg.testFunction("fnDigitalWebFiberVerifyEmail_copy");
		tg.wait(10);
		if(tg.performAssert("ele_digitalWebBtnContinueOnExistingCustomer", ComparisonType.IS_VISIBLE)){
		tg.click("ele_digitalWebBtnContinueOnExistingCustomer");
		}
		tg.wait("ele_digitalWebLinkSelectDate", ComparisonType.IS_CLICKABLE, 40);
		tg.wait("ele_digitalWebBtnSelectTime1", ComparisonType.IS_CLICKABLE, 20);
		tg.click("ele_digitalWebBtnSelectTime1", 1);
		tg_String var_eleAppointmentDate = "";
		tg_String var_eleAppointmentTime = "";
		var_eleAppointmentDate = tg.getElementAttribute("ele_digitalWebLinkSelectDate", "value", var_eleAppointmentDate);
		var_eleAppointmentTime = tg.saveToVariable("ele_digitalWebBtnSelectTime1", var_eleAppointmentTime);
		tg.printLogs(var_eleAppointmentDate);
		tg.printLogs(var_eleAppointmentTime);
		tg.wait("ele_digitalWebBtnScheduleYourInstall1", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_digitalWebBtnScheduleYourInstall1", 1);
		tg.wait(20);
		// ReviewOrderPageAssertions
		tg.wait("ele_digitalWebLabelValueName", ComparisonType.IS_VISIBLE, 10);
		tg.wait("ele_digitalWebLabelValueAddress", ComparisonType.IS_VISIBLE, 30);
		// [DISABLED] tg.wait("ele_digitalWebLabelValuePhone", ComparisonType.IS_VISIBLE, 60);
		// [DISABLED] tg.wait("ele_digitalWebLabelValueEmail", ComparisonType.IS_VISIBLE, 20);
		tg.wait(5);
		tg_String var_eleValueName = "";
		// [DISABLED] tg_String var_eleValueEmail = "";
		// [DISABLED] tg_String var_eleValuePhone = "";
		tg_String var_eleValueAdd = "";
		var_eleValueName = tg.saveToVariable("ele_digitalWebLabelValueName", var_eleValueName);
		// [DISABLED] var_eleValueEmail = tg.saveToVariable("ele_digitalWebLabelValueEmail", var_eleValueEmail);
		var_eleValueAdd = tg.saveToVariable("ele_digitalWebLabelValueAddress", var_eleValueAdd);
		// [DISABLED] var_eleValuePhone = tg.saveToVariable("ele_digitalWebLabelValuePhone", var_eleValuePhone);
		tg.printLogs("ele_digitalWebLabelValuePlanSelected");
		tg.printLogs(var_eleValueName);
		// [DISABLED] tg.printLogs(var_eleValueEmail);
		// [DISABLED] tg.printLogs(var_eleValuePhone);
		tg.printLogs(var_eleValueAdd);
		tg.check.isEqualTo(var_address,var_eleValueAdd);
		tg.check.isEqualTo(var_name,var_eleValueName);
		// [DISABLED] tg_String var_formattedMobileNo = "";
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] var_formattedMobileNo = var_eleValuePhone.replaceAll("\\D","");
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] tg.printLogs(var_formattedMobileNo);
		// [DISABLED] tg.check.isEqualTo(var_formattedMobileNo,var_mobileNumber);
		// [DISABLED] tg.check.isEqualTo(var_emailId,var_eleValueEmail);
		// [DISABLED] tg.check.isEqualTo(var_mobileNumber,var_eleValuePhone);
		// [DISABLED] tg.check.isEqualTo("name",var_eleValueName);
		tg.check.isEqualTo("ele_digitalWebLabelValueInstallationDate",var_eleAppointmentDate);
		tg.check.isEqualTo("ele_digitalWebLabelValueInstallationTime",var_eleAppointmentTime);
		tg.printLogs("ele_digitalWebLabelValuePlanSelected");
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] WebElement addressElement = driver.findElement(By.xpath("//p[@data-testid='fpe-review-address-line-0']"));
		// [DISABLED] String actual = addressElement.getText();
		// [DISABLED] String expected = "55 DELANCEY ST";
		// [DISABLED] Assert.assertEquals(actual, expected,"FAIL: Expected address does not match actual!");
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] tg.wait(10);
		// [DISABLED] tg.wait("ele_digitalWebCheckBoxAgreeTC", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_digitalWebCheckBoxAgreeTC", 1);
		tg.wait("ele_digitalWebBtnSubmitOrder", ComparisonType.IS_CLICKABLE);
		tg.click("ele_digitalWebBtnSubmitOrder", 1);
		// [DISABLED] tg.wait(20);
		// [DISABLED] tg.wait("ele_digitWebTextThanksForYourOrder", ComparisonType.IS_VISIBLE, 30);
		// [DISABLED] tg.check.isVisible("ele_digitWebTextThanksForYourOrder");
		tg.wait("ele_digitalWebD2CLabelOrderNo", ComparisonType.IS_VISIBLE, 60);
		// [DISABLED] tg.wait("ele_digitWebTextOrderNumber", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.check.isVisible("ele_digitWebTextOrderNumber");
		tg_String var_eleOrderNumber = "";
		var_eleOrderNumber = tg.saveToVariable("ele_digitalWebD2CLabelOrderNo", var_eleOrderNumber);
		tg.printLogs(var_eleOrderNumber);
		tg_String var_eleConfirmationNo = "";
		tg.wait("ele_digitalWebD2CHiddenConfirmationValue", ComparisonType.IS_VISIBLE, 20);
		var_eleConfirmationNo = tg.getElementAttribute("ele_digitalWebD2CHiddenConfirmationValue", "value", var_eleConfirmationNo);
		tg.printLogs(var_eleConfirmationNo);
		tg_String var_url = "";
		START_CUSTOM_SCRIPT;
		 var_url="https://qlab03.fiber.t-mobile.com/my-account?confirmation_id="+var_eleConfirmationNo;
		 System.out.println(var_url);
		driver.get(var_url);
		END_CUSTOM_SCRIPT;
		tg.printLogs(var_url);
		tg.wait(10);
		tg.wait("ele_digitalMyTMOTextLoginEmailorPhone", ComparisonType.IS_CLICKABLE, 40);
		tg.click("ele_digitalMyTMOTextLoginEmailorPhone");
		tg.type("ele_digitalMyTMOTextLoginEmailorPhone", var_emailId);
		tg.wait("ele_digitalMyTMOBtnLoginNext", ComparisonType.IS_CLICKABLE);
		tg.click("ele_digitalMyTMOBtnLoginNext");
		tg.wait("ele_digitalMyTMOTextLoginPassword", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_digitalMyTMOTextLoginPassword");
		tg.type("ele_digitalMyTMOTextLoginPassword", var_password);
		tg.wait("ele_digitalMyTMOBtnLoginLogin", ComparisonType.IS_CLICKABLE);
		tg.click("ele_digitalMyTMOBtnLoginLogin");
		tg.wait("ele_digitalWebLabelValueName", ComparisonType.IS_VISIBLE, 30);
		// [DISABLED] tg.wait("ele_digitalWebCheckBoxAgreeTC", ComparisonType.IS_CLICKABLE);
		// [DISABLED] tg.click("ele_digitalWebCheckBoxAgreeTC");
		tg.wait("ele_digitalWebBtnSubmitOrder", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebBtnSubmitOrder");
		tg.wait("ele_digitWebTextThanksForYourOrder", ComparisonType.IS_VISIBLE, 40);
		// [DISABLED] tg.check.isVisible("ele_digitWebTextThanksForYourOrder");
		tg.wait("ele_digitWebTextOrderNumber", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_digitWebTextOrderNumber");
		tg.close();
	}
}