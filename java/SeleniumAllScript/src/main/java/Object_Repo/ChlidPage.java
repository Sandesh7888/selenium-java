package Object_Repo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChlidPage {

    WebDriver driver;

    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Example website that opens a new tab/window
        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(2000);
    }

    public void handleChildPages() throws InterruptedException {
        // Store the current (parent) window handle
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window ID: " + parentWindow);

        // Click buttons that open new tabs or windows
        driver.findElement(By.id("tabButton")).click();       // opens a new tab
        driver.findElement(By.id("windowButton")).click();    // opens a new window
        Thread.sleep(2000);

        // Get all open window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Loop through all windows
        for (String handle : allWindows) {
            if (!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);
                System.out.println("Switched to Child Window: " + handle);
                System.out.println("Child Title: " + driver.getTitle());

                // Close child window
                driver.close();
            }
        }

        // Switch back to the main window
        driver.switchTo().window(parentWindow);
        System.out.println("Switched back to Parent Window");

        Thread.sleep(2000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        ChlidPage cp = new ChlidPage();
        cp.launch();
        cp.handleChildPages();
    }
}
