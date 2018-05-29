import com.sun.istack.internal.NotNull;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RozetkaLognProcessTest extends BaseTest {

    @FindBy(tagName = "a", id = "loginButton", className = "light")
    private WebElement buttonHelp;

    @Test
    public void test_annot() throws InterruptedException {

        PageFactory.initElements(chrome, this);

        buttonHelp = chrome.findElement(By.xpath(""));

        chrome.get("https://rozetka.com.ua/ua/");
        buttonHelp.click();

        Thread.sleep(10000);

    }

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
            WebElement col1 = rows.get(i).findElement(By.xpath("td[1]"));
            if (lookingFor.equals(col1.getText())) {
                foundedCols = rows.get(i).findElements(By.xpath("td"));
            }
        }

        assertEquals(
                "0,01",
                Helper.find("0,01% на 20 місяців", "Річна ставка, %")
        );

    }

    private List<WebElement> findDelayed(WebDriver webDriver, String loctor, int size) throws InterruptedException {
        List<WebElement> found = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            found = webDriver.findElements(By.xpath(loctor));
            if (found.size() == size) {
                return found;
            }
            Thread.sleep(100);
        }
        return found;
    }

    @Test
    public void test_wait() throws InterruptedException {
        chrome.get("https://rozetka.com.ua/ua/notebooks/c80004/filter/producer=dell;view=list/");
        String locator = "//div[@id='catalog_goods_block']/div/div[@class='g-i-list available']";
        String buttonCLick = "//a[@class='novisited g-i-more-link']";
        assertEquals(16, findDelayed(chrome, locator, 16).size());
        chrome.findElement(By.xpath(buttonCLick)).click();
        assertEquals(32, findDelayed(chrome, locator, 32).size());
        chrome.findElement(By.xpath(buttonCLick)).click();
        assertEquals(48, findDelayed(chrome, locator, 48).size());

    }
}
