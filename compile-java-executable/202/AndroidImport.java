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

@Listeners(TestListener.class)
public class AndroidImport {

    @Test
public void amazon() {
    tg.openDevice();
    tg.wait(5);
    tg.click("ele_OpenthehomepageImageButton", 1);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://www.amazon.in/", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    tg.wait(10);
    tg.wait("ele_OpenMenuButton", ComparisonType.IS_VISIBLE);
    tg.click("ele_OpenMenuButton", 1);
    tg.wait(3);
    tg.swipe("ele_AmazonTextView", Direction.UP);
    tg.wait(5);
    tg.swipe("ele_BestSellersTextView", Direction.DOWN);
    tg.wait(5);
    tg.click("ele_AmazonHomeTextView", 1);
    tg.wait("ele_FashionImage", ComparisonType.IS_VISIBLE);
    tg.swipe("ele_miniTVminiTVView1", Direction.LEFT);
    tg.wait(5);
    tg.swipe("ele_FashionImage", Direction.RIGHT);
    tg.wait(5);
    tg.printLogs("Refresh");
    tg.declare("ele_mobile", "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.TextView[1]");
    tg.printLogs("ele_mobile");
    tg.click("ele_mobile", 1);
    tg.wait(3);
    tg.close();
}

    @Test
public void amazonscroll() {
    tg.openDevice();
    tg.wait(5);
    tg.click("ele_DontallowButton", 1);
    tg.wait(3);
    tg.check.isVisible("ele_FashionImage");
    tg.wait(3);
    tg.scroll("ele_Starting349Bestsellingheadphones", Direction.DOWN);
    tg.wait(5);
    tg.close();
}

    @Test
public void autofixheal() {
    tg.openDevice();
    tg.wait(5);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://www.amazon.in/", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    tg.wait("ele_OpenMenuButton", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_OpenMenuButton");
    tg.click("ele_OpenMenuButton", 1);
    tg.wait(3);
    tg.close();
}

    @Test
public void browser() {
    tg.openDevice();
    tg.wait(5);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://demoqa.com/automation-practice-form", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    if (tg.performAssert("ele_Firstnamedemoqa", ComparisonType.IS_INVISIBLE)) {
        tg.wait(10);
    } else {
        tg.testFunction("demodata");
        tg.scroll("ele_SelectStateTextView", Direction.DOWN);
        tg.wait(5);
        tg.check.isVisible("ele_SportsCheckBox");
        tg.click("ele_SportsCheckBox", 1);
        tg.wait(5);
        tg.scroll("ele_Emailid", Direction.UP);
        tg.wait(5);
        tg.check.isVisible("ele_MaleRadioButton");
        tg.click("ele_MaleRadioButton", 1);
        tg.wait(4);
        tg.swipe(Direction.LEFT);
        tg.wait(3);
        tg.swipe(Direction.RIGHT);
        tg.wait(2);
    }
    tg.close();
}

    @Test
public void chrome() {
    tg.openDevice();
    tg.wait(5);
    tg.testFunction("nothanks");
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://demoqa.com/automation-practice-form", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    tg.scroll("ele_SportsCheckBox", Direction.DOWN);
    tg.wait(5);
    tg.scroll("ele_Firstname00", Direction.UP);
    tg.wait(5);
    tg.close();
}

    @Test
public void countries() {
    tg.openDevice();
    tg.wait(5);
    tg.check.isVisible("ele_WondersoftheworldTextView");
    tg.click("ele_ContinentsTextView", 1);
    tg.wait(5);
    tg.check.isVisible("ele_EuropeTextView");
    tg.click("ele_AsiaTextView", 1);
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.wait(4);
    tg.swipe(Direction.DOWN);
    tg.wait(4);
    tg.close();
}

    @Test
public void demo() {
    tg.openDevice();
    tg.wait(5);
    tg.check.isVisible("ele_Logo");
    tg.wait(5);
    tg.type("ele_EnteremailaddressEditText", "upen@gmail.com", true);
    tg.wait(3);
    tg.check.isVisible("ele_EnterpasswordEditText");
    tg.typeEncrypted("ele_EnterpasswordEditText", "UUCu+ArPg4Ph1Bz87AWKVg==:MTIzNDU2Nzg5MTAxMTEyMQ==", true);
    tg.wait(2);
    tg.click("ele_ShowpasswordImageButton", 1);
    tg.wait(5);
    tg.click("ele_SignInButton", 1);
    tg.wait(5);
    tg.close();
}

    @Test
