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

class fndigitalwebfibergetbillingaccountdetailsfromsamson {

	public static void fndigitalwebfibergetbillingaccountdetailsfromsamson() {
		tg_String var_banStatus = "O";
		tg_String var_accountType = "I";
		tg_String var_apiResBanStatus = "";
		tg_String var_apiResAccountType = "";
		tg_String var_apiResCustomerId = "";
		tg_int var_statusCodeFromDBApi = 0;
		tg_String var_todayDate = "";
		tg_String var_apisysCreationDate = "";
		tg_String var_apiResSysUpdationDate = "";
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
		String query   = "select * from billing_account where ban='" + var_ban + "'";
		String dbName  = "samson";
		String todayDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.ENGLISH));
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
		        String customerId = record.path("CUSTOMER_ID").asText();
		        String sysCreationDate = record.path("SYS_CREATION_DATE").asText();
		        String sysUpdateDate = record.path("SYS_UPDATE_DATE").asText();
		        String accountType = record.path("ACCOUNT_TYPE").asText();
		        String banStatus = record.path("BAN_STATUS").asText();
		        String sysCreationDateOnly = sysCreationDate.substring(0, todayDate.length());
		        String sysUpdateDateOnly = sysUpdateDate.substring(0, todayDate.length());
		       var_apiResBanStatus= banStatus;
		       var_apiResCustomerId=customerId;
		       var_apiResAccountType=accountType;
		       var_statusCodeFromDBApi = response.code();
		       var_apisysCreationDate = sysCreationDateOnly;
		       var_apiResSysUpdationDate = sysUpdateDateOnly;
		       var_todayDate=todayDate;
		END_CUSTOM_SCRIPT;
		// Print to verify
		START_CUSTOM_SCRIPT;
		        System.out.println("CUSTOMER_ID = " + customerId);
		        //System.out.println("SYS_CREATION_DATE = " + var_todayDate);
		        } catch (Exception e)
		        {
		            System.out.println(e.getMessage());
		        }
		END_CUSTOM_SCRIPT;
		tg.check.isEqualTo(var_statusCodeFromDBApi,"200");
		tg.check.isEqualTo(var_apiResBanStatus,var_banStatus);
		tg.check.isEqualTo(var_apiResCustomerId,var_ban);
		tg.check.isEqualTo(var_apiResAccountType,var_accountType);
		tg.check.isEqualTo(var_apisysCreationDate,var_todayDate);
		tg.check.isEqualTo(var_apiResSysUpdationDate,var_todayDate);
	}
}