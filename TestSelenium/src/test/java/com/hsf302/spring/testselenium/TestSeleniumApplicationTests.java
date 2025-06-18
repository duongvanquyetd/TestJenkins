package com.hsf302.spring.testselenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TestSeleniumApplicationTests {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void TestLoginPageSussesfully() throws InterruptedException {

        driver.get("http://localhost:5173/user/login");


        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("loginButton"));
        username.sendKeys("test");
        password.sendKeys("test");

        Thread.sleep(2000);
        login.click();

        assertTrue(driver.getCurrentUrl().contains("/dashboard"));
        Thread.sleep(2000);

    }

    @Test
    public void TestLoginPageFail() throws InterruptedException {

        driver.get("http://localhost:5173/user/login");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("loginButton"));
        username.sendKeys("teast");
        password.sendKeys("test");

        Thread.sleep(2000);
        login.click();

        assertTrue(driver.getCurrentUrl().contains("/dashboard"));
        Thread.sleep(2000);

    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
