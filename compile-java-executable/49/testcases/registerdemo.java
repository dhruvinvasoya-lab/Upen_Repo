import com.mongodb.*;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
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

@Listeners(TestListener.class);
public class registerdemo {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void registerdemo() {
		tg.openBrowser();
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait("ele_firstname663", ComparisonType.IS_VISIBLE);
		tg.click("ele_firstname663", 1);
		tg.wait("ele_firstname663", ComparisonType.IS_VISIBLE);
		tg.type("ele_firstname663", "hiii");
		tg.wait("ele_lastname033", ComparisonType.IS_VISIBLE);
		tg.click("ele_lastname033", 1);
		tg.wait("ele_lastname033", ComparisonType.IS_VISIBLE);
		tg.type("ele_lastname033", "hiii");
		tg.wait(5);
		tg.wait("ele_male440", ComparisonType.IS_VISIBLE);
		tg.click("ele_male440", 1);
		tg.wait(5);
		tg.tapByImage("ele_submit", 0.35);
		tg.wait(5);
		tg.close();
	}
}