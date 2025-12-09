import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogleTest {

    @Test


    public void googleTest() {

        //driver kiyanne object ekak.webdriver eke thiyana onama interface ekak driver kiyana object walin method acces karagatha haki
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("colombo" + Keys.ENTER);


        // driver.quit();
    }
}
