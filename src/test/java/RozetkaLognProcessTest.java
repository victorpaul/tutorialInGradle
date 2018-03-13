import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RozetkaLognProcessTest extends BaseTest {

    private void login_every_timewithcredentials(String pass, String login) {
        assertNotNull(pass);
        assertNotNull(login);
    }

    @Before
    public void setUp() {

    }

    @Test
    public void open_google_home_page() {
        login_every_timewithcredentials("sd", "asd");

        chrome.get("https://rozetka.com.ua/ua/");
        assertEquals("https://rozetka.com.ua/ua/", chrome.getCurrentUrl());

    }

    @Test
    public void open_google_login() throws InterruptedException {
        login_every_timewithcredentials("sd", "asd");

        By
                loginButton = By.xpath("//a[@href='https://my.rozetka.com.ua/ua/signin/']"),
                popup = By.xpath("//div[@class='popup-css popup-auth']");

        chrome.get("https://rozetka.com.ua/ua/");
        chrome.findElement(loginButton).click();
        assertTrue(chrome.findElement(popup).isDisplayed());

    }
}