public void jshondouble() {
    tg.openDevice();
    tg.wait(5);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://demo.automationtesting.in/Register.html", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    JSONObject var_Data = tg.getJsonData("http://localhost/s/csv-to-json/20240909/lZJsOa.json");
    tg.printLogs(var_Data);
    String var_name = "";
    var_name = tg.saveToVariable(var_name, var_Data, "$.records[0].FirstName");
    tg.type("ele_Firstnamereg", var_name, true);
    tg.wait(2);
    Double var_DB = 1.1;
    var_DB = tg.saveToVariable(2.2, var_DB);
    tg.click("ele_Lastnamereg", 1);
    tg.type("ele_Lastnamereg", var_DB, true);
    tg.wait(2);
    tg.close();
}

    @Test
public void register() {
    tg.openDevice();
    tg.wait(5);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://demo.automationtesting.in/Register.html", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    tg.scroll("ele_SelectSkillsView", Direction.DOWN);
    tg.wait(5);
    tg.scroll("ele_Firstnamereg", Direction.UP);
    tg.wait(5);
    tg.close();
}

    @Test
public void repeat() {
    tg.openDevice();
    tg.wait(5);
    tg.testFunction("Demoqastart");
    String var_Name = "";
    var_Name = tg.saveToVariable("First", var_Name);
    tg.printLogs(var_Name);
    tg.wait(2);
    tg.type("ele_Firstnamedemoqa", var_Name, true);
    tg.wait(3);
    while (tg.verify.isEqualTo("ele_Firstnamedemoqa", var_Name)) {
        tg.printLogs("Equal");
        tg.wait(2);
        tg.type("ele_Firstnamedemoqa", var_Name, true);
        while (tg.verify.isNotEqualTo("ele_Firstnamedemoqa", "FirstFirst")) {
            tg.printLogs("Not Equal");
        }
    }
    tg.close();
}

    @Test
public void repeatcondtions() {
    tg.openDevice();
    tg.wait(5);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://demoqa.com/automation-practice-form", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    int var_Count = 0;
    var_Count = tg.saveToVariable(3, var_Count);
    tg.wait(2);
    tg.type("ele_Firstname0", "4", true);
    tg.wait(2);
    while (tg.verify.isGreaterThan("ele_Firstname0", var_Count)) {
        tg.printLogs("Greater than");
        tg.wait(2);
        while (tg.verify.isLessThan("ele_Firstname0", 5)) {
            tg.printLogs("less");
            while (tg.verify.contains("ele_Firstname0", 6)) {
                tg.wait(4);
                tg.printLogs("Contain");
            }
        }
    }
    tg.close();
}

    @Test
public void repeatifdeclare() {
    tg.openDevice();
    tg.wait(5);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://demoqa.com/automation-practice-form", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    String var_Name = "null";
    int var_count = 0;
    var_count = tg.saveToVariable(2, var_count);
    while (tg.verify.isLessThan(var_count, 5)) {
        tg.declare("ele_Data", "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[{$}]/android.widget.EditText[1]", var_count);
        tg.wait(3);
        tg.printLogs("ele_Data");
        var_Name = tg.saveToVariable("Hello", var_Name);
        tg.type("ele_Data", var_Name, true);
        tg.wait(2);
        var_count = tg.increments(var_count, 1);
        tg.printLogs(var_count);
    }
    tg.close();
}

    @Test
public void repeatifgraterless() {
    tg.openDevice();
    tg.wait(5);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://demoqa.com/automation-practice-form", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    int var_count = 0;
    var_count = tg.saveToVariable(3, var_count);
    tg.type("ele_Firstname0", var_count, true);
    tg.wait(2);
    while (tg.verify.isGreaterThanOrEqualTo("ele_Firstname0", 5)) {
        tg.printLogs("Greater or eqaul");
        tg.wait(4);
        while (tg.verify.isLessThanOrEqualTo("ele_Firstname0", 5)) {
            tg.printLogs("Less or Equal");
            tg.wait(3);
        }
    }
    tg.close();
}

    @Test
