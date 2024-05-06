package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver LOCALE_DRIVER;

    public LoginPage(WebDriver driver) {
        this.LOCALE_DRIVER = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    WebElement Email;

    @FindBy(id = "Password")
    WebElement Password;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement LoginBtn;


    @FindBy(xpath = "//a[@href='/logout']")
    WebElement Logout;



    public void enterEmail(String email) {
        Email.clear();
        Email.sendKeys(email);

    }

    public void enterPassword(String password) {
        Password.clear();
        Password.sendKeys(password);

    }

    public void clickLoginBtn() {
        LoginBtn.click();
    }


    public void clickLogoutBtn() {;
        Logout.click();
    }

}
