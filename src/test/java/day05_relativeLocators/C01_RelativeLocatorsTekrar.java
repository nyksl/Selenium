package day05_relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class C01_RelativeLocatorsTekrar {

    public static void main(String[] args) throws InterruptedException {

       /*
       Relative Locator:
         - Bir web sayfasında benzer özelliklere sahip webelementlerin olduğu durumlarda kullanılabilir
        -above -> Belirtilen elementin ustunde olan elementi secer
        -below -> Belirtilen elementin altinda olan elementi secer
        -to_left_of -> Belirtilen elementin solunda olan elementi secer
        -to_right_of -> Belirtilen elementin saginda olan elementi secer
        -near --> Belirtilen elementin yanında/yakınında olan elementi secer
       */

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //city bike aratalım
        WebElement aramakutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramakutusu.sendKeys("city bike");
        aramakutusu.submit();

        //Relative Locator kullanarak hybrid bike üstündeki webelemente tıklayalım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement roadBike = driver.findElement(with(By.tagName("a")).above(hybridBike));
        roadBike.click();





    }


}
