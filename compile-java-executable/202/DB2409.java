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
public class DB2409 {

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
public void chromescroll() {
    tg.openDevice();
    tg.wait(4);
    tg.testFunction("addtabnew");
    tg.testFunction("searchfunction");
    tg.wait("ele_RegisterTextView1", ComparisonType.IS_VISIBLE, 10);
    tg.swipe(Direction.UP);
    tg.wait(5);
    tg.swipe("ele_RegisterTextView1", Direction.DOWN);
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
public void demologin() {
    tg.openDevice();
    tg.wait(5);
    tg.testFunction("addtabnew");
    tg.wait(4);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE, 10);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://www.facebook.com/login/", false);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait("ele_FacebookLogo", ComparisonType.IS_VISIBLE, 10);
    tg.click("ele_fbuseraddress", 1);
    tg.wait(2);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1]")).sendKeys("kartik@gmail.com");
    tg.customScriptEnd();
    tg.wait(4);
    tg.click("ele_fbpassword", 1);
    tg.wait(2);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1]")).sendKeys("DxR1RIkymo/UllYlJTjM6g==:MTIzNDU2Nzg5MTAxMTEyMQ==");
    tg.customScriptEnd();
    tg.wait(4);
    tg.click("ele_fbshowpassword", 1);
    tg.wait(5);
    tg.close();
}

    @Test
public void repeatcondtions() {
    tg.openDevice();
    tg.wait(5);
    tg.testFunction("addtabnew");
    tg.testFunction("gmailsearch");
    tg.wait(5);
    int var_Count = 0;
    var_Count = tg.saveToVariable(3, var_Count);
    tg.wait(2);
    tg.click("ele_GmailEmailTextView", 1);
    tg.type("ele_GmailEmailEditText", "4", false);
    tg.wait(2);
    while (tg.verify.isGreaterThan("ele_GmailEmailEditText", var_Count)) {
        tg.printLogs("Greater than");
        tg.wait(2);
    }
    while (tg.verify.isLessThan("ele_GmailEmailEditText", 5)) {
        tg.printLogs("Less Than.....");
        tg.wait(3);
    }
    while (tg.verify.contains("ele_GmailEmailEditText", 4)) {
        tg.printLogs("Contain");
        tg.wait(4);
    }
    tg.close();
}

    @Test
public void repeatifdeclare() {
    tg.openDevice();
    tg.wait(5);
    tg.testFunction("addtabnew");
    tg.testFunction("gmailsearch");
    tg.wait(5);
    String var_Name = "null";
    var_Name = tg.saveToVariable("Hello", var_Name);
    tg.declare("ele_Forgot", "//android.widget.Button[@text='Forgot email?']");
    tg.wait(3);
    tg.click("ele_GmailEmailTextView", 1);
    tg.type("ele_GmailEmailEditText", var_Name, true);
    tg.wait(2);
    tg.click("ele_Forgot", 1);
    tg.wait(5);
    tg.close();
}

    @Test
public void repeatifgreaterless() {
    tg.openDevice();
    tg.wait(5);
    tg.testFunction("addtabnew");
    tg.wait(3);
    tg.testFunction("searchfunction");
    tg.wait(4);
    int var_count = 0;
    var_count = tg.saveToVariable(7, var_count);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[7]/android.widget.EditText[1]")).sendKeys("7");
    tg.customScriptEnd();
    tg.wait(5);
    while (tg.verify.isGreaterThanOrEqualTo(var_count, 5)) {
        tg.printLogs("Greater or Equal");
        tg.wait(3);
        while (tg.verify.isLessThanOrEqualTo(var_count, 7)) {
            tg.printLogs("Less than or Equal to....");
            tg.wait(3);
            var_count = tg.increments(var_count, 1);
        }
    }
    tg.close();
}

    @Test
public void repeatnew1() {
    tg.openDevice();
    tg.wait(5);
    tg.testFunction("addtabnew");
    tg.testFunction("gmailsearch");
    tg.wait(4);
    String var_name = "";
    var_name = tg.saveToVariable("First", var_name);
    tg.click("ele_GmailEmailTextView", 1);
    tg.type("ele_GmailEmailEditText", var_name, true);
    tg.printLogs(var_name);
    tg.wait(5);
    while (tg.verify.isEqualTo("ele_GmailEmailEditText", var_name)) {
        tg.printLogs("EQUAL");
        tg.wait(3);
    }
    while (tg.verify.isNotEqualTo("ele_GmailEmailEditText", "FirstFirst")) {
        tg.printLogs("NOT EQUAL");
        tg.wait(3);
    }
    tg.printLogs("SUCCESS......");
    tg.close();
}

    @Test