public void script() {
    tg.openDevice();
    tg.wait(5);
    if (tg.performAssert("ele_GotitButton", ComparisonType.IS_INVISIBLE)) {
        tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_SearchortypeURLEditText1");
        tg.customScriptStart();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/search_box_text']")).sendKeys("https://www.facebook.com/");
        tg.customScriptEnd();
        tg.wait(5);
        tg.customScriptStart();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
        tg.customScriptEnd();
        tg.wait(8);
        tg.customScriptStart();
        driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile number or email address']")).sendKeys("upendra@gmail.com");
        tg.customScriptEnd();
        tg.wait(3);
        tg.customScriptStart();
        driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("Goswami@12");
        tg.customScriptEnd();
        tg.wait(4);
        tg.customScriptStart();
        driver.findElement(By.xpath("//android.widget.Button[@text='Log in']")).click();
        tg.customScriptEnd();
    } else {
        tg.testFunction("GotIt");
        tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_SearchortypeURLEditText1");
        tg.customScriptStart();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/search_box_text']")).sendKeys("https://www.facebook.com/");
        tg.customScriptEnd();
        tg.wait(5);
        tg.customScriptStart();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
        tg.customScriptEnd();
        tg.wait(8);
        tg.customScriptStart();
        driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile number or email address']")).sendKeys("upendra@gmail.com");
        tg.customScriptEnd();
        tg.wait(3);
        tg.customScriptStart();
        driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("Goswami@12");
        tg.customScriptEnd();
        tg.wait(4);
        tg.customScriptStart();
        driver.findElement(By.xpath("//android.widget.Button[@text='Log in']")).click();
        tg.customScriptEnd();
        tg.wait(4);
    }
    tg.close();
}

    @Test
public void scriptnew() {
    tg.openDevice();
    tg.wait(5);
    tg.click("ele_OpenthehomepageImageButton", 1);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/search_box_text']")).sendKeys("https://www.facebook.com/");
    tg.customScriptEnd();
    tg.wait(5);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(8);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile number or email address']")).sendKeys("upendra@gmail.com");
    tg.customScriptEnd();
    tg.wait(3);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("Goswami@12");
    tg.customScriptEnd();
    tg.wait(4);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.Button[@text='Log in']")).click();
    tg.customScriptEnd();
    tg.wait(3);
    tg.close();
}

    @Test
public void scrollamazon() {
    tg.openDevice();
    tg.wait(5);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://www.amazon.in/", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    tg.scroll("ele_sidebar", "ele_miniTVminiTVView1", Direction.LEFT);
    tg.wait(5);
    tg.scroll("ele_sidebar", "ele_FashionImage", Direction.LEFT);
    tg.wait(2);
    tg.close();
}

    @Test
public void startifcondtion() {
    tg.openDevice();
    tg.wait(5);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://demo.automationtesting.in/Register.html", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    tg.check.isNotEqualTo("ele_Firstnamereg", 5);
    if (tg.performAssert("ele_Firstnamereg", ComparisonType.EQUAL_TO, 5)) {
        tg.wait(10);
    } else {
        if (tg.performAssert("ele_Firstnamereg", ComparisonType.NOT_EQUAL_TO, "upen")) {
            tg.wait("ele_Firstnamereg", ComparisonType.IS_VISIBLE);
            tg.type("ele_Firstnamereg", "5", true);
            tg.check.isEqualTo("ele_Firstnamereg", 5);
            tg.wait(3);
            tg.check.isGreaterThanOrEqualTo("ele_Firstnamereg", 5);
            if (tg.performAssert("ele_Firstnamereg", ComparisonType.GREATER_THAN_OR_EQUAL_TO, 5)) {
                tg.wait(2);
                tg.check.isLessThanOrEqualTo("ele_Firstnamereg", 6);
                if (tg.performAssert("ele_Firstnamereg", ComparisonType.LESS_THAN_OR_EQUAL_TO, 2)) {
                    tg.wait(4);
                    tg.check.isGreaterThan("ele_Firstnamereg", 3);
                    if (tg.performAssert("ele_Firstnamereg", ComparisonType.GREATER_THAN, 3)) {
                        tg.wait(2);
                        tg.check.isLessThan("ele_Firstnamereg", 6);
                        if (tg.performAssert("ele_Firstnamereg", ComparisonType.LESS_THAN, 6)) {
                            tg.wait(2);
                            tg.check.contains("ele_Firstnamereg", "hi");
                            if (tg.performAssert("ele_Firstnamereg", ComparisonType.CONTAINS, "hi")) {
                                tg.wait(5);
                            }
                        }
                    }
                }
            }
        }
    }
    tg.close();
}

    @Test
