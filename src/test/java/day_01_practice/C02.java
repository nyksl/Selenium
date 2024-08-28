package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("ChromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));


        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();
        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        Thread.sleep(2000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
       String teknosaTitle = driver.getTitle();
        System.out.println("teknosaTitle: " + teknosaTitle);

       String teknosaURL = driver.getCurrentUrl();
        System.out.println("teknosaURL: "+ teknosaURL);


        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (teknosaTitle.contains("Teknoloji")){
            System.out.println("Tittle:" + "Teknoloji iceriyor ");
        }else {

            System.out.println("Title: "+ " Tittle Teknoloji icermiyor");
        }
        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (teknosaURL.contains("teknosa")){
            System.out.println("URL: "+ " Teknosa iceriyor");
        }else{

                System.out.println("URL: "+ " Teknosa icermiyor");

        }


        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com");
        Thread.sleep(2000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String medunnaTittle =  driver.getTitle();
        System.out.println("medunnaTittle: "+ medunnaTittle);

        String medunnaUrl = driver.getCurrentUrl();
        System.out.println("medunnaUrl: "+ medunnaUrl);

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (medunnaTittle.contains("MEDUNNA")){
            System.out.println("Tittle: "+ " MEDUNNA iceriyor");
        }else{
            System.out.println("Tittle: "+ " MEDUNNA icermiyor");
        }
        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if (medunnaUrl.contains("medunna")){
            System.out.println("URL: "+ " medunna iceriyor");
        }else {
            System.out.println("URL: "+ " medunna icermiyor");
        }
        // teknosa adresine geri donunuz
            driver.navigate().back();
        Thread.sleep(2000);

        // Sayfayı yenileyiniz
            driver.navigate().refresh();

        // medunna adresine ilerleyiniz
            driver.navigate().forward();
            Thread.sleep(2000);
        // Sayfayı yenileyiniz
            driver.navigate().refresh();

        // pencereyi kapat
            driver.close();

    }
}
