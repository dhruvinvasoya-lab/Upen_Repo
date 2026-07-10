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
public class repeatnew2 {

	@Test
	public void repeatnew2() {
		tg.openDevice();
		tg.wait(5);
		tg.testFunction("chromeinteruption");
		tg.testFunction("addtabnew");
		tg.testFunction("demoqahome");
		tg.wait(4);
		tg.scroll("ele_ElementCardView", Direction.DOWN);
		tg.wait(2);
		tg.click("ele_ElementCardView", 1);
		tg.wait(4);
		tg.scroll("ele_TextBoxMenu", Direction.UP);
		tg.wait("ele_TextBoxMenu", ComparisonType.IS_VISIBLE, 5);
		tg_String var_name = "";
		var_name = tg.saveToVariable("First", var_name);
		tg.click("ele_TextBoxMenu", 1);
		tg.wait("ele_TBedittextusername", ComparisonType.IS_VISIBLE, 10);
		tg.type("ele_TBedittextusername", var_name, false);
		tg.printLogs(var_name);
		tg.wait(5);
		while(tg.verify.isEqualTo("ele_TBedittextusername", var_name)){
		tg.printLogs("EQUAL");
		tg.wait(3);
		while(tg.verify.isNotEqualTo("ele_TBedittextusername", "Kartik")){
		tg.printLogs("NOT EQUAL");
		tg.wait(3);
		tg.type("ele_TBedittextusername", "Kartik", false);
		}
		}
		tg.printLogs("SUCCESS......");
		tg.swipe(Direction.DOWN);
		tg.close();
	}
}