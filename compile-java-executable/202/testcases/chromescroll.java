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
public class chromescroll {

	@Test
	public void chromescroll() {
		tg.openDevice();
		tg.wait(4);
		tg.testFunction("chromeinteruption");
		tg.wait(3);
		tg.testFunction("addtabnew");
		tg.testFunction("searchfunction");
		tg.wait("ele_RegisterTextView1", ComparisonType.IS_VISIBLE, 10);
		tg.swipe(Direction.UP);
		tg.wait(5);
		tg.swipe("ele_RegisterTextView1", Direction.DOWN);
		tg.wait(5);
		tg.close();
	}
}