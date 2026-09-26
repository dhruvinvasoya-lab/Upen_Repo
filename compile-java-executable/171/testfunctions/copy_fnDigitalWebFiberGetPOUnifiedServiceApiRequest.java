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

class copy_fndigitalwebfibergetpounifiedserviceapirequest {

	public static void copy_fndigitalwebfibergetpounifiedserviceapirequest() {
		START_CUSTOM_SCRIPT;
		 try{
		  InetSocketAddress sa = new InetSocketAddress("10.0.136.5", 40000);
		            java.net.Proxy proxy = new java.net.Proxy(
		                    java.net.Proxy.Type.HTTP, sa
		            );
		 TrustManager[] trustAllCerts = new TrustManager[]{
		                new X509TrustManager() {
		                    public X509Certificate[] getAcceptedIssuers() { return new X509Certificate[]{}; }
		                    public void checkClientTrusted(X509Certificate[] certs, String authType) {}
		                    public void checkServerTrusted(X509Certificate[] certs, String authType) {}
		                }
		        };
		        SSLContext sslContext = SSLContext.getInstance("SSL");
		        sslContext.init(null, trustAllCerts, new SecureRandom());
		        OkHttpClient client = new OkHttpClient.Builder()
		                .sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustAllCerts[0])
		                .hostnameVerifier((hostname, session) -> true)
		                .proxy(proxy)
		                .build();
		MediaType mediaType = MediaType.parse("application/json");
		String billingAccNo = var_ban;
		System.out.println (billingAccNo);
		RequestBody body = RequestBody.create(mediaType, "");
		Request request = new Request.Builder()
		  .url("https://cbpsrv-bil-prdt-mgmt-inventory-mgmt-s1-v1.qlab03.npe.tedge.adn-gw.t-mobile.com/billing-product-management/v1/product-inventory-management/product?filter=relatedPartyId%3D%3D"+billingAccNo)
		  .method("GET", null)
		  .addHeader("Content-Type", "application/json")
		  .addHeader("x-auth-originator", var_samsonAccessToken)
		  .addHeader("X-Authorization", var_samsonAccessToken)
		  .addHeader("application-id", "3456")
		  .addHeader("channel-id", "6743")
		  .addHeader("origin-application-id", "266745")
		  .addHeader("activity-id", "1")
		  .addHeader("Accept-Encoding", "*")
		  .addHeader("session-id", "1")
		  .addHeader("interaction-id", "1")
		  .addHeader("workflow-id", "1")
		  .addHeader("sub-workflow-id", "1")
		  .addHeader("Authorization", "Bearer "+var_samsonAccessToken)
		  .build();
		Response response = client.newCall(request).execute();
		if(response == null){
		            throw new RuntimeException("API Call Failed due to SSL issue");
		        }
		        int statusCode = response.code();
		        String responseTxt = response.body().string();
		    System.out.println("Status Code: " + statusCode);
		    System.out.println("Response Body:\n" + responseTxt);
		END_CUSTOM_SCRIPT;
		tg.check.isEqualTo("statusCode",200);
		START_CUSTOM_SCRIPT;
		    if (statusCode == 200) {
		        System.out.println("TEST PASS: Received HTTP 200 OK");
		END_CUSTOM_SCRIPT;
		} else {
		START_CUSTOM_SCRIPT;
		        throw new AssertionError("TEST FAIL: Expected HTTP 200 but got: " + statusCode);
		    }
		        } catch (Exception e)
		        {
		            System.out.println("Exception Occured: " + e.getMessage());
		        }
		END_CUSTOM_SCRIPT;
	}
}