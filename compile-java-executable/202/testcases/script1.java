import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import org.bson.conversions.Bson;
import org.bson.Document;
import org.bson.BsonInt64;
import org.bson.BsonDocument;
import com.mongodb.*;
import io.testgrid.listeners.TestListener;
import io.testgrid.tg;
import org.testng.annotations.Listeners;
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
public class script1 {

	@Test
	public void script1() {
		tg.openDevice();
		tg.wait(5);
		tg.testFunction("chromeinteruption");
		tg.testFunction("addtabnew");
		tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_SearchortypeURLEditText1");
		tg.type("ele_SearchortypeURLEditText1", "https://demo.guru99.com/test/login.html#", true);
		tg.wait(3);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click(); 
		END_CUSTOM_SCRIPT;
		tg.wait(5);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='email']")).sendKeys("kartik@gmail.com");
		END_CUSTOM_SCRIPT;
		tg.wait(3);
		tg.click("ele_passwdEditText1", 1);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='passwd']")).sendKeys("StrongPassword");
		END_CUSTOM_SCRIPT;
		tg.wait(4);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.Button[@text='Sign in']")).click();
		END_CUSTOM_SCRIPT;
		tg.wait(10);
		tg.close();
	}
}