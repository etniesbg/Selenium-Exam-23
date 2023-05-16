import com.seleniumExam.Pages.ShopPragmaticConfirmNewUserPage;
import com.seleniumExam.Pages.ShopPragmaticMainPage;
import com.seleniumExam.Pages.ShopPragmaticRegisterAccountPage;
import com.seleniumExam.Utils.ChromeDo;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateUserTest {
    private static String firstName = RandomStringUtils.randomAlphabetic(3,10);
    private static String lastName = RandomStringUtils.randomAlphabetic(3,10);
    private static String emailAddress = RandomStringUtils.randomAlphabetic(3,10) + "@JordanApostolov.com";
    private static String telephoneNumber = RandomStringUtils.randomNumeric(10);
    private static String password = RandomStringUtils.randomAlphanumeric(10,20);
    private static String urlAddress = "https://shop.pragmatic.bg/";
    private static String verifier = "Your Account Has Been Created!";

    @BeforeTest
    public static void setupDriver(){
        ChromeDo.setUpChromeDriver();
        ChromeDo.goTo(urlAddress);
    }

    @AfterTest
    public static void tearDown(){
        ChromeDo.getDriver().quit();
    }

    @Test
    public static void createNewUserTest(){
        ShopPragmaticMainPage.clickMyAccountTop();
        ShopPragmaticMainPage.clickRegisterNewUser();
        ShopPragmaticRegisterAccountPage.setFirstLastNames(firstName,lastName);
        ShopPragmaticRegisterAccountPage.setEmail(emailAddress);
        ShopPragmaticRegisterAccountPage.setTelephone(telephoneNumber);
        ShopPragmaticRegisterAccountPage.setPassword(password);
        ShopPragmaticRegisterAccountPage.clickAgreeTermsAndConditions();
        ShopPragmaticRegisterAccountPage.clickContinueButton();
        String actual = ShopPragmaticConfirmNewUserPage.getConfirmationText();
        Assert.assertEquals(verifier,actual);
    }
}
