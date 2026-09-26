import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
Remove all same duplicate imporst 
import io.testgrid.listeners.RetryFailedTestCases;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import static io.testgrid.enums.KeyboardKeys.*;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import io.testgrid.listeners.TestListener;
import io.testgrid.tg;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class asdasd {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void asdasd() {
		tg.openBrowser();
		tg.startSecureBlock();
		tg.startSecureBlock();
		tg.wait(5);
		tg.endSecureBlock();
		tg.endSecureBlock();
		tg.close();
	}
}