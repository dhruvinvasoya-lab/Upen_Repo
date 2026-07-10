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
public class swipenew {

	@Test
	public void swipenew() {
		tg.openDevice();
		tg.wait(5);
		tg.testFunction("chromeinteruption");
		tg.testFunction("addtabnew");
		tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE, 1);
		tg.check.isVisible("ele_SearchortypeURLEditText1");
		tg.type("ele_SearchortypeURLEditText1", "https://demoqa.com/automation-practice-form", true);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click(); 
		END_CUSTOM_SCRIPT;
		tg.wait(10);
		tg.swipe(Direction.UP);
		tg.wait(2);
		tg.swipe(Direction.LEFT);
		tg.wait(2);
		tg.swipe(Direction.DOWN);
		tg.wait(2);
		tg.swipe(Direction.RIGHT);
		tg.wait(2);
		tg.close();
	}
}