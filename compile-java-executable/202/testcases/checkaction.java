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
public class checkaction {

	@Test
	public void checkaction() {
		tg.openDevice();
		tg.wait(5);
		tg.testFunction("addtabnew");
		tg.testFunction("webinputs");
		tg.wait(4);
		tg.swipe(Direction.UP);
		tg.swipe(Direction.UP);
		tg.wait(3);
		tg.click("ele_inputTextField");
		tg.type("ele_inputTextField", "100", true);
		tg.wait(2);
		tg.check.isEqualTo("ele_inputTextField",100);
		tg.check.isNotEqualTo("ele_inputTextField",120);
		tg.check.isGreaterThanOrEqualTo("ele_inputTextField",99);
		tg.check.isLessThanOrEqualTo("ele_inputTextField",100);
		tg.check.isGreaterThan("ele_inputTextField",95);
		tg.check.isLessThan("ele_inputTextField",110);
		tg.wait(3);
		tg.wait(2);
		tg.type("ele_inputTextField", "10", true);
		tg.wait(3);
		tg.close();
	}
}