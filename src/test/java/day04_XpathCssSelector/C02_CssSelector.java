package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_CssSelector {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        WebElement addElement = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElement.click();
        Thread.sleep(2000);

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[ onclick='deleteElement()']"));
        System.out.println("Delete Button Görünür mü? "+deleteButton.isDisplayed());

        //Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();

        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.cssSelector("h3"));

        //Eger xpath ile almak isterseni //h3
        System.out.println("AddRemove Elements görünür mü? "+addRemoveElement.isDisplayed());

        //Sayfayı kapatın
        driver.close();
        /*
         Xpath ve cssSelector arasındaki farklar:
           -Xpath metin ile calisabilir cssSelector calismaz
           -Xpath daha fazla kombinasyona sahiptir ve index'e göre arama yapabilir
           -CssSelector index'e göre arama yaamaz ancak daha hızlı calisir
        */

    }
}
