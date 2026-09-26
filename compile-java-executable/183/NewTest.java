import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;

@Listeners(TestListener.class)
public class NewTest {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
public void digital_mytmoweb_login() {
    tg.openBrowser();
    var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
    var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
    tg.testFunction("fnDigitalWebLoginPROD_copy");
    tg.testFunction("fnAcceptCookies_copy");
    tg.testFunction("fnClickViewBill_copy");
    // [DISABLED] tg.testFunction("fnlogoutRestored_copy");
    tg.close();
}

    public static void fnacceptcookies() {
        if (tg.performAssert("ele_acceptButtonXpath", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_acceptButtonXpath", 1);
        }
    }

    public static void fnclickbackbutton() {
        tg.check.isVisible("ele_backButton");
        if (tg.performAssert("ele_backButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_backButton", 1);
        }
    }

    public static void fnclickonpastbills() {
        tg.wait("ele_pastBillsButton", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_pastBillsButton", 1);
    }

    public static void fnclickonrecentpastbills() {
        // Existing steps
        tg.wait("ele_billsDetailsButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_billsDetailsButton", 1);
        // ===== Custom: Verify that the displayed date starts with the current month (MMM) =====
        tg.customScriptStart();
        try {
            // Use an explicit wait so we don't read an empty/placeholder value
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
            WebElement monthEl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//bb-billing-ui/div/bb-summary//div[1]/bb-balance/div/div[2]/div/div/b")));
            // Full date text from <b> element, e.g., "Mar 10, 2026"
            String fullDateText = monthEl.getText();
            if (fullDateText == null)
                fullDateText = "";
            fullDateText = fullDateText.trim();
            // Expected month abbreviation for current month (e.g., "Mar")
            String expectedMMM = java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("MMM", java.util.Locale.ENGLISH)).trim();
            // Extract the first three characters from the actual text
            String actualMMM = fullDateText.length() >= 3 ? fullDateText.substring(0, 3) : fullDateText;
            // Normalize to lower-case for case-insensitive comparison
            String actualNorm = actualMMM.toLowerCase(java.util.Locale.ENGLISH);
            String expectedNorm = expectedMMM.toLowerCase(java.util.Locale.ENGLISH);
            // Helpful logs in TestGrid console
            System.out.println("[MonthPrefixCheck] Full text      : " + fullDateText);
            System.out.println("[MonthPrefixCheck] Actual (MMM)   : " + actualMMM);
            System.out.println("[MonthPrefixCheck] Expected (MMM) : " + expectedMMM);
            // Perform assertion INSIDE the custom block to avoid scope issues
            io.testgrid.tg.performAssert(actualNorm, io.testgrid.enums.ComparisonType.EQUAL_TO, expectedNorm);
        } catch (org.openqa.selenium.NoSuchElementException nse) {
            throw new AssertionError("Month label element not found for the provided XPath.", nse);
        } catch (Exception e) {
            throw new RuntimeException("Unexpected error during month prefix check.", e);
        }
        tg.customScriptEnd();
    }

    public static void fnclickviewbill() {
        tg.wait("ele_viewBillLink", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_viewBillLink", 1);
    }

    public static void fndigitalwebloginprod() {
        tg.wait("ele_myaccountSpan", ComparisonType.IS_VISIBLE);
        tg.click("ele_myaccountSpan", 1);
        tg.wait("ele_loginLink", ComparisonType.IS_VISIBLE, 20);
        tg.check.isClickable("ele_loginLink");
        tg.click("ele_loginLink", 1);
        tg.wait("ele_emailOrPhoneInput", ComparisonType.IS_VISIBLE);
        tg.click("ele_emailOrPhoneInput", 1);
        tg.type("ele_emailOrPhoneInput", var_ra_Username);
        tg.wait("ele_nextButton", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_nextButton", 1);
        tg.startSecureBlock();
        tg.wait("ele_passwordInput", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_passwordInput", 1);
        tg.wait("ele_passwordInput", ComparisonType.IS_VISIBLE);
        tg.type("ele_passwordInput", var_Password);
        tg.endSecureBlock();
        tg.wait("ele_LoginButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_LoginButton", 1);
        tg.printLogs("Complete Login");
    }

    public static void fndontallownotificationpopup() {
        tg.wait("ele_dontAllowNotification", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_dontAllowNotification", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_dontAllowNotification", 1);
        }
    }

    public static void fnlogoutrestored() {
        if (tg.performAssert("ele_loginUserButton", ComparisonType.IS_INVISIBLE)) {
            tg.wait("ele_backButton", ComparisonType.IS_VISIBLE, 20);
            tg.click("ele_backButton", 1);
        }
        tg.wait("ele_loginUserButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_loginUserButton", 1);
        tg.wait("ele_logoutButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_logoutButton", 1);
        tg.check.isVisible("ele_loginDiv");
    }
}
