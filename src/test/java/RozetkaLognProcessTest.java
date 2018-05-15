import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;
import java.util.List;

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
        assertTrue(chrome.findElement(popup).isDisplayed()); // sf

        int columnPositionOfTopRow = 0; // this is
        WebElement table = chrome.findElement(loginButton);
        List<WebElement> tds = table.findElements(By.xpath("/tbody/tr[1]"));
        for (int i = 0; i <= tds.size(); i++) {
            if (tds.get(i).getText().equals("credit 25 mes")) {
                columnPositionOfTopRow = i;
                break;
            }
        }


    }

    @Test
    public void find_positions() {
        chrome.get("https://rozetka.com.ua/ua/credit/");
        List<WebElement> rows = chrome.findElements(
                By.xpath("//div[@class='rz-credit-block'][1]/table/tbody/tr[@class='rz-credit-terms-tr']")
        );

        assertEquals(10, rows.size());

        String lookingFor = "0,01% на 20 місяців";
        List<WebElement> foundedCols = null;
        for (int i = 0; i < rows.size(); i++) {
            WebElement row = rows.get(i);
            WebElement col1 = row.findElement(By.xpath("td[1]"));
            String text = col1.getText();
            if (lookingFor.equals(text)) {
                foundedCols = row.findElements(By.xpath("td"));
            }
        }
    }
}
