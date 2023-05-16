package com.seleniumExam.Pages;

import com.seleniumExam.Utils.ChromeDo;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShopPragmaticRegisterAccountPage {
    private static final By FIRST_NAME_INPUT = new By.ById("input-firstname");
    private static final By LAST_NAME_INPUT = new By.ById("input-lastname");
    private static final By EMAIL_INPUT = new By.ById("input-email");
    private static final By TELEPHONE_INPUT = new By.ById("input-telephone");
    private static final By PASSWORD_INPUT = new By.ById("input-password");
    private static final By CONFIRM_PASSWORD_INPUT = new By.ById("input-confirm");
    private static final By CHECKBOX_AGREE_TERMS = new By.ByXPath("//*[@type='checkbox']");
    private static final By CONTINUE_BUTTON = new By.ByCssSelector(".btn-primary");

    public static void setFirstLastNames(String firstName, String lastName){
        ChromeDo.getDriverWait().until(ExpectedConditions.visibilityOf(ChromeDo.getDriver().findElement(FIRST_NAME_INPUT)));
        ChromeDo.getDriver().findElement(FIRST_NAME_INPUT).clear();
        ChromeDo.getDriver().findElement(FIRST_NAME_INPUT).sendKeys(firstName);
        ChromeDo.getDriver().findElement(LAST_NAME_INPUT).clear();
        ChromeDo.getDriver().findElement(LAST_NAME_INPUT).sendKeys(lastName);
    }

    public static void setEmail(String email){
        ChromeDo.getDriver().findElement(EMAIL_INPUT).clear();
        ChromeDo.getDriver().findElement(EMAIL_INPUT).sendKeys(email);
    }

    public static void setTelephone(String telephone){
        ChromeDo.getDriver().findElement(TELEPHONE_INPUT).clear();
        ChromeDo.getDriver().findElement(TELEPHONE_INPUT).sendKeys(telephone);
    }

    public static void setPassword(String password){
        ChromeDo.getDriver().findElement(PASSWORD_INPUT).clear();
        ChromeDo.getDriver().findElement(PASSWORD_INPUT).sendKeys(password);
        ChromeDo.getDriver().findElement(CONFIRM_PASSWORD_INPUT).clear();
        ChromeDo.getDriver().findElement(CONFIRM_PASSWORD_INPUT).sendKeys(password);
    }

    public static void clickAgreeTermsAndConditions(){
        ChromeDo.getDriver().findElement(CHECKBOX_AGREE_TERMS).click();
    }
    public static void clickContinueButton(){
        ChromeDo.getDriverWait().until(ExpectedConditions.elementToBeClickable(CONTINUE_BUTTON));
        ChromeDo.getDriver().findElement(CONTINUE_BUTTON).click();
    }
}
