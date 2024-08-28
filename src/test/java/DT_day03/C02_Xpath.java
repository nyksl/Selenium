package DT_day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {

        System.setProperty("ChromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//            https://www.amazon.com/ sayfasına gidin.
        driver.get("https://amazon.com");

        //        "city bike" araması yapın
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

//        "Under 200" olanı tıklayın
        WebElement we1 = driver.findElement(By.xpath("//span[.='Under $200']"));//attribute ismi yoksa nokta koy
        we1.click();

        driver.close();



    }
}
