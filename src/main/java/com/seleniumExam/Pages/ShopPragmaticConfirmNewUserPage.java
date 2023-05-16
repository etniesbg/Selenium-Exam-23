package com.seleniumExam.Pages;

import com.seleniumExam.Utils.ChromeDo;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShopPragmaticConfirmNewUserPage {
    private static final By CONFIRM_USER_CREATION = new By.ByCssSelector("#common-success > * > #content > h1");

    public static String getConfirmationText(){
        ChromeDo.getDriverWait().until(ExpectedConditions.presenceOfElementLocated(CONFIRM_USER_CREATION));
        return ChromeDo.getDriver().findElement(CONFIRM_USER_CREATION).getText();
    }
}
