package com.seleniumExam.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChromeDo {
    private static WebDriver driver;
    private static WebDriverWait driverWait;

    public static void setUpChromeDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriverWait getDriverWait(){
        return driverWait;
    }

    public static void goTo(String url){
        driver.get(url);
    }
}
