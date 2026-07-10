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
public class countries {

	@Test
	public void countries() {
		tg.openDevice();
		tg.wait(5);
		if(tg.performAssert("ele_updatecancel", ComparisonType.IS_VISIBLE)){
		tg.click("ele_updatecancel", 1);
		tg.wait(3);
		}
		tg.check.isVisible("ele_WondersoftheworldTextView");
		tg.click("ele_ContinentsTextView", 1);
		tg.wait(5);
		tg.check.isVisible("ele_EuropeTextView");
		tg.click("ele_AsiaTextView", 1);
		tg.wait(5);
		tg.swipe(Direction.UP);
		tg.wait(4);
		tg.swipe(Direction.DOWN);
		tg.wait(4);
		tg.close();
	}
}