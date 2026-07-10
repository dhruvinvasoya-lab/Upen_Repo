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
public class repeatifgreaterless {

	@Test
	public void repeatifgreaterless() {
		tg.openDevice();
		tg.wait(5);
		tg.testFunction("chromeinteruption");
		tg.testFunction("addtabnew");
		tg.wait(3);
		tg.testFunction("searchfunction");
		tg.wait(4);
		tg_int var_count = 0;
		var_count = tg.saveToVariable(7, var_count);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[7]/android.widget.EditText[1]")).sendKeys("7");
		END_CUSTOM_SCRIPT;
		tg.wait(5);
		while(tg.verify.isGreaterThanOrEqualTo(var_count, 5)){
		tg.printLogs("Greater or Equal");
		tg.wait(3);
		while(tg.verify.isLessThanOrEqualTo(var_count, 7)){
		tg.printLogs("Less than or Equal to....");
		tg.wait(3);
		}
		}
		tg.close();
	}
}