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

class fndigitalwebfibergetsiebelcxbillaccountdetailsfromchub {

	public static void fndigitalwebfibergetsiebelcxbillaccountdetailsfromchub() {
		tg_String var_apiResAcctType = "";
		tg_String var_apiResAcctSubType = "";
		tg_String var_apiResFirstName = "";
		tg_String var_apiResLastName = "";
		tg_String var_apiResAddLine = "";
		tg_String var_apiResCity = "";
		tg_String var_apiResZipcode = "";
		tg_String var_apiResStatus = "";
		tg.testFunction("fnDigitalWebFiberDataBaseApiTokenGeneration");
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
		String envName = var_env;        // e.g., "QLAB03"
		String query   = "select * from SIEBEL.CX_BILL_ACCNT where BILL_ACCNT_NAME ='"  + var_ban + "'";
		String dbName  = "chub"; 
		END_CUSTOM_SCRIPT;
		// e.g., "samson"
		START_CUSTOM_SCRIPT;
		String jsonBody = "{\"envName\":\"" + envName + "\",\"query\":\"" + query + "\",\"databaseName\":\"" + dbName + "\"}";
		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType, jsonBody);
		Request request = new Request.Builder()
		  .url("https://tdp-data-validation-service.px-npe2201.tke.t-mobile.com/fetchData")
		  .method("POST", body)
		  .addHeader("Content-Type", "application/json")
		  .addHeader("x-auth-originator", var_samsonAccessToken)
		  .addHeader("Authorization", "Bearer "+var_samsonAccessToken)
		  .addHeader("Cookie", "INGRESSCOOKIE=89927225e651c071aaa4eb3dd13e3e8d|f265fc1e56de3fcf270b906a18cbb4d0")
		  .build();
		Response response = client.newCall(request).execute();
		         String responseTxt = response.body().string();
		            System.out.println(responseTxt);
		           ObjectMapper objectMapper = new ObjectMapper();
		           JsonNode rootNode = objectMapper.readTree(responseTxt);
		         JsonNode record = rootNode
		                .path("dataset")
		                .path("data")
		                .path("record")
		                .path(0);
		               int statusCode = response.code();
		               var_apiResFirstName = record.path("CON_FST_NAME").asText();
		               var_apiResLastName = record.path("CON_LAST_NAME").asText();
		               var_apiResAcctSubType = record.path("ACCNT_SUB_TYPE").asText();
		               var_apiResAcctType = record.path("ACCNT_TYPE").asText();
		               var_apiResStatus = record.path("STATUS").asText();
		               var_apiResZipcode = record.path("ZIPCODE").asText();
		               var_apiResAddLine = record.path("ADDR_LINE1").asText();
		               var_apiResCity = record.path("CITY").asText();
		END_CUSTOM_SCRIPT;
		// String customerId = record.path("CUSTOMER_ID").asText();
		// Print to verify
		// System.out.println("CUSTOMER_ID = " + customerId);
		START_CUSTOM_SCRIPT;
		        } catch (Exception e)
		        {
		            System.out.println(e.getMessage());
		        }
		END_CUSTOM_SCRIPT;
		tg.check.isEqualTo("statusCode","200");
		tg.check.isEqualTo(var_apiResAcctType,"I");
		tg.check.isEqualTo(var_apiResAcctSubType,"R");
		tg.check.isEqualTo(var_apiResFirstName,var_firstName);
		tg.check.isEqualTo(var_apiResLastName,var_lastName);
		tg.check.isEqualTo(var_apiResStatus,"O");
		tg.check.isEqualTo(var_apiResAddLine,var_address);
		tg.check.isEqualTo(var_apiResCity,"city");
		tg.check.isEqualTo(var_apiResZipcode,"zipcode");
	}
}