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
public class registerdemoai {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void registerdemoai() {
		tg.openBrowser();
				tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
				tg.wait(5);
				tg.aiPrompt("Wait until First Name is visible, Tap on First Name, Type in First Name-Upne");
				tg.wait(5);
		tg.close();
	}
}