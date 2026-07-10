import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import org.bson.conversions.Bson;
import org.bson.Document;
import org.bson.BsonInt64;
import org.bson.BsonDocument;
import com.mongodb.*;
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
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class recordplay {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void recordplay() {
		tg.openDevice();
		tg.wait("ele_homebuttonImageButton1783682916904", ComparisonType.IS_VISIBLE);
		tg.click("ele_homebuttonImageButton1783682916904", 1);
		tg.wait("ele_SearchGoogleortypeURLEditText1783682923866", ComparisonType.IS_VISIBLE);
		tg.click("ele_SearchGoogleortypeURLEditText1783682923866", 1);
		tg.wait("ele_SearchGoogleortypeURLEditText1783682932116", ComparisonType.IS_VISIBLE);
		tg.click("ele_SearchGoogleortypeURLEditText1783682932116", 1);
		tg.wait("ele_SearchGoogleortypeURLEditText1783682932116", ComparisonType.IS_VISIBLE);
		tg.type("ele_SearchGoogleortypeURLEditText1783682932116", "192.168.88.17:80/Demo", false);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
		END_CUSTOM_SCRIPT;
		tg.wait(10);
		tg.wait("ele_TogglenavigationButton1783683156908", ComparisonType.IS_VISIBLE);
		tg.click("ele_TogglenavigationButton1783683156908", 1);
		tg.wait("ele_HOMETextView1783683165348", ComparisonType.IS_VISIBLE);
		tg.click("ele_HOMETextView1783683165348", 1);
		tg.wait(5);
		tg.close();
	}
}