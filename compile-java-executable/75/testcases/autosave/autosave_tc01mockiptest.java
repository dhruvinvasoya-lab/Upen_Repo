import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
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
public class tc01mockiptest {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc01mockiptest() {
		tg.openDevice();
		tg.clearAppData("ch.protonvpn.android");
		tg.activateApp("ch.protonvpn.android");
				tg.wait("ele_Continueasguest", ComparisonType.IS_VISIBLE, 20);
				tg.click("ele_Continueasguest", 1);
				tg.wait("ele_NotnowTextView1790342964457", ComparisonType.IS_VISIBLE);
				tg.click("ele_NotnowTextView1790342964457", 1);
				tg.wait("ele_CurruntIPAddressTextView", ComparisonType.IS_VISIBLE, 20);
				tg_String var_curruntIP = "NULL";
				var_curruntIP = tg.saveToVariable("ele_CurruntIPAddressTextView", var_curruntIP);
				tg.wait("ele_ConnectTextView", ComparisonType.IS_VISIBLE);
				tg.click("ele_ConnectTextView", 1);
				if(tg.performAssert("ele_NothanksTextView1790344118271", ComparisonType.IS_VISIBLE)){
				tg.click("ele_NothanksTextView1790344118271", 1);
				}
				tg.wait("ele_FastestfreeserverTextView", ComparisonType.IS_VISIBLE, 20);
				tg.click("ele_FastestfreeserverTextView", 1);
				tg.wait("ele_MyIPTextView", ComparisonType.IS_VISIBLE);
				tg.check.isVisible("ele_MyIPTextView");
				tg.click("ele_ShowIPView1790333227014", 1);
				tg.wait("ele_NewPublicIPFetch");
				tg_String var_MyIP = "NULL";
				var_MyIP = tg.saveToVariable("ele_NewPublicIPFetch", var_MyIP);
				tg.printLogs(var_curruntIP);
				tg.printLogs(var_MyIP);
				tg.check.isNotEqualTo(var_MyIP,var_curruntIP);
				tg.wait("ele_BackView", ComparisonType.IS_VISIBLE);
				tg.click("ele_BackView", 1);
				tg.wait(10);
		tg.activateApp("com.android.chrome");
				tg.wait("ele_ContinueButton", ComparisonType.IS_VISIBLE);
				if(tg.performAssert("ele_ContinueButton", ComparisonType.IS_VISIBLE)){
				tg.click("ele_ContinueButton", 1);
				}
				if(tg.performAssert("ele_AllowButton", ComparisonType.IS_VISIBLE)){
				tg.click("ele_AllowButton", 1);
				}
				tg.click("ele_homebuttonImageButton1790344758037", 1);
				tg.wait(5);
		START_CUSTOM_SCRIPT;
		driver.get("https://www.whatismyip.com/");
		END_CUSTOM_SCRIPT;
				tg.wait("ele_ShowmoreinfoTextView1790344803994", ComparisonType.IS_VISIBLE, 60);
				tg.check.isVisible("ele_ShowmoreinfoTextView1790344803994");
		tg.deactivateApp("com.android.chrome");
				tg.wait("ele_CloseView1790344356560", ComparisonType.IS_VISIBLE);
				if(tg.performAssert("ele_CloseView1790344356560", ComparisonType.IS_VISIBLE)){
				tg.click("ele_CloseView1790344356560", 1);
				}
				tg.wait("ele_DisconnectTextView", ComparisonType.IS_VISIBLE, 20);
				tg.click("ele_DisconnectTextView", 1);
		tg.close();
	}
}