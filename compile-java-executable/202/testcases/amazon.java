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
public class amazon {

	@Test
	public void amazon() {
		tg.openDevice();
		tg.wait(5);
		tg.testFunction("nothanks");
		tg.testFunction("gotitdismiss");
		tg.testFunction("withoutaccountfunc");
		tg.testFunction("gotitdismiss");
		tg.wait(5);
		tg.testFunction("addtabnew");
		tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE, 10);
		tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_SearchortypeURLEditText1");
		tg.type("ele_SearchortypeURLEditText1", "https://www.amazon.in/", true);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click(); 
		END_CUSTOM_SCRIPT;
		tg.wait(5);
		tg.wait(5);
		tg.wait("ele_OpenMenuButton", ComparisonType.IS_VISIBLE, 5);
		tg.click("ele_OpenMenuButton", 1);
		tg.wait(3);
		tg.swipe("ele_AmazonTextView", Direction.UP);
		tg.wait(5);
		tg.swipe("ele_BestSellersTextView", Direction.DOWN);
		tg.wait(5);
		tg.click("ele_AmazonHomeTextView", 1);
		tg.wait("ele_DealsTextView", ComparisonType.IS_VISIBLE, 10);
		tg.swipe("ele_ElectronicsTextView", Direction.LEFT);
		tg.wait(5);
		tg.swipe("ele_ElectronicsTextView", Direction.RIGHT);
		tg.wait(5);
		tg.printLogs("Refresh");
		tg.declare("ele_mobile", "//android.widget.TextView[@text='Your Lists']");
		tg.printLogs("ele_mobile");
		tg.click("ele_mobile", 1);
		tg.wait(3);
		tg.close();
	}
}