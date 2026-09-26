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

class fndigitalwebcfamcrpkeyvalidation {

	public static void fndigitalwebcfamcrpkeyvalidation() {
		tg_String var_apiResCrpKey = "";
		tg_String var_apiResCrpKeyValidation = "";
		tg.testFunction("fnDigitalWebFiberCFAMApiTokenGeneration");
		START_CUSTOM_SCRIPT;
		 try{
		            TrustManager[] trustAllCerts = new TrustManager[]{
		                    new X509TrustManager() {
		                        public void checkClientTrusted(X509Certificate[] chain, String authType) {}
		                        public void checkServerTrusted(X509Certificate[] chain, String authType) {}
		                        public X509Certificate[] getAcceptedIssuers() { return new X509Certificate[0]; }
		                    }
		            };
		            SSLContext sslContext = SSLContext.getInstance("TLS");
		            sslContext.init(null, trustAllCerts, new SecureRandom());
		            HostnameVerifier allowAllHosts = new HostnameVerifier() {
		                public boolean verify(String hostname, SSLSession session) {
		                    return true;
		                }
		            };
		  InetSocketAddress sa = new InetSocketAddress("10.0.136.5", 40000);
		            java.net.Proxy proxy = new java.net.Proxy(
		                    java.net.Proxy.Type.HTTP, sa
		            );
		            OkHttpClient client = new OkHttpClient.Builder()
		                    .proxy(proxy)
		                     .sslSocketFactory(sslContext.getSocketFactory(),
		                        (X509TrustManager) trustAllCerts[0])
		                .hostnameVerifier(allowAllHosts)
		                    .build();
		String firstName = var_firstName;
		String lastName = var_lastName;
		String email = var_emailId;
		String addressLine1 = var_address;
		String subscriberNum = var_subscriberNum;
		String jsonBody = "{"
		  + "\"creditConsent\":\"true\","
		  + "\"tmobileMoneyConsent\":false,"
		  + "\"creditCheckType\":\"NOCREDITCHECK\","
		  + "\"person\":{"
		      + "\"firstName\":\"" + firstName + "\","
		      + "\"lastName\":\"" + lastName + "\","
		      + "\"dateOfBirth\":\"2006-10-26\","
		      + "\"socialSecurityNumber\":\"111111111\","
		      + "\"emailAddress\":\"" + email + "\","
		      + "\"address\":[{"
		          + "\"addressLine1\":\"" + addressLine1 + "\","
		          + "\"cityName\":\"NEW YORK\","
		          + "\"stateCode\":\"NY\","
		          + "\"countryCode\":\"USA\","
		          + "\"postalCode\":\"10022\","
		          + "\"addressLine2\":\"\","
		          + "\"postalCodeExtension\":\"1023\""
		      + "}],"
		      + "\"phoneDetails\":["
		          + "{"
		            + "\"phoneNumber\":\"" + subscriberNum + "\","
		            + "\"phoneType\":\"PERSONAL\""
		          + "},"
		          + "{"
		            + "\"phoneNumber\":\"" + subscriberNum + "\","
		            + "\"phoneType\":\"BUSINESS\""
		          + "},"
		          + "{"
		            + "\"phoneNumber\":\"" + subscriberNum + "\","
		            + "\"phoneType\":\"HOME\""
		          + "}"
		      + "],"
		      + "\"identificationDetails\":{"
		          + "\"identityDocumentType\":\"DL\","
		          + "\"expirationDate\":\"2028-03-27\","
		          + "\"issuingState\":\"GA\","
		          + "\"identityDocumentId\":\"GAT2957284683\""
		      + "}"
		  + "}"
		+ "}";
		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType, jsonBody);
		Request request = new Request.Builder()
		  .url("https://corgnt-consumercreditreport-v5.qlab01.npe.tedge.adn-gw.t-mobile.com/customer-credit/v5/credit-reports/personal")
		  .method("POST", body)
		  .addHeader("Content-Type", "application/json")
		  .addHeader("x-auth-originator", var_cfamAccessToken)
		  .addHeader("Authorization", "Bearer "+var_cfamAccessToken)
		  .addHeader("accept", "application/json")
		  .addHeader("version", "1.0")
		  .addHeader("activityid", "234567899")
		  .addHeader("senderid", "Dummy")
		  .addHeader("store-id", "wer")
		  .addHeader("dealer-code", "6549003")
		  .addHeader("workflow-id", "1234")
		  .addHeader("sub-workflow-id", "zxcv")
		  .addHeader("baggage-id", "abc")
		  .addHeader("application-id", "Credit")
		  .addHeader("channel-id", "CFS_TEST")
		  .addHeader("interaction-id", "12345")
		  .addHeader("Content-Type", "application/json")
		  .build();
		Response response = client.newCall(request).execute();
		String responseTxt = response.body().string();
		System.out.println(responseTxt);
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode rootNode = objectMapper.readTree(responseTxt);
		var_apiResCrpKey = rootNode.path("crpKey").asText();
		System.out.println("crpKey = " + var_apiResCrpKey);
		boolean isCrpKeyValid = var_apiResCrpKey.endsWith("93") || var_apiResCrpKey.endsWith("94");
		var_apiResCrpKeyValidation = isCrpKeyValid ? "PASS" : "FAIL";
		END_CUSTOM_SCRIPT;
		// String subscriberNo = record.path("SUBSCRIBER_NO").asText();
		// Print to verify
		// System.out.println("SUBSCRIBER_NO = " + subscriberNo);
		START_CUSTOM_SCRIPT;
		        } catch (Exception e)
		        {
		            System.out.println(e.getMessage());
		        }
		END_CUSTOM_SCRIPT;
		tg.check.isEqualTo(var_apiResCrpKeyValidation,"PASS");
	}
}