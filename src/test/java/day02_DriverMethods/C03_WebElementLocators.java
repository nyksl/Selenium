package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C03_WebElementLocators {

    public static void main(String[] args) {
        System.setProperty("ChromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        //Search box bölümünü locate ediniz ve amazonda Iphone aratınız
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //submit yapmak yerine sendKey("iphone", Keys.ENTER); olarak kullanabiliriz

        //NOT: Bir web elementi birden fazla kullanılacaksa bir webelement'e atama yapılabilir
        //WebElement searchBox =  driver.findElement(By.id("twotabsearchtextbox"));
        //searchBox.submit(); // Enter yapnak icin submit() kullanılabilir



        //searchBox.sendKeys("iphone"); //Locate ettiginiz search ettiginiz "iphone" metnini gönderir







    }
}
