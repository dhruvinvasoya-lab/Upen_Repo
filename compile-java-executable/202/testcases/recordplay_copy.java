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
public class recordplay_copy {

	@Test
	public void recordplay_copy() {
		tg.openDevice();
		tg.wait(5);
		tg.wait("ele_LinearLayout", ComparisonType.IS_VISIBLE);
		tg.click("ele_LinearLayout", 1);
		tg.wait("ele_CountriesImageView", ComparisonType.IS_VISIBLE);
		tg.click("ele_CountriesImageView", 1);
		tg.swipe(Direction.UP);
		tg.swipe(Direction.UP);
		tg.swipe(Direction.UP);
		tg.wait("ele_UnitedKingdomTextView", ComparisonType.IS_VISIBLE);
		tg.click("ele_UnitedKingdomTextView", 1);
		tg.wait("ele_ivcountrybackImageView", ComparisonType.IS_VISIBLE);
		tg.click("ele_ivcountrybackImageView", 1);
		tg.wait("ele_ivbackImageView", ComparisonType.IS_VISIBLE);
		tg.click("ele_ivbackImageView", 1);
		tg.close();
	}
}