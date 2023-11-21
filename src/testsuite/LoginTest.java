package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    static String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //enter username
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        //enter password
        WebElement enterPassword = driver.findElement(By.id("password"));
        enterPassword.sendKeys("secret_sauce");
        //click on login
        WebElement clickLogin = driver.findElement(By.name("login-button"));
        clickLogin.click();
        //expected text
        String expectedText = "Products";
        //find actual is equal or not
        WebElement actualTextElement = driver.findElement(By.xpath("//span[@class='title']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //enter user name
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        //enter password
        WebElement enterPassword = driver.findElement(By.id("password"));
        enterPassword.sendKeys("secret_sauce");
        //click on login
        WebElement clickLogin = driver.findElement(By.name("login-button"));
        clickLogin.click();
        // Find six products link and verify with product
        // First product of Sauce Labs Backpack
        WebElement backPack = driver.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Backpack')]"));
        backPack.click();
        WebElement backButton = driver.findElement(By.id("back-to-products"));
        backButton.click();


        // Second product of Sauce Labs Bike Light
        WebElement bikeLight = driver.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Bike Light')]"));
        bikeLight.click();
        WebElement backButton1 = driver.findElement(By.id("back-to-products"));
        backButton1.click();

        // Third product is Sauce Labs Bolt T-Shirt
        WebElement boltTShirt = driver.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Bolt T-Shirt')]"));
        boltTShirt.click();
        WebElement backButton3 = driver.findElement(By.id("back-to-products"));
        backButton3.click();

        // Fourth product is Sauce Labs Fleece Jacket
        WebElement fleeceJacket = driver.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Fleece Jacket')]"));
        fleeceJacket.click();
        WebElement backButton4 = driver.findElement(By.id("back-to-products"));
        backButton4.click();

        // Fifth product is  Sauce Labs Onesie
        WebElement labsOnesie = driver.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Onesie')]"));
        labsOnesie.click();
        WebElement backButton5 = driver.findElement(By.id("back-to-products"));
        backButton5.click();

        // Six product Test.allTheThings() T-Shirt (Red)
        WebElement redTShirt = driver.findElement(By.xpath("//div[contains(text(), 'Test.allTheThings() T-Shirt (Red)')]"));
        redTShirt.click();
        WebElement backButton6 = driver.findElement(By.id("back-to-products"));
        backButton6.click();

    }

    @After
    public void tearDown() {
        //  driver.quit();
    }
}
