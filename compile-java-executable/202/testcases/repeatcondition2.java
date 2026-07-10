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
public class repeatcondition2 {

	@Test
	public void repeatcondition2() {
		tg.openDevice();
		tg.wait(5);
		tg.testFunction("chromeinteruption");
		tg.testFunction("addtabnew");
		tg.testFunction("demoqahome");
		tg.wait(5);
		tg.swipe("ele_ElementCardView", Direction.UP);
		tg.wait(2);
		tg.scroll("ele_ElementCardView", Direction.DOWN);
		tg.click("ele_ElementCardView", 1);
		tg.wait(4);
		tg.scroll("ele_TextBoxMenu", Direction.UP);
		tg.wait("ele_TextBoxMenu", ComparisonType.IS_VISIBLE, 5);
		tg_int var_Count = 0;
		var_Count = tg.saveToVariable(3, var_Count);
		tg.wait(2);
		tg.click("ele_TextBoxMenu", 1);
		tg.wait("ele_TBedittextusername", ComparisonType.IS_VISIBLE, 10);
		tg.type("ele_TBedittextusername", "3", false);
		tg.wait(4);
		while(tg.verify.isGreaterThan("ele_TBedittextusername", var_Count)){
		tg.printLogs("Greater than");
		tg.wait(2);
		}
		while(tg.verify.isLessThan("ele_TBedittextusername", 2)){
		tg.printLogs("Less Than.....");
		tg.wait(3);
		}
		while(tg.verify.contains("ele_TBedittextusername", 4)){
		tg.printLogs("Contain");
		tg.wait(4);
		}
		tg.swipe(Direction.DOWN);
		tg.close();
	}
}