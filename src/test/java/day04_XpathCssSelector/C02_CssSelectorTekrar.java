package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_CssSelectorTekrar {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
       WebElement addElement =  driver.findElement(By.cssSelector("button[onclick ='addElement()'"));
       addElement.click();
       Thread.sleep(2000);

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        System.out.println("Delete Button Görünür mü ? "+deleteButton.isDisplayed());



        //Delete tusuna basin
        deleteButton.click();
        Thread.sleep(2000);

        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemove = driver.findElement(By.cssSelector("h3"));
        System.out.println("Add/Remove Elements görünür mü ? "+addRemove.isDisplayed());

        //Sayfayı kapatın
        driver.close();
    }
}
