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
public class declaredemo {

	@Test
	public void declaredemo() {
		tg.openDevice();
		tg.wait(5);
		tg.testFunction("chromeinteruption");
		tg.testFunction("addtabnew");
		tg.testFunction("demoqahome");
		tg.wait(5);
		tg.declare("ele_elementmenu", "//android.widget.TextView[@text='Elements']");
		tg.click("ele_elementmenu", 1);
		tg.wait(8);
		tg.swipe(Direction.DOWN);
		tg.declare("ele_textboxelement", "//android.widget.TextView[@text='Text Box']");
		tg.scroll("ele_textboxelement", Direction.DOWN);
		tg.wait(3);
		tg.click("ele_textboxelement");
		tg.wait(5);
		tg.close();
	}
}