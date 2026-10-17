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
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class tc01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc01() {
		tg.openBrowser();
		tg.wait(5);
		START_CUSTOM_SCRIPT;
		// Replace the placeholder with your Atlas connection string
		        String uri = "mongodb+srv://yogeshappvolution:tqdlativpwmifhbl@testgrid.cz7ueay.mongodb.net/?retryWrites=true&w=majority&appName=testgrid";
		        // Construct a ServerApi instance using the ServerApi.builder() method
		        ServerApi serverApi = ServerApi.builder()
		                .version(ServerApiVersion.V1)
		                .build();
		        MongoClientSettings settings = MongoClientSettings.builder()
		                .applyConnectionString(new ConnectionString(uri))
		                .serverApi(serverApi)
		                .build();
		        // Create a new client and connect to the server
		        try (MongoClient mongoClient = MongoClients.create(settings)) {
		            MongoDatabase database = mongoClient.getDatabase("admin");
		            try {
		                // Send a ping to confirm a successful connection
		                Bson command = new BsonDocument("ping", new BsonInt64(1));
		                Document commandResult = database.runCommand(command);
		                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
		            } catch (MongoException me) {
		                System.err.println(me);
		            }
		        }
		END_CUSTOM_SCRIPT;
		tg.wait(2);
		tg.close();
	}
}