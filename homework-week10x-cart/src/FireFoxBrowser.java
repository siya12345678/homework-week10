import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class FireFoxBrowser {
    public static void main(String[] args) {
        String baseUrl="https://www.x-cart.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximise window
        String getTitle= driver.getTitle();
        System.out.println(getTitle);
        driver . close();

    }
}
