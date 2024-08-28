package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C05 {

    public static void main(String[] args) {

        System.setProperty("ChromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();

        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().maximize();

        System.out.println("maximize pencere konumu: " + driver.manage().window().getPosition());
        //getPosition() pencere konumu

        System.out.println("maximize pencere olcusu: " +driver.manage().window().getSize());

        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().fullscreen();

        System.out.println("fullscreen pencere konumu: " + driver.manage().window().getPosition());

        System.out.println("fullscreen pencere olcusu: "+driver.manage().window().getSize());


        // sayfayi kapatiniz

    }
}