public void swipe() {
    tg.openDevice();
    tg.wait(5);
    tg.testFunction("nothanks");
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE, 1);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://demoqa.com/automation-practice-form", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    tg.swipe(Direction.UP);
    tg.wait(2);
    tg.swipe(Direction.LEFT);
    tg.wait(2);
    tg.swipe(Direction.DOWN);
    tg.wait(2);
    tg.swipe(Direction.RIGHT);
    tg.wait(2);
    tg.close();
}

    @Test
public void tdmandroid() {
    tg.openDevice();
    tg.wait(5);
    tg.check.isVisible("ele_Logo");
    tg.check.isVisible("ele_EnteremailaddressEditText");
    tg.type("ele_EnteremailaddressEditText", "#TGITVAR.FirstName", true);
    tg.wait(3);
    tg.check.isVisible("ele_EnterpasswordEditText");
    tg.type("ele_EnterpasswordEditText", "#TGITVAR.LastName", true);
    tg.wait(2);
    tg.click("ele_ShowpasswordImageButton", 3);
    tg.wait(5);
    tg.close();
}

    @Test
public void urrunner() {
    tg.openDevice();
    tg.wait("ele_EditTextEnteremailaddress", ComparisonType.IS_VISIBLE);
    tg.click("ele_EditTextEnteremailaddress", 1);
    tg.wait("ele_EditTextEnteremailaddress", ComparisonType.IS_VISIBLE);
    tg.type("ele_EditTextEnteremailaddress", "upen@gmail.com", true);
    tg.wait("ele_EditTextEnterpassword", ComparisonType.IS_VISIBLE);
    tg.click("ele_EditTextEnterpassword", 1);
    tg.wait("ele_EditTextEnterpassword", ComparisonType.IS_VISIBLE);
    tg.type("ele_EditTextEnterpassword", "12345", true);
    tg.wait("ele_ImageButton1717065403577", ComparisonType.IS_VISIBLE);
    tg.click("ele_ImageButton1717065403577", 1);
    tg.wait("ele_ButtonSignIn", ComparisonType.IS_VISIBLE);
    tg.click("ele_ButtonSignIn", 1);
    tg.wait("ele_ButtonOKAY", ComparisonType.IS_VISIBLE);
    tg.click("ele_ButtonOKAY", 1);
    tg.close();
}

    public static void addtabnew() {
        tg.wait("ele_NewtabImageButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_NewtabImageButton", 1);
        tg.click("ele_OpenthehomepageImageButton", 1);
    }

    public static void chromebrowser() {
        tg.check.isVisible("ele_UsewithoutanaccountButton");
        tg.click("ele_UsewithoutanaccountButton", 1);
        tg.wait(5);
        tg.wait("ele_SettingsButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_GotitButton", 1);
        tg.wait(5);
    }

    public static void demodata() {
        String var_Fname = "";
        var_Fname = tg.saveToVariable("upen", var_Fname);
        String var_Lname = "";
        var_Lname = tg.saveToVariable("goswami", var_Lname);
        tg.check.isVisible("ele_Firstnamedemoqa");
        tg.wait("ele_Firstnamedemoqa", ComparisonType.IS_VISIBLE);
        tg.type("ele_Firstnamedemoqa", var_Fname, true);
        tg.wait("ele_Lastname", ComparisonType.IS_VISIBLE);
        tg.type("ele_Lastname", var_Lname, true);
        tg.wait(5);
    }

    public static void demoqastart() {
        tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_SearchortypeURLEditText1");
        tg.type("ele_SearchortypeURLEditText1", "https://demoqa.com/automation-practice-form", true);
        tg.customScriptStart();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
        tg.customScriptEnd();
        tg.wait(10);
    }

    public static void gotit() {
        tg.wait("ele_SettingsButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_GotitButton", 1);
        tg.wait(5);
    }

    public static void morebutton() {
        tg.wait("ele_MoreButton", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_MoreButton");
        tg.click("ele_MoreButton", 1);
        tg.wait(4);
    }

    public static void nothanks() {
        tg.check.isVisible("ele_NothanksButton");
        tg.click("ele_NothanksButton", 1);
        tg.wait(5);
    }

    public static void switctab() {
        tg.wait("ele_NewtabImageButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_NewtabImageButton", 1);
    }

    public static void testing() {
        tg.wait("ele_EditTextEnteremailaddress", ComparisonType.IS_VISIBLE);
        tg.click("ele_EditTextEnteremailaddress", 1);
    }

    public static void usersetting() {
        tg.check.isVisible("ele_UsewithoutanaccountButton");
        tg.click("ele_UsewithoutanaccountButton", 1);
        tg.wait(5);
    }
}
