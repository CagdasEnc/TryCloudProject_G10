package com.trycloud.Siddeeqah;

import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserStory1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa.trycloud.net/index.php/login?clear=1");

        WebElement userNameBlock = driver.findElement(By.xpath("//input[@id='user']"));
        WebElement passwordBlock = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginBlock = driver.findElement(By.xpath("//input[@id='submit-form']"));
        userNameBlock.sendKeys("User10");
        passwordBlock.sendKeys("Userpass123");
        loginBlock.click();
        //figure out verification

        userNameBlock.sendKeys("FakeName");
        passwordBlock.sendKeys("FakePassword");
        loginBlock.click();





    }
}
