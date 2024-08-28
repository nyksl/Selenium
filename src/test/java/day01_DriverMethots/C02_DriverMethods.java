package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //System.setProperty("edgeDriver","src/resources/drivers/msedgedriver.exe");
       // WebDriver driver = new EdgeDriver();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.get("https://www.amazon.com");


        //Sayfa baslıgını konsola yazdırın
        System.out.println("Sayfa baslıgı : " +driver.getTitle());

        //Sayfa Url'i yazdırın
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());

        //Sonra techproeducation sayfasına gidiniz
        driver.get("https://techproeducation.com");

        //techproeducation'in sayfa baslıgı ve Url'ini yazdırınız
        System.out.println("Sayfa baslıgı : " +driver.getTitle());
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());

        //Sayfanın windowHandle değerini yazdırınız
        System.out.println(driver.getWindowHandle());

    }
}
