package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chormeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //NOT: Sayfadaki her bir web element icin maximum 20 saniye ekler

        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify-dogrulamak),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://youtube.com");
        String actulTitle = driver.getTitle();// Gercek baslik
        String expectedTitle = "youtube";//Beklenen Baslık
        if (actulTitle.equals(expectedTitle)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED Gercek Baslik : "+ actulTitle);
        }
        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String beklenenKelime = "youtube";
        if (actualUrl.contains(beklenenKelime)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED Gerçek Url : "+actualUrl);
        }
        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://amazon.com");
        //Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);
        //Sayfayi yenileyin
        driver.navigate().refresh();
        //Amazon sayfasina donun
        driver.navigate().forward();
        //Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa  doğru başlığı(Actual Title) yazdırın.
        driver.get("https://amazon.com");
        String actuallTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if (actuallTitle.contains(istenenKelime)){
            System.out.println("TAST PASSED ");
        }else{
            System.out.println("TEST FAILED Gerçek Başlık : "+actuallTitle);
        }
        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String gercekUrl = driver.getCurrentUrl();
        String istenenUrl = "https://www.amazon.com/";
        if (gercekUrl.equals(istenenUrl)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Url = "+gercekUrl);

        //Sayfayi kapatin
        driver.close();


    }

}
