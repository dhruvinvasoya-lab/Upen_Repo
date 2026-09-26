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

class fndigitawebreplogin {

	public static void fndigitawebreplogin() {
		var_repUsername = tg.saveToVariable("Test.konikineni@tmobilenet.com", var_repUsername);
		tg.wait(2);
		if(tg.performAssert("ele_digitalWebBtnAcceptTmoNotice", ComparisonType.IS_VISIBLE)){
		tg.click("ele_digitalWebBtnAcceptTmoNotice");
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
	}
}