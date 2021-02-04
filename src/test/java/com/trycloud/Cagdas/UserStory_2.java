package com.trycloud.Cagdas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class UserStory_2 {

    WebDriver driver;

    @BeforeClass
    public void SetupClass() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://app.trycloud.net/index.php/login");
        driver.findElement(By.xpath("//input[@placeholder='Username or email']")).sendKeys("User70");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Userpass123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='submit']")).click();
    }

    @Test
    public void test() throws InterruptedException {
        WebElement files = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[1]/a"));
        Thread.sleep(1000);

        WebElement activity = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[2]/a"));
        Thread.sleep(1000);

        WebElement gallery = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[3]/a"));
        Thread.sleep(1000);

        WebElement talk = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[4]/a"));
        Thread.sleep(1000);

        WebElement calendar = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[5]/a"));
        Thread.sleep(1000);

        WebElement deck = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[6]/a"));
        Thread.sleep(1000);

        WebElement announcements = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[7]/a"));
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"expand\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"expanddiv\"]/ul/li[3]")).click(); // logging out



    }


    @AfterClass
    public void teardown(){
        driver.close();
    }

}

/*
2.Story: As a user, I should be access all the main modules of the app.
Test case #1 - verify users access to the main modules1.Login as a user 2.Verify the user see the following modules:

Files
Galleries
Activity
Talk
Contacts
Calendar
Note
 */