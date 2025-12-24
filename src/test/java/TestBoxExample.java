import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBoxExample {

    //initialise
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() throws InterruptedException {
        //OPEN CHROME BROSWER
        driver = new ChromeDriver();
        //SIZE SCREEN SIZE
        driver.manage().window().maximize();
        //navigate to leaf ground
        driver.get("https://www.leafground.com/input.xhtml");
        Thread.sleep(3000);


    }

    @Test
    public void testboxtTest() {
        //01)Type your name......
        //driver danne class level udin dala thiyana nisa.driver kiyala dala element eka identify karaganna ona
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("dula");

        //02)Append Country to this City.
        WebElement appendText = driver.findElement(By.id("j_idt88:j_idt91"));
        appendText.sendKeys("Sri Lanka");

        //03)Verify if text box is disabled
        boolean enabled = driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
        System.out.println("Is text box enabled:" + enabled);
        //04)Clear the typed text.
//*[@id="j_idt88:j_idt95"]
        WebElement clearText = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
        clearText.clear();
        //05)Retrieve the typed text.

        WebElement textElement = driver.findElement(By.id("j_idt88:j_idt97"));
        String value = textElement.getAttribute("value");
        System.out.println(value);
        //06)Type email and Tab. Confirm control moved to next element.
        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("dula98sathsarani@gmail.com" + Keys.TAB + "control move to next Element");

        //07)Type about yourself
        //08)Text Editor
        //09)Just Press Enter and confirm error message*
        //10)Click and Confirm Label Position Changes
        //11)Type your name and choose the third option
        //12)Type your DOB (mm/dd/yyyy) and confirm date chosen
        //13)Type number and spin to confirm value changed
        //14)Type random number (1-100) and confirm slider moves correctly
        //15)Click and Confirm Keyboard appears
        //16)Custom Toolbar


    }
}
