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
        System.setProperty("webdriver.gecko.driver", "C:\\Tools\\gecko\\geckodriver.exe");
        webDriver = new FirefoxDriver();
    }

    @Test
    public void get_Korona(){
        webDriver.get("http://192.168.4.194/#/");
        Assert.assertEquals(webDriver.getCurrentUrl(),"http://192.168.4.194/#/");

    }

    @Test
    public void get_bad_Korona(){
        webDriver.get("http://192.168.4.194/#/");
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://www.google.ru");
    }

    @AfterTest
    public void tearDown(){
        webDriver.close();
    }
}
