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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class tc00001 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc00001() {
		tg.openBrowser();
		// [DISABLED] tg.wait("ele_logintofac928", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.testFunction("fnclickonrecentpastbills_tg_ts01", new Object[]{});
		// [DISABLED] tg.testFunction("fnclickonpastbills_tg_ts01", new Object[]{});
		// [DISABLED] tg_String var_name = "";
		// [DISABLED] 		var_name = tg.readFromAPI("AR_api.json").getString();
		tg.wait(5);
		tg.close();
	}
}