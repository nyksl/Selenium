package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_ManageMethodsTekrar {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chormeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://youtube.com");
        String actualTitle = driver.getTitle();//Gerçek başlık
        String expectedTitle = "youtube"; //Beklenen başlık (YouTube şeklinde yazılmalmadığı için TEST FAILD)
        if (actualTitle.equals(expectedTitle)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED Gerçek başlık: "+actualTitle);
        }
        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();//Gerçek URL
        String beklenenKelime = "youtube";
        if (actualUrl.contains(beklenenKelime)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILD Gerçek Url = "+actualUrl);
        }
        //Daha sonra Amazon sayfasina gidin https://www.amazon.com
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        //Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Amazon sayfasina donun
        driver.navigate().forward();

        //Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();

        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Amazon";
        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILD Gerçek başlık = "+actualTitle2);
        }

        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        String gercekUrl = driver.getCurrentUrl();
        String istenenUrl = "https://www.amazon.com/";
        if (gercekUrl.equals(istenenUrl)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILD Gerçek Url = "+gercekUrl);
        }
        //URL'yi yazdırın

        //Sayfayi kapatin
        driver.close();
    }
}
