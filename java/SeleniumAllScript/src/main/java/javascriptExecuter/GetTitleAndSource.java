package javascriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndSource {

    WebDriver driver;
    JavascriptExecutor js;

    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);

        js = (JavascriptExecutor) driver;
    }

    public void getTitleAndSource() {

        // 1. Normal Selenium Title
        String title1 = driver.getTitle();
        System.out.println("Selenium Title: " + title1);

        // 2. JavaScript Title
        String title2 = (String) js.executeScript("return document.title;");
        System.out.println("JS Title: " + title2);

        // 3. Page Source
        String source = driver.getPageSource();
        System.out.println("Page Source Length: " + source.length()); // better than printing full HTML
    }

    public static void main(String[] args) throws Exception {

        GetTitleAndSource obj = new GetTitleAndSource();
        obj.launch();
        obj.getTitleAndSource();
        obj.driver.quit();
    }
}
