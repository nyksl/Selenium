package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_DriverMethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        System.out.println("Sayfa konumu : "+driver.manage().window().getPosition());//getPosition() Browser’in koordinatlarini verir
        //manage()--> yonet neyi window()'u
        System.out.println("Sayfa Boyutları : "+driver.manage().window().getSize());
        driver.manage().window().maximize(); //açılan browser'i maximize yapar. Browser’i maximize yapar

        driver.get("https://techproeducation.com");
        System.out.println("Sayfa konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları : "+driver.manage().window().getSize());
        driver.manage().window().minimize();//Sayfayı aşagıya indirir. Browser’i minimize yapar
        Thread.sleep(3000); //Sayfa'yı 3 sn bekletir
        driver.manage().window().fullscreen(); //Browser’i full screen yapar
        Thread.sleep(3000);
        System.out.println("Sayfa konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları : "+driver.manage().window().getSize());
        driver.manage().window().setPosition(new Point(500,50));//istedigimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//new Dimension() yukseklik ve genislik
        Thread.sleep(3000);
        driver.close(); //Sayfayı kapatır

    }
}
