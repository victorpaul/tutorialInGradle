import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    static WebDriver chrome;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\victor\\java\\hahahahahah\\src\\test\\resources\\chromedriver.exe");
        chrome = new ChromeDriver();
    }

    @AfterClass
    public static void finish() {
        chrome.quit();
        chrome = null;
    }
}
