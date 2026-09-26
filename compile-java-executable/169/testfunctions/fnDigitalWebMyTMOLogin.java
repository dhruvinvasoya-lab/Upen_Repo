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

class fndigitalwebmytmologin {

	public static void fndigitalwebmytmologin() {
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
	}
}