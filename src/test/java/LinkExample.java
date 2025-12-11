import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LinkExample {
    WebDriver driver;

    //meka nikan wenne na eee nisa annotation danna ona
    @BeforeMethod
    public void openLinkTestPage() {

        //SO WE WANT TO OPEN BROWSER
        //test annotation ekata kalin wena nisai mema damme
        driver = new ChromeDriver();
        //open unu browser eka loku karanna screen size
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml");
    }

    @Test
    public void LinkTests() {
        //......Take me to dashboard
        WebElement homeLink = driver.findElement(By.linkText("Go to Dashboard"));
        homeLink.click();
        //to back
        driver.navigate().back();
        //......Find my destination
        WebElement wheretoGo = driver.findElement(By.partialLinkText("Find the URL without clicking me."));
        //webELEMENT EKE STORE KARAGANNAWA ITHIRI TIKA
        String path = wheretoGo.getAttribute("href");
        System.out.println("This link is going to :" + path);
        // ........Am I broken link?
        WebElement brokenlink = driver.findElement(By.linkText("Broken?"));
        brokenlink.click();
        String title = driver.getTitle();
        if (title.contains("404")) {
            System.out.println("This link is broken");
        } else {
            System.out.println("Not broken");

        }
        //WANT to back
        driver.navigate().back();

        //...........................Duplicate Link
        //api hoyagena neh thiyenne link eka dashboadr eke store karala already find karala thiyagattu
        WebElement homeLink1 = driver.findElement(By.linkText("Go to Dashboard"));
        homeLink1.click();
        driver.navigate().back();
        //Count Links

        List<WebElement> countFullPageLinks = driver.findElements(By.tagName("a"));
        int pageLinkCount = countFullPageLinks.size();
        System.out.println("count of page links:" + pageLinkCount);

        //........Count Layout Links(only section)
        WebElement layoutElement = driver.findElement(By.className("layout-main-content"));
        List<WebElement> countOfLayoutLinks = layoutElement.findElements(By.tagName("a"));
        System.out.println("Count of layout links" + countOfLayoutLinks.size());
    }


}

