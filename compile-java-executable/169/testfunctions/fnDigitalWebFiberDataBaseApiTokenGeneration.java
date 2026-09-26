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

class fndigitalwebfiberdatabaseapitokengeneration {

	public static void fndigitalwebfiberdatabaseapitokengeneration() {
		tg_int var_statusCodeFromDBAuthApi = 0;
		START_CUSTOM_SCRIPT;
		 try{
		  InetSocketAddress sa = new InetSocketAddress("10.0.136.5", 40000);
		            java.net.Proxy proxy = new java.net.Proxy(
		                    java.net.Proxy.Type.HTTP, sa
		            );
		            OkHttpClient client = new OkHttpClient.Builder()
		                    .proxy(proxy)
		                    .build();
		MediaType mediaType = MediaType.parse("text/plain");
		RequestBody body = RequestBody.create(mediaType, "");
		Request request = new Request.Builder()
		  .url("https://auth.qlab01.npe.aedge.adn-gw.t-mobile.com/oauth2/v1/tokens")
		  .method("POST", body)
		  .addHeader("Authorization", "Basic YUFzcndVNWlDN2x2dDJtc0JWQUhLY3FEYjhlNjBlZ3g6N29pOFF+alZOSk1fZFNQclF3dDVQZGlCNlBlNU5BQlV3SGotdmRyZg==")
		  .build();
		Response response = client.newCall(request).execute();
		        String responseTxt = response.body().string();
		        System.out.println(responseTxt);
		        ObjectMapper objectMapper = new ObjectMapper();
		        JsonNode rootNode = objectMapper.readTree(responseTxt);
		        String accessToken = rootNode.path("access_token").asText();
		        var_samsonAccessToken = accessToken;
		        String scope = rootNode.path("scope").asText();
		        //System.out.println("Access Token: " + accessToken);
		        //System.out.println("Scope: " + scope);
		          var_statusCodeFromDBAuthApi=response.code();
		System.out.println(var_statusCodeFromDBAuthApi);
		        } catch (Exception e)
		        {
		            System.out.println(e.getMessage());
		        }
		END_CUSTOM_SCRIPT;
		// [DISABLED] tg.printLogs(var_samsonAccessToken);
		tg.check.isEqualTo(var_statusCodeFromDBAuthApi,"200");
	}
}