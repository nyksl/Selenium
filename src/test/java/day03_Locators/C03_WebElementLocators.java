package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C03_WebElementLocators {
    public static void main(String[] args) {


        System.setProperty("ChromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://amazon.com");

        //Search(ara) “city bike”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> soncYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println("Sonuc Yazisi : "+soncYazisi.get(0).getText());

        //Sadece sonuc sayisini yazdiralim
        String [] sonucSayisi = soncYazisi.get(0).getText().split(" ");//Sonuc yazisini boşluklardan böldüm
        System.out.println("Sonuc Sayisi = "+sonucSayisi[2]);

        //2.Yol
        //String sonucSayisi = soncYazisi.get(0).getText().split(" ")[2];//Sonuc yazisini boşluklardan böldüm
        //System.out.println("Sonuc Sayisi = "+sonucSayisi);

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> sonuclar = driver.findElements(By.className("s-image"));
        sonuclar.get(0).click();




    }
}
