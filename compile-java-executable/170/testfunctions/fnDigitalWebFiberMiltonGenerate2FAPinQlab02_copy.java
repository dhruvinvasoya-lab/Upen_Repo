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

class fndigitalwebfibermiltongenerate2fapinqlab02 {

	public static void fndigitalwebfibermiltongenerate2fapinqlab02() {
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
		  InetSocketAddress sa = new InetSocketAddress("10.0.136.5", 40002);
		            java.net.Proxy proxy = new java.net.Proxy(
		                    java.net.Proxy.Type.HTTP, sa
		            );
		            OkHttpClient client = new OkHttpClient.Builder()
		                    .proxy(proxy)
		                     .sslSocketFactory(sslContext.getSocketFactory(),
		                        (X509TrustManager) trustAllCerts[0])
		                .hostnameVerifier(allowAllHosts)
		                    .build();
		MediaType mediaType = MediaType.parse("application/json");
		  System.out.println("TestDebugStartingFunction2FA");
		 String email = var_username; 
		 System.out.println(email);
		 String mailto = "mailto:" + email;
		 System.out.println(mailto);
		String jsonBody = "{\n" +
		                "  \"notification\": \"" + mailto + "\",\n" +
		                "  \"user_id\": \"" + mailto + "\"\n" +
		                "}";
		                System.out.println(jsonBody);
		        RequestBody body = RequestBody.create(mediaType, jsonBody);
		        Request request = new Request.Builder()
		                .url("https://ws14.iam.msg.lab.t-mobile.com:443/oauth2/v1/generatetemppin")
		                .method("POST", body)
		                .addHeader("Authorization", "Bearer " + var_tokenFromAPIAuth)
		                 .addHeader("Content-Type", "application/json")
		                .build();
		        Response response = client.newCall(request).execute();
		        String responseTxt = response.body().string();
		        System.out.println(responseTxt);
		        ObjectMapper objectMapper = new ObjectMapper();
		        JsonNode rootNode = objectMapper.readTree(responseTxt);
		END_CUSTOM_SCRIPT;
		// Extract tempPin from API response
		START_CUSTOM_SCRIPT;
		        var_mpin = rootNode.path("tempPin").asText();
		        } catch (Exception e)
		        {
		            System.out.println(e.getMessage());
		        }
		END_CUSTOM_SCRIPT;
		tg.printLogs("responseTxt");
		tg.printLogs(var_mpin);
		tg.printLogs(var_username);
	}
}