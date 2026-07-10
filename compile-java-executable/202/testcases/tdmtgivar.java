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
public class tdmtgivar {

	@Test
	public void tdmtgivar() {
		tg.openDevice();
		tg.wait(5);
		tg.check.isVisible("ele_Logo");
		tg.check.isVisible("ele_EnteremailaddressEditText");
		tg.type("ele_EnteremailaddressEditText", "#TGITVAR.FirstName", true);
		tg.wait(3);
		tg.check.isVisible("ele_EnterpasswordEditText");
		tg.type("ele_EnterpasswordEditText", "#TGITVAR.LastName", true);
		tg.wait(2);
		tg.click("ele_ShowpasswordImageButton", 3);
		tg.wait(5);
		tg.close();
	}
}