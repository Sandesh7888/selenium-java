package Object_Repo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

    WebDriver driver;

    // ✅ 1. Define web elements using @FindBy
    @FindBy(id = "ap_email")
    WebElement username;

    @FindBy(id = "ap_password")
    WebElement password;

    @FindBy(id = "signInSubmit")
    WebElement loginButton;

    // ✅ 2. Constructor to initialize PageFactory
    public POM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ✅ 3. Launch browser and open URL from properties file
    public void launch() throws InterruptedException, IOException {
        // Load properties file
        FileInputStream f = new FileInputStream("C:\\Users\\sande\\OneDrive\\Desktop\\selenium\\java\\propeties File\\configAll.properties");
        Properties prop = new Properties();
        prop.load(f);

        String url = prop.getProperty("url");
        String browser = prop.getProperty("browser");

        System.out.println("Browser: " + browser);
        System.out.println("URL: " + url);

        // Launch Chrome (you can add other browsers later)
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(2000);
    }

    // ✅ 4. Login action
    public void login(String user, String pass) {
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
    }

    // ✅ 5. Main method to execute
    public static void main(String[] args) throws InterruptedException, IOException {
        POM p = new POM(new ChromeDriver());
        p.launch();
        p.login("your_email@example.com", "your_password");
    }
}
