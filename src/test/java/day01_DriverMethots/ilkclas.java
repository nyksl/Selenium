package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilkclas {

    public static void main(String[] args) {

       // System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");
    }
}
