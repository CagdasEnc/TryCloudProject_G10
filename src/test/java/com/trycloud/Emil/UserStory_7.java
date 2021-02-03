package com.trycloud.Emil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


    public class UserStory_7 {


        public static void main(String[] args) throws InterruptedException {


            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://app.trycloud.net/index.php/login");
            driver.manage().window().maximize();

            WebElement userNameInputField = driver.findElement(By.xpath("//input[@placeholder='Username or email']"));

            String user10 = "User10";
            userNameInputField.sendKeys(user10);

            WebElement passwordInputName = driver.findElement(By.xpath("//input[@id='password']"));

            String password = "Userpass123";
            passwordInputName.sendKeys(password);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@id='submit']")).click();
            Thread.sleep(3000);

            WebElement searchButton= driver.findElement(By.xpath("//input[@id='searchbox']"));
            searchButton.click();
            Thread.sleep(3000);
            searchButton.sendKeys("hardskill");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//a[contains(@href, 'hardskill')]")).click();

            String expected="hardskill";
            String actual=driver.getTitle();

            if(actual.contains(expected)){
                System.out.println("PASSED");

                driver.close();
            }
        }
    }


