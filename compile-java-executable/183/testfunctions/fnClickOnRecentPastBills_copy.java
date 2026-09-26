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
import static io.testgrid.baseClass.driver;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

class fnclickonrecentpastbills {

    public static void fnclickonrecentpastbills() {
        // Existing steps
        tg.wait("ele_billsDetailsButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_billsDetailsButton", 1);

        // ===== Custom: Verify that the displayed date starts with the current month (MMM) =====
        START_CUSTOM_SCRIPT;
        try {
            // Optional small wait for the summary to render (uncomment if needed)
            // Thread.sleep(500);

            // Use an explicit wait so we don't read an empty/placeholder value
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
            WebElement monthEl = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//bb-billing-ui/div/bb-summary//div[1]/bb-balance/div/div[2]/div/div/b")
                )
            );

            // Full date text from <b> element, e.g., "Mar 10, 2026"
            String fullDateText = monthEl.getText();
            if (fullDateText == null) fullDateText = "";
            fullDateText = fullDateText.trim();

            // Expected month abbreviation for current month (e.g., "Mar")
            String expectedMMM = java.time.LocalDate.now().format(
                java.time.format.DateTimeFormatter.ofPattern("MMM", java.util.Locale.ENGLISH)
            ).trim();

            // Extract the first three characters from the actual text
            String actualMMM = fullDateText.length() >= 3
                    ? fullDateText.substring(0, 3)
                    : fullDateText;

            // Normalize to lower-case for case-insensitive comparison
            String actualNorm   = actualMMM.toLowerCase(java.util.Locale.ENGLISH);
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
        END_CUSTOM_SCRIPT;
        // ===== End custom check =====
    }
}