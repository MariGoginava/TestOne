import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTestOne {
    @Test
    public void openLink() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" http://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Forgot Password")).click();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Example@gmail.com");
        driver.findElement(By.id("form_submit")).click();
        driver.quit();
    }
}
