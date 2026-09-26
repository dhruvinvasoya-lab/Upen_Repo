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

class fndigitalwebfibercfamapitokengeneration {

	public static void fndigitalwebfibercfamapitokengeneration() {
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
		                      .sslSocketFactory(sslContext.getSocketFactory(),(X509TrustManager) trustAllCerts[0])
		                .hostnameVerifier(allowAllHosts)
		                    .build();
		MediaType mediaType = MediaType.parse("text/plain");
		RequestBody body = RequestBody.create(mediaType, "");
		Request request = new Request.Builder()
		  .url("https://auth.qlab02.npe.tedge.adn-gw.t-mobile.com/oauth2/v1/tokens")
		  .method("POST", body)
		  .addHeader("Authorization", "Basic WFhqWWJQU0dhaWlJME52UWVpeTQ3RWZDM0Q1cmtEZmw6RkV2OFF+d1pqVEZSa1JkWTlYYnB0Xzd1RHUyNEh5dC1NVEh3c2M2cw==")
		  .build();
		Response response = client.newCall(request).execute();
		        String responseTxt = response.body().string();
		        System.out.println(responseTxt);
		        ObjectMapper objectMapper = new ObjectMapper();
		        JsonNode rootNode = objectMapper.readTree(responseTxt);
		        String accessToken = rootNode.path("access_token").asText();
		        var_cfamAccessToken = accessToken;
		        String scope = rootNode.path("scope").asText();
		        System.out.println("CFAM Access Token: " + accessToken);
		        System.out.println("Scope: " + scope);
		        } catch (Exception e)
		        {
		            System.out.println(e.getMessage());
		        }
		END_CUSTOM_SCRIPT;
	}
}