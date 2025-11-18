package Object_Repo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicity {

    WebDriver driver;

    public void launch() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Updated implicit wait syntax
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");
    }

    public void Expli() {

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Example: wait for the search bar
        WebElement searchBox = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))
        );

        searchBox.sendKeys("Laptop");
    }

    public static void main(String[] args) {

        Explicity e = new Explicity();
        e.launch();
        e.Expli();
    }
}
