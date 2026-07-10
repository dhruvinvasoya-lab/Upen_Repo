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
public class checkaction1 {

	@Test
	public void checkaction1() {
		tg.openDevice();
		tg.wait("ele_EditTextEnteremailaddress", ComparisonType.IS_VISIBLE);
		tg.click("ele_EditTextEnteremailaddress", 1);
		tg.wait("ele_EditTextEnteremailaddress", ComparisonType.IS_VISIBLE);
		tg.type("ele_EditTextEnteremailaddress", "123", true);
		tg.wait("ele_EditTextEnterpassword", ComparisonType.IS_VISIBLE);
		tg.click("ele_EditTextEnterpassword", 1);
		tg.wait("ele_EditTextEnterpassword", ComparisonType.IS_VISIBLE);
		tg.type("ele_EditTextEnterpassword", "12345", true);
		tg.check.isEqualTo("ele_EditTextEnteremailaddress",123);
		tg.check.isNotEqualTo("ele_EditTextEnteremailaddress",101);
		tg.check.isGreaterThanOrEqualTo("ele_EditTextEnteremailaddress",123);
		tg.check.isLessThanOrEqualTo("ele_EditTextEnteremailaddress",125);
		tg.check.isGreaterThan("ele_EditTextEnteremailaddress",50);
		tg.check.isLessThan("ele_EditTextEnteremailaddress",150);
		tg.close();
	}
}