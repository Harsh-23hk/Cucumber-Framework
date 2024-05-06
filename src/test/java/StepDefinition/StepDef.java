package StepDefinition;

import PageObject.Customer;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class StepDef {
    public WebDriver driver;
    public LoginPage loginPage;
    public Customer customer;
    public WebDriverWait wait;


    @Given("User Launch Chrome Browser")
    public void user_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        customer = new Customer(driver);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @When("User open URL {string}")
    public void user_open_url(String url) {
        driver.navigate().to(url);


    }

    @When("User enter Email as {string} and Password as {string}")
    public void user_enter_email_as_and_password_as(String emailadd, String paswd) {

        loginPage.enterEmail(emailadd);
        loginPage.enterPassword(paswd);

    }

    @When("Click Login button")
    public void click_login_button() {
        loginPage.clickLoginBtn();


    }

    @Then("Page Tittle should be {string}")
    public void page_tittle_should_be(String expectedtitle) {
        String actualtitle = driver.getTitle();
        if (actualtitle.equals(expectedtitle)) {
            Assert.assertTrue(true);
        } else
            Assert.fail("Title does not match");


    }

    @When("User click on Logout Link")
    public void user_click_on_logout_link() {

        loginPage.clickLogoutBtn();

    }

    @Then("close browser")
    public void close_browser() {
        driver.close();
        driver.quit();

    }


    ////////////////////////////Add New Customer///////////////////////////////////
    @Then("User can view Dashboard")
    public void user_can_view_dashboard() {
        String actualtitle = customer.getTittle();
        String expectedtitle = "Dashboard / nopCommerce administration";
        if (actualtitle.equals(expectedtitle)) {
            Assert.assertTrue(true);

        } else
            Assert.fail("Title does not match");

    }

    @When("User Click on the Customers Menu")
    public void user_click_on_the_customers_menu() {
        customer.clickOnCustomersMenu();
    }

    @When("Click on the Customers Item")
    public void click_on_the_customers_item() {
        customer.clickOnCustomersMenuItem();

    }

    @When("Click on the Add new button")
    public void click_on_the_add_new_button() {
        customer.clickOnAddNew();

    }

    @Then("User can view the Add new customer page")
    public void user_can_view_the_add_new_customer_page() {
        String actualtitle = customer.getTittle();
        String expectedtitle = "Add a new customer / nopCommerce administration";
        if (actualtitle.equals(expectedtitle)) {
            Assert.assertTrue(true);
        } else
            Assert.fail("Title does not match");
    }

    @When("User enter customer info")
    public void user_enter_customer_info() {
        customer.enterFirstName("Harsh");
        customer.enterLastName("Jain");
        customer.enterEmail("aase@example.com");
        customer.enderPassword("harsh@123");
        customer.clickOnGenderMale();
        customer.enterDOB("7/05/1990");
        customer.enterCompany("Test");
        customer.setActive();
        customer.enterAdminComment("This is for testing purpose");
        customer.selectVendorManager("Vendor 1");
        customer.selectCustomerRoles("Registered");

    }

    @When("Click on the save button")
    public void click_on_the_save_button() {
        customer.clickOnSave();

    }

    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String exptectedConfirmationMsg) {

        String bodyTagText = driver.findElement(By.tagName("Body")).getText();
        if (bodyTagText.contains(exptectedConfirmationMsg)) {
            Assert.assertTrue(true);//pass


        } else {

            Assert.assertTrue(false);//fail

        }

    }

}



