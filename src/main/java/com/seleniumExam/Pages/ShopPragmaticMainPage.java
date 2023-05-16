package com.seleniumExam.Pages;

import com.seleniumExam.Utils.ChromeDo;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShopPragmaticMainPage {
    private static final By MY_ACCOUNT_TOP = new By.ByXPath("//div//a[@title= 'My Account']");
    private static final By REGISTER_NEW_USER = new By.ByXPath("//div//a[text()='Register']");

    public static void clickMyAccountTop(){
        ChromeDo.getDriver().findElement(MY_ACCOUNT_TOP).click();
    }

    public static void clickRegisterNewUser(){
        ChromeDo.getDriverWait().until(ExpectedConditions.visibilityOf(ChromeDo.getDriver().findElement(REGISTER_NEW_USER)));
        ChromeDo.getDriver().findElement(REGISTER_NEW_USER).click();

    }

}
