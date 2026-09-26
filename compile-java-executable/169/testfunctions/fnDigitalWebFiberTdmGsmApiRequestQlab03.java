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

class fndigitalwebfibertdmgsmapirequestqlab03 {

	public static void fndigitalwebfibertdmgsmapirequestqlab03() {
		tg.testFunction("fnDigitalWebTdmApiAuthTokenGenerationQlab03");
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
		MediaType mediaType = MediaType.parse("text/plain");
		RequestBody body = RequestBody.create(mediaType, "");
		Request request = new Request.Builder()
		  .url("https://tdp-data-service.px-npe2201.tke.t-mobile.com/hsi/hsiData?env=QLAB03&count=1&ntid=lakhma1&reserve_count=0")
		  .method("POST", body)
		  .addHeader("x-auth-originator", var_tdmAccessToken)
		  .addHeader("Authorization", "Bearer " + var_tdmAccessToken)
		  .addHeader("Cookie", "INGRESSCOOKIE=53f2894ef0b6c391df16c39deac168a1|4c5c5d71c72a82d3c283d71b11ecd66a")
		  .build();
		Response response = client.newCall(request).execute();
		         String responseTxt = response.body().string();
		            System.out.println(responseTxt);
		           ObjectMapper objectMapper = new ObjectMapper();
		           JsonNode rootNode = objectMapper.readTree(responseTxt);
		         JsonNode record = rootNode
		                .path("dataset")
		                .path("data")
		                .path(0);
		        String ban = record.path("BAN").asText();
		        String msisdn = record.path("MSISDN").asText();
		        String email = record.path("EMAIL").asText();
		        String firstName = record.path("FIRST_NAME").asText();
		        String lastName = record.path("LAST_BUSINESS_NAME").asText();
		        String pwd = record.path("PWD").asText();
		        String pin = record.path("ACC_PASSWORD").asText();
		var_ban = ban;
		var_firstName = firstName;
		var_lastName = lastName;
		var_mobileNumber = msisdn;
		var_accPin = pin;
		var_password = pwd;
		var_emailId = email;
		  int statusCode = response.code();
tg.check.isEqualTo("statusCode",200);
		END_CUSTOM_SCRIPT;
		// Print to verify
		START_CUSTOM_SCRIPT;
		        System.out.println("BAN = " + ban);
		        System.out.println("MSISDN = " + msisdn);
		        } catch (Exception e)
		        {
		            System.out.println(e.getMessage());
		        }
		END_CUSTOM_SCRIPT;
		tg.printLogs(var_ban);
	}
}