package javascriptExecuter;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

    WebDriver driver;
    JavascriptExecutor js;

    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);

        js = (JavascriptExecutor) driver;
    }

    public void scrollDownPage() throws InterruptedException {

        // Scroll down 1000px
        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(2000);

        // Scroll to bottom
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
    }

    public void Refresh() throws InterruptedException {
        // Refresh page using JavaScript
        js.executeScript("history.go(0)");
        Thread.sleep(2000);
    }

    public void showAlert() throws InterruptedException {
        // Show Alert popup
        js.executeScript("alert('Hi')");
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws Exception {
        ScrollDown obj = new ScrollDown();
        obj.launch();
        obj.scrollDownPage();
        obj.Refresh();
        obj.showAlert();
        
        obj.driver.quit();
    }
}
