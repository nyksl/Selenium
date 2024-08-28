package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04 {

    public static void main(String[] args) {

        System.setProperty("ChromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();

        // https://www.amazon.com/ adresine gidin
        driver.get(" https://www.amazon.com");

        // Kaynak Kodlarini konsola yazdiriniz
        String sayfaKaynakKodlari = driver.getPageSource();
        System.out.println(sayfaKaynakKodlari);

        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        if (sayfaKaynakKodlari.contains("Gateway")){
            System.out.println("Kaynak Kodlarinda Gateway Yazıyor");
        }else
            System.out.println("Kaynak Kodlarinda Gateway Yazmıyor");

        // sayfayi kapatiniz
        driver.close();
    }
}
