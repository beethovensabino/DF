package Steps;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;

import java.util.concurrent.TimeUnit;

public class Gancho {
    public static WebDriver driver;

    @Before
    public void iniciarDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\temp\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("http://sampleapp.tricentis.com/101/app.php");
        driver.manage().window().maximize();
    }
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void abrirUrl(String url) {
		driver.get(url);
	}
}
