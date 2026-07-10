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
public class recordplay001 {

	@Test
	public void recordplay001() {
		tg.openDevice();
		tg.wait("ele_EnteremailaddressEditText", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnteremailaddressEditText", 1);
		tg.wait("ele_EnteremailaddressEditText", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText", "email@g.com", true);
		tg.wait("ele_EnterpasswordEditText", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnterpasswordEditText", 1);
		tg.wait("ele_EnterpasswordEditText", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnterpasswordEditText", "password", true);
		tg.wait("ele_textinputendiconImageButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_textinputendiconImageButton", 1);
		tg.wait("ele_ForgotPasswordTextView", ComparisonType.IS_VISIBLE);
		tg.click("ele_ForgotPasswordTextView", 1);
		tg.wait("ele_SubmitButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_SubmitButton", 1);
		tg.close();
	}
}