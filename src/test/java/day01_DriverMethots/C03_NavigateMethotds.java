package day01_DriverMethots;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class C03_NavigateMethotds {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //System.setProperty("edgeDriver","src/resources/drivers/msedgedriver.exe");
       // WebDriver driver = new EdgeDriver();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        //amazon sayfasına gidelim
        driver.get("https://amazon.com");
        Thread.sleep(3000);//Java kodlarını bekletmek icin kullanılır(3 saniye bekletir)

        //Sonra techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com"); //get methodu le aynı calısır
        Thread.sleep(3000);

        //techpro sayfa baslıgını konsola yazdıralım
        System.out.println("Sayfa baslıgı : "+driver.getTitle());

        //tekrar amazon sayfasına geri dönelim
        driver.navigate().back();//ilk sayfaya döner
        Thread.sleep(3000);

        //Amazon sayfasının baslıgını yazdıralım
        System.out.println("Sayfa baslıgı :"+driver.getTitle());

        //tekrar techpro sayfasına geri gidelim
        driver.navigate().forward();

        //son olorak sayfayı yenileyelim ve sayfayı kapatalım
        driver.navigate().refresh();
        driver.close();
        //NOT : Sayfalar arası gecisler hızlı olacagaından 3 saniye gecisler icin bekletelim


    }
}
