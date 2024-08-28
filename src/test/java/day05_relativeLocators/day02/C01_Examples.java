package day05_relativeLocators.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01_Examples {
    /*
        Browser'ı açıp maximize yapın
        Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
        Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
        Amazon sayfasına geri dönün
        Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
        Sayfanın konumunu ve boyutunu yazdırın
        Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
        İstediğiniz şekilde olup olmadığını test edin
        Sayfayı kapatın
         */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

//         Browser'ı açıp maximize yapın
        driver.manage().window().maximize(); //maximize(); sayfa boyutunu büyütüp kücültmemizi saglar

//         Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//         Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
        driver.get("https://amazon.com");
        driver.get("https://facebook.com");
        driver.get("https://youtube.com");

//         Amazon sayfasına geri dönün
        driver.navigate().back();
        driver.navigate().back();

//         Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
        String actualUrl = driver.getCurrentUrl();//Asıl URL
        String expectedUrl = "https://www.amazon.com/";//Beklenen URL

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Url Testi PASSED");
        } else {
            System.out.println("Url Testi FAILED");
        }

//         Sayfanın konumunu ve boyutunu yazdırın
        System.out.println("Sayfa konumu : "+driver.manage().window().getPosition());//Sayfa konumu : (-8, -8)
        System.out.println("Sayfa konumu : "+driver.manage().window().getSize());//Sayfa konumu : (1552, 832)

//         Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
        driver.manage().window().setPosition(new Point(50,50));

//         İstediğiniz şekilde olup olmadığını test edin
        driver.manage().window().setSize(new Dimension(600,600)); //pixel boyutunu ayarlar

//         Sayfayı kapatın
        driver.close();



    }
}
