package sandesh.me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Sadbasics_Exp_11logintesting {

    WebDriver driver;
    WebDriverWait wait;

    public void Launch() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void Login(String un, String pass) {
        try {
            // Wait for username field to appear fresh on the page
            WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
            WebElement password = driver.findElement(By.id("password"));
            WebElement loginBtn = driver.findElement(By.id("Login"));

            // Clear old text if present
            username.clear();
            password.clear();

            // Enter new credentials
            username.sendKeys(un);
            password.sendKeys(pass);
            loginBtn.click();

            // Wait briefly to let page load or error message show
            Thread.sleep(2000);

            // Navigate back to login page for next test iteration
            driver.navigate().to("https://login.salesforce.com/");

        } catch (Exception e) {
            System.out.println("Error during login attempt: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Sadbasics_Exp_11logintesting s = new Sadbasics_Exp_11logintesting();
        s.Launch();

        // Multiple login attempts
        s.Login("sandesh@123", "123121sa31L");
        s.Login("das@123", "Lsaad");
        s.Login("sandesh123", "!@#$");
        s.Login("sandesh", "123121L");

        s.driver.quit();
    }
}
