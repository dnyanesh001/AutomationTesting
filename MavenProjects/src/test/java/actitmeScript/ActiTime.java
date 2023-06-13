package actitmeScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTime {

    public static void main(String[] args) throws InterruptedException {
        // Set up the Chrome driver
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver();
        // Navigate to the login page
        driver.get("https://demo.actitime.com/login.do");

        // Find the username and password elements and enter the login credentials
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.name("pwd"));
        username.sendKeys("admin");
        password.sendKeys("manager");

        // Find the login button and click it
        WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
        loginButton.click();

        // Wait for the page to load
        Thread.sleep(5000);

        // Find the "Add New" button and click it
        WebElement addNewButton = driver.findElement(By.xpath("//div[text()='Add New']"));
        addNewButton.click();

        // Wait for the "Create New Task" form to appear
        Thread.sleep(5000);

        // Find the task name element and enter the task name
        WebElement taskName = driver.findElement(By.name("task[name]"));
        taskName.sendKeys("Test Task");

        // Find the "Create Task" button and click it
        WebElement createTaskButton = driver.findElement(By.xpath("//div[text()='Create Tasks']"));
        createTaskButton.click();

        // Close the browser
        driver.quit();
    }
}

