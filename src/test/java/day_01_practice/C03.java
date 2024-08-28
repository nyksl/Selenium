package day_01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("ChromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));


        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");

        // ilk kutucuga 20 giriniz
        WebElement ilkKutucuk =  driver.findElement(By.id("number1"));
        ilkKutucuk.sendKeys("20");
        Thread.sleep(2000);

        // ikinci kutucuga 30 giriniz
        WebElement ikinciKutucuk = driver.findElement(By.id("number2"));
        ikinciKutucuk.sendKeys("30");
        Thread.sleep(2000);

        // calculate'e tıklayınız
        WebElement calculate = driver.findElement(By.id("calculate"));
        calculate.submit();
        calculate.click();// click() buda ENTER yapar

        // sonucu yazdırınız
        WebElement sonuc = driver.findElement(By.id("answer"));
        System.out.println("Toplama isleminin sonucu: "+ sonuc.getText());


        // sayfayi kapatiniz
        driver.close();
    }
}
