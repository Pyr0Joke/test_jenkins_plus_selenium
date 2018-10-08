import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mainTests {

    WebDriver webDriver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "D:\\Gecko\\geckodriver.exe");
        webDriver = new FirefoxDriver();
    }

    @Test
    public void get_google(){
        webDriver.get("https://www.google.ru");
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://www.google.ru/");

    }

    @Test
    public void get_bad_google(){
        webDriver.get("https://www.google.ru");
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://www.google.ru");
    }

    @AfterTest
    public void tearDown(){
        webDriver.close();
    }
}
