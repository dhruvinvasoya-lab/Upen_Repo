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
public class globalvariable {

	@Test
	public void globalvariable() {
		tg.openDevice();
		tg_String var_lstr = "Null";
		tg_int var_lint = 0;
		tg.printLogs(var_lstr);
		tg.printLogs(var_lint);
		tg.wait("ele_EditTextEnteremailaddress", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_EditTextEnteremailaddress", 1);
		tg.type("ele_EditTextEnteremailaddress", var_lstr, false);
		tg.wait(3);
		tg.click("ele_EditTextEnterpassword", 1);
		tg.wait("ele_EditTextEnterpassword", ComparisonType.IS_VISIBLE);
		tg.type("ele_EditTextEnterpassword", var_lint, false);
		var_lstr = tg.saveToVariable("GSTR", var_lstr);
		var_lint = tg.saveToVariable("GINT", var_lint);
		tg.printLogs("GSTR");
		tg.printLogs("GINT");
		tg.close();
	}
}