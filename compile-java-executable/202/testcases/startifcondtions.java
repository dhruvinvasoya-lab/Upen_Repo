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
public class startifcondtions {

	@Test
	public void startifcondtions() {
		tg.openDevice();
		tg.wait(5);
		tg.testFunction("chromeinteruption");
		tg.testFunction("addtabnew");
		tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_SearchortypeURLEditText1");
		tg.type("ele_SearchortypeURLEditText1", "https://demo.automationtesting.in/Register.html", true);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click(); 
		END_CUSTOM_SCRIPT;
		tg.wait(5);
		if(tg.performAssert("ele_FirstRegister", ComparisonType.IS_INVISIBLE)){
		tg.wait(10);
		} else {
		if(tg.performAssert("ele_FirstRegister", ComparisonType.NOT_EQUAL_TO, "kartik")){
		tg.wait("ele_FirstRegister", ComparisonType.IS_VISIBLE, 10);
		tg.type("ele_FirstRegister", "5", true);
		tg.check.isEqualTo("ele_FirstRegister",5);
		tg.printLogs("Yes EQUAL.....");
		tg.wait(3);
		tg.check.isGreaterThanOrEqualTo("ele_FirstRegister",5);
		if(tg.performAssert("ele_FirstRegister", ComparisonType.GREATER_THAN_OR_EQUAL_TO, 5)){
		tg.printLogs("GREATER OR EQUAL......");
		tg.wait(2);
		tg.check.isLessThanOrEqualTo("ele_FirstRegister",6);
		if(tg.performAssert("ele_FirstRegister", ComparisonType.LESS_THAN_OR_EQUAL_TO , 2)){
		tg.printLogs("LESS OR EQUAL......");
		tg.wait(4);
		tg.check.isGreaterThan("ele_FirstRegister",3);
		if(tg.performAssert("ele_FirstRegister", ComparisonType.GREATER_THAN , 3)){
		tg.printLogs("GREATER......");
		tg.wait(2);
		tg.check.isLessThan("ele_FirstRegister",6);
		if(tg.performAssert("ele_FirstRegister", ComparisonType.LESS_THAN , 6)){
		tg.printLogs("LESS THAN.....");
		tg.wait(2);
		tg.check.contains("ele_FirstRegister","hi");
		if(tg.performAssert("ele_FirstRegister", ComparisonType.CONTAINS , "hi")){
		tg.printLogs("CONTAINS.....");
		tg.wait(5);
		}
		}
		}
		}
		}
		}
		}
		tg.close();
	}
}