public void script1() {
    tg.openDevice();
    tg.wait(5);
    tg.click("ele_OpenthehomepageImageButton", 1);
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://demo.guru99.com/test/login.html#", true);
    tg.wait(3);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(5);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.EditText[@resource-id='email']")).sendKeys("kartik@gmail.com");
    tg.customScriptEnd();
    tg.wait(3);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.EditText[@resource-id='passwd']")).sendKeys("StrongPassword");
    tg.customScriptEnd();
    tg.wait(4);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.Button[@text='Sign in']")).click();
    tg.customScriptEnd();
    tg.wait(10);
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
public void startifcondtions() {
    tg.openDevice();
    tg.wait(5);
    tg.testFunction("addtabnew");
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://demo.automationtesting.in/Register.html", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(5);
    tg.click("ele_FirstNameRegisterView", 1);
    if (tg.performAssert("ele_FirstNameRegisterView", ComparisonType.IS_VISIBLE)) {
        tg.wait(10);
    } else {
        if (tg.performAssert("ele_FirstNameRegisterView", ComparisonType.NOT_EQUAL_TO, "kartik")) {
            tg.wait("ele_FirstNameRegisterView", ComparisonType.IS_VISIBLE, 10);
            tg.type("ele_Firstnameregister", "5", false);
            tg.check.isEqualTo("ele_Firstnameregister", 5);
            tg.printLogs("Yes EQUAL.....");
            tg.wait(3);
            tg.check.isGreaterThanOrEqualTo("ele_Firstnameregister", 5);
            if (tg.performAssert("ele_Firstnameregister", ComparisonType.GREATER_THAN_OR_EQUAL_TO, 5)) {
                tg.printLogs("GREATER OR EQUAL......");
                tg.wait(2);
                tg.check.isLessThanOrEqualTo("ele_Firstnameregister", 6);
                if (tg.performAssert("ele_Firstnameregister", ComparisonType.LESS_THAN_OR_EQUAL_TO, 2)) {
                    tg.printLogs("LESS OR EQUAL......");
                    tg.wait(4);
                    tg.check.isGreaterThan("ele_Firstnameregister", 3);
                    if (tg.performAssert("ele_Firstnameregister", ComparisonType.GREATER_THAN, 3)) {
                        tg.printLogs("GREATER......");
                        tg.wait(2);
                        tg.check.isLessThan("ele_Firstnameregister", 6);
                        if (tg.performAssert("ele_Firstnameregister", ComparisonType.LESS_THAN, 6)) {
                            tg.printLogs("LESS THAN.....");
                            tg.wait(2);
                            tg.check.contains("ele_Firstnameregister", "hi");
                            if (tg.performAssert("ele_Firstnameregister", ComparisonType.CONTAINS, "hi")) {
                                tg.printLogs("CONTAINS.....");
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
public void swipenew() {
    tg.openDevice();
    tg.wait(5);
    tg.testFunction("addtabnew");
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
public void tdmdoublejson() {
    tg.openDevice();
    tg.wait(5);
    tg.testFunction("addtabnew");
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://demo.automationtesting.in/Register.html", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    JSONObject var_Data = tg.getJsonData("https://testing.testgrid.io/s/csv-to-json/20240924/aW0lSy.json");
    tg.printLogs(var_Data);
    String var_name = "";
    var_name = tg.saveToVariable(var_name, var_Data, "$.records[0].FirstName");
    tg.type("ele_Firstnameregister", var_name, true);
    tg.wait(2);
    Double var_DB = 1.1;
    var_DB = tg.saveToVariable(2.2, var_DB);
    tg.click("ele_Lastnamereg", 1);
    tg.type("ele_Lastnamereg", var_DB, true);
    tg.wait(2);
    tg.close();
}

    @Test
public void tdmjson() {
    tg.openDevice();
    tg.wait(5);
    tg.testFunction("addtabnew");
    tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_SearchortypeURLEditText1");
    tg.type("ele_SearchortypeURLEditText1", "https://demo.automationtesting.in/Register.html", true);
    tg.customScriptStart();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
    tg.customScriptEnd();
    tg.wait(10);
    JSONObject var_Data = tg.getJsonData("https://testing.testgrid.io/s/csv-to-json/20240924/aW0lSy.json");
    tg.printLogs(var_Data);
    String var_fname = "null";
    String var_lname = "null";
    int var_count = 0;
    while (tg.verify.isLessThan(var_count, 3)) {
        tg.wait(5);
        var_fname = tg.saveToVariable(var_fname, var_Data, "$.records[" + var_count + "].FirstName");
        tg.type("ele_Firstnameregister", var_fname, false);
        tg.wait(5);
        var_lname = tg.saveToVariable(var_lname, var_Data, "$.records[" + var_count + "].LastName");
        tg.type("ele_Lastnameregister1", var_lname, false);
        tg.wait(4);
        var_count = tg.increments(var_count, 1);
    }
    tg.close();
}

    @Test
public void tdmtgivar() {
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
        tg.wait(3);
        tg.wait("ele_SwitchtabsImageButton", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_SwitchtabsImageButton", 1);
        tg.wait(3);
        tg.wait("ele_NewTAB", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_NewTAB", 1);
        tg.wait(4);
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
        var_Fname = tg.saveToVariable("Kartik", var_Fname);
        String var_Lname = "";
        var_Lname = tg.saveToVariable("Makwana", var_Lname);
        tg.check.isVisible("ele_FirstNamePrForm");
        tg.click("ele_FirstNamePrForm", 1);
        tg.type("ele_FirstNamePrForm", var_Fname, true);
        tg.type("ele_lastNameEditText", var_Lname, true);
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

    public static void gmailsearch() {
        tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_SearchortypeURLEditText1");
        tg.type("ele_SearchortypeURLEditText1", "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=ARpgrqeHUgYX-9BV_8F2bSkWJb8dMKMznEwqMWBn8U6E-aEZZIELcLGCQ2-tsDM1nP221pbAXEIo&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S355937431%3A1727107661075557&ddm=0", true);
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

    public static void searchfunction() {
        tg.wait(3);
        tg.wait("ele_SearchortypeURLEditText1", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_SearchortypeURLEditText1");
        tg.type("ele_SearchortypeURLEditText1", "https://demo.automationtesting.in/Register.html", true);
        tg.customScriptStart();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
        tg.customScriptEnd();
        tg.wait(3);
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
