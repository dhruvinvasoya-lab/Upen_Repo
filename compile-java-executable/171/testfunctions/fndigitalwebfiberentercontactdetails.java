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

class fndigitalwebfiberentercontactdetails {

	public static void fndigitalwebfiberentercontactdetails() {
		tg.wait("ele_digitalWebTextBoxFirstName", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebTextBoxFirstName", 1);
		tg.type("ele_digitalWebTextBoxFirstName", var_firstName);
		tg.wait("ele_digitalWebTextBoxLastName", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebTextBoxLastName", 1);
		tg.type("ele_digitalWebTextBoxLastName", var_lastName);
		tg.wait("ele_digitalWebTextBoxMobileNo", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebTextBoxMobileNo", 1);
		START_CUSTOM_SCRIPT;
		      System.out.println(var_mobileNumber);
		        WebElement phoneField = driver.findElement(By.xpath("//input[@id='phone']"));
		        for (char digit : var_mobileNumber.toCharArray()) {
		            phoneField.sendKeys(String.valueOf(digit));
		        }
		END_CUSTOM_SCRIPT;
		tg.wait(10);
		tg.wait("ele_digitalWebTextBoxEmail", ComparisonType.IS_VISIBLE);
		tg.click("ele_digitalWebTextBoxEmail", 1);
		tg.type("ele_digitalWebTextBoxEmail", var_emailId);
		tg.click("ele_digitalWebTextBoxDOB", 1);
		tg.type("ele_digitalWebTextBoxDOB", "01/01/1994");
		tg.click("ele_DigitalWebTextBoxPin", 1);
		tg.type("ele_DigitalWebTextBoxPin", "121613");
		tg.click("ele_digitalWebBtnNextOnGetStartedPage", 1);
	}
}