package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01_XpathTekrar {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Search(ara) “city bike”

         /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
        placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
        aria-label="Search Amazon" spellcheck="false">
        XPATH SYNTAX;
                    //tag_name[@attributeName='atributeDeğeri']
                    //input[@id='twotabsearchtextbox']

          */

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();


        //Hybrid Bikes bölümüne tıklayın ve görünür olup olmadığını,
        // erişilebilir olup olmadığını ve seçilebilir olup olmadığını konsolda gösteriniz
        WebElement hybridBke = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println(hybridBke.isDisplayed());//WE görüntüleniyormu ? -->Görüntülenebiliyor True
        System.out.println(hybridBke.isEnabled());//WE erişilebiliyormu ? --> Erişilebiliyor True
        System.out.println(hybridBke.isSelected());//WE seçilebiliyormu ? --> Seçilemiyor False
        hybridBke.click();


        //Sadece sonuc sayısını yazdıralım
        WebElement sonucSayisi = driver.findElement(By.xpath("//*[text()='17 results for']"));
        String [] sonuc =  sonucSayisi.getText().split(" ");
        System.out.println(sonuc[0]);

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

        //Sayfayı kapatınız
        driver.close();


    }

}
