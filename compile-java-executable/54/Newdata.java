import com.mongodb.*;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
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

@Listeners(TestListener.class)
public class Newdata {

    public static Double var_DBG = 40.50;

    public static Double var_ra_DBR = 50.50;

    public static int var_ra_ValueR = 50;

    public static int var_ValueG = 50;

    public static String var_ra_str123 = "DhruvinVasoya";

    public static int var_ra_var1 = 34;

    public static String var_date1 = "DATE";

    public static String var_xyz1 = "123";

    public static String var_ans1 = "Demo";

    public static int var_in2 = 20;

    public static int var_in1 = 10;

    public static String var_ra_NameR = "upen";

    public static String var_NameG = "upendra";

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void getfromapimultiple_copy_copy() {
        tg.openBrowser();
        tg.wait(5);
        int var_ID = 0;
        String var_firstName = "";
        String var_lastName = "";
        String var_maidenName = "";
        int var_age = 0;
        String var_gender = "";
        String var_email = "";
        String var_phone = "";
        String var_username = "";
        String var_password = "";
        String var_birthDate = "";
        String var_image = "";
        String var_bloodGroup = "";
        Double var_height = 0.0;
        Double var_weight = 0.0;
        String var_eyeColor = "";
        JSONObject var_hair = tg.getJsonData("{}");
        String var_ip = "";
        JSONObject var_address = tg.getJsonData("{}");
        String var_addressaddress = "";
        String var_addresscity = "";
        String var_addressstate = "";
        String var_addressstateCode = "";
        int var_addresspostalCode = 0;
        JSONObject var_addresscoordinates = tg.getJsonData("{}");
        Double var_addresscoordinateslat = 0.0;
        Double var_addresscoordinateslng = 0.0;
        String var_addresscountry = "";
        String var_macAddress = "";
        String var_university = "";
        JSONObject var_bank = tg.getJsonData("{}");
        tg.readFromAPI("Multiple_api.json", var_ID, var_firstName, var_lastName, var_maidenName, var_age, var_gender, var_email, var_phone, var_username, var_password, var_birthDate, var_image, var_bloodGroup, var_height, var_weight, var_eyeColor, var_hair, var_ip, var_address, var_addressaddress, var_addresscity, var_addressstate, var_addressstateCode, var_addresspostalCode, var_addresscoordinates, var_addresscoordinateslat, var_addresscoordinateslng, var_addresscountry, var_macAddress, var_university, var_bank);
        tg.printLogs(var_ID);
        tg.printLogs(var_firstName);
        tg.printLogs(var_lastName);
        tg.printLogs(var_maidenName);
        tg.printLogs(var_age);
        tg.printLogs(var_gender);
        tg.printLogs(var_email);
        tg.printLogs(var_phone);
        tg.printLogs(var_username);
        tg.printLogs(var_password);
        tg.printLogs(var_birthDate);
        tg.printLogs(var_image);
        tg.printLogs(var_bloodGroup);
        tg.printLogs(var_height);
        tg.printLogs(var_weight);
        tg.printLogs(var_eyeColor);
        tg.printLogs(var_hair);
        tg.printLogs(var_ip);
        tg.printLogs(var_address);
        tg.printLogs(var_addressaddress);
        tg.printLogs(var_addresscity);
        tg.printLogs(var_addressstate);
        tg.printLogs(var_addressstateCode);
        tg.printLogs(var_addresspostalCode);
        tg.printLogs(var_addresscoordinates);
        tg.printLogs(var_addresscoordinateslat);
        tg.printLogs(var_addresscoordinateslng);
        tg.printLogs(var_addresscountry);
        tg.printLogs(var_macAddress);
        tg.printLogs(var_university);
        tg.printLogs(var_bank);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void xmltestcase_copy_copy() {
        tg.openBrowser();
        tg.wait(1);
        JSONObject var_Jdata = tg.getJsonData("{}");
        tg.readFromAPI("XML_api.json", var_Jdata);
        tg.printLogs(var_Jdata);
        tg.wait(2);
        tg.close();
    }
}
