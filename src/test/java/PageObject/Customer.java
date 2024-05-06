package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Customer {
    WebDriver LOCALE_DRIVER;


    public Customer(WebDriver driver) {
        this.LOCALE_DRIVER = driver;
        PageFactory.initElements(driver, this);
    }


    // //div[contains(@class,'content-header') and h1[contains(text(),'Dashboard')] ]


    @FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
    WebElement CustomersMenu;

    @FindBy(xpath = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
    WebElement CustomersMenuItem;

    @FindBy(xpath = "//a[@href='/Admin/Customer/Create']")
    WebElement AddNewBtn;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement Email;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement Password;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement FirstName;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement LastName;

    @FindBy(xpath = "//input[@id='Gender_Male']")
    WebElement GenderMale;

    @FindBy(xpath = "//input[@id='Gender_Female']")
    WebElement GenderFemale;
    @FindBy(xpath = "//input[@id='DateOfBirth']")
    WebElement DOB;
    @FindBy(xpath = "//input[@id='Company']")
    WebElement Company;

    @FindBy(xpath = "//select[@id='SelectedCustomerRoleIds']")
    WebElement CustomerRolesItem;

    @FindBy(xpath = "//li[contains(text(),'Guests')]")
    WebElement ItemGuests;

    @FindBy(xpath = "//li[contains(text(),'Vendors')]")
    WebElement ItemVendor;

    @FindBy(xpath = "//li[contains(text(),'Registered')]")
    WebElement ItemRegistered;

    @FindBy(xpath = "//li[contains(text(),'Administrators')]")
    WebElement ItemAdministrators;

    @FindBy(xpath = "//li[contains(text(),'Forum Moderators')]")
    WebElement ItemForumModerators;

    @FindBy(xpath = "//select[@id='VendorId']")
    WebElement VendorManagerDrop;

    @FindBy(xpath = "//textarea[@id='AdminComment']")
    WebElement AdminComment;

    @FindBy(xpath = "//button[@name='save']")
    WebElement SaveBtn;

    @FindBy(xpath="//input[@id='Active' and @class='check-box']")
    WebElement Active;




    //methods to perform actions on the elements
    public String getTittle() {
        return LOCALE_DRIVER.getTitle();
    }

    public void clickOnCustomersMenu() {
        CustomersMenu.click();

    }

    public void clickOnCustomersMenuItem() {
        CustomersMenuItem.click();
    }

    public void clickOnAddNew() {
        AddNewBtn.click();
    }

     public void enterEmail(String email) {
        Email.sendKeys(email);

     }

     public void enderPassword(String password) {
        Password.sendKeys(password);
     }

     public void enterFirstName(String firstname) {
        FirstName.sendKeys(firstname);
     }

     public void enterLastName(String lastname) {
        LastName.sendKeys(lastname);
     }

     public void clickOnGenderMale() {
        GenderMale.click();
     }

     public void clickOnGenderFemale() {
        GenderFemale.click();
     }

     public void enterDOB(String dob) {
        DOB.sendKeys(dob);
     }

     public void enterCompany(String company) {
        Company.sendKeys(company);
     }

     public void selectVendorManager(String value) {
        Select drp = new Select(VendorManagerDrop);
        drp.selectByVisibleText(value);

     }

     public void setActive(){
        Active.click();
     }

     public void enterAdminComment(String admincomment) {
        AdminComment.sendKeys(admincomment);
     }

     public void clickOnSave(){
        SaveBtn.click();
     }

     public void selectCustomerRoles(String value) {
        Select drp = new Select(CustomerRolesItem);
        drp.selectByVisibleText(value);
     }




}
