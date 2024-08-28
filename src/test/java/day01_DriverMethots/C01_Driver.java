package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_Driver {
    static ChromeOptions options;

    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //System.setProperty Java uygulamalarında sistem özelliklerini ayarlamak icin kullanılır
        // Bu methodla class'ımıza web driver'in fiziki yerini belirtiriz
        //Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz.

        System.out.println(System.getProperty("chromeDriver"));
        //getProperty methodu ile"Key degerini girerek "value" ya ulasabiliriz.
        //WebDriver driver = new EdgeDriver();//Boş bir browser açar
        options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.get("https://amazon.com");

        driver.get("https://techproeducation.com"); ;//get() methodu ile adresini belittiğimiz sayfaya gideriz


        //get() methodu ile adresini belittiğimiz sayfaya gideriz
        System.out.println("Sayfa Başlığı = "+driver.getTitle()); // içinde bulunduğumuz sayfanın başlığını verir

        System.out.println("Sayfa Url'i = "+driver.getCurrentUrl()); //içinde bulunduğumuz sayfanın url'i verir

       // System.out.println(driver.getPageSource());//içinde bulunduğumuz sayfanın html kodlarını verir
    }
}
