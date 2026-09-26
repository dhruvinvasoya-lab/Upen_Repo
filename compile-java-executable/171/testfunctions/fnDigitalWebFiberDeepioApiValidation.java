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

class fndigitalwebfiberdeepioapivalidation {

	public static void fndigitalwebfiberdeepioapivalidation() {
		tg_int var_statusCode = 0;
		tg_String var_apiResStatus = "";
		tg_int var_allPassed = 1;
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
		     // ── Define all event names here ──────────────────────────────────────
		    String[] eventNames = {
		        "CustomerAccountActivated",
		        "TentativeAccountCreated",
		        "LegacyBillingAccountAttributeValueModified",
		        "CamsTentativeBanCreated",
		        "AccountActivatedBilling",
		        "LegacyProductAttributeValueModified",
		        "TMobileIdLoginProfileCreated",
		        "TMobileIdPhoneNumberLinked",
		        "AccountActivated",
		        "TMobileIdAuthenticated",
		        "TMobileIdProfileAttributesUpdated",
		        "TMobileIdAuthorized",
		        "LFproductOrderStateModified"
		       
		    };       
		String env = var_env;           // e.g., "qlab02"
		String key = "accountNumber";           // e.g., "accountNumber"
		String value = var_ban;         // e.g., "986001177"
		    ObjectMapper objectMapper = new ObjectMapper();
		    for (String eventName : eventNames) {
		        System.out.println("\n── Testing event: " + eventName + " ──");
		        String jsonBody = "{\"consumerFlag\":true,\"env\":\"" + env
		            + "\",\"eventName\":\"" + eventName
		            + "\",\"key\":\"" + key
		            + "\",\"value\":\"" + value
		            + "\",\"payloadFlag\":true}";
		        MediaType mediaType = MediaType.parse("application/json");
		        RequestBody body    = RequestBody.create(mediaType, jsonBody);
		        Request request = new Request.Builder()
		            .url("https://deepio-internal-npe.t-mobile.com/api/deep/checker/v1/event/parameters")
		            .method("POST", body)
		            .addHeader("Content-Type", "application/json")
		            .addHeader("Authorization", "Basic WFhqWWJQU0dhaWlJME52UWVpeTQ3RWZDM0Q1cmtEZmw6a0wyOFF+SWZyczFZYmdzdDJacHNxclhXRGxPRmZSRHo3elMtRWFDcA==")
		            .addHeader("ignoreme", "plz")
		            .build();
		        Response response    = client.newCall(request).execute();
		        
		        int statusCode       = response.code();
		        String responseTxt   = response.body().string();
		        JsonNode rootNode    = objectMapper.readTree(responseTxt);
		        String status        = rootNode.path("status").asText();
		        System.out.println("Status Code : " + statusCode);
		        System.out.println("Status      : " + status);
		        System.out.println("Full Response: " + responseTxt);
		        // Track last values for tg_ variables (used in assertions below)
		        var_statusCode   = statusCode;
		        var_apiResStatus = status;
		        // Flag overall pass/fail
		        if (statusCode != 200 || !status.equals("OK")) {
		            var_allPassed = 0;
		            System.out.println("FAILED for event: " + eventName);
		        } else {
		            System.out.println("PASSED for event: " + eventName);
		        }
		    }
		} catch (Exception e) {
		    System.out.println("Exception Occurred: " + e.getMessage());
		    var_allPassed = 0;
		}
		END_CUSTOM_SCRIPT;
		// Single assertion covering all 15 events
		tg.check.isEqualTo(var_allPassed,"1");
	}
}