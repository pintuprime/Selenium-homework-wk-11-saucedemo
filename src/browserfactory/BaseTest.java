package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
/*
Project-4 - ProjectName : com-saucedemo-sw-2
BaseUrl = https://www.saucedemo.com/
1. Create the package ‘browserfactory’ and create the
class with the name ‘BaseTest’ inside the
‘browserfactory’ package. And write the browser setup
code inside the class ‘Base Test’.
2. Create the package ‘testsuite’ and create the
following class inside the ‘testsuite’ package.
1. LoginTest
3. Write down the following test into ‘LoginTest’ class
1. userSholdLoginSuccessfullyWithValid Credentials
* Enter “standard_user” username
* Enter “secret_sauce” password
* Click on ‘LOGIN’ button
* Verify the text “PRODUCTS”
2. verifyThatSixProductsAreDisplayedOnPage
* Enter “standard_user” username
* Enter “secret_sauce” password
* Click on ‘LOGIN’ button
* Verify that six products are displayed on
page

 */

public class BaseTest {
    static String browser = "Chrome";

    public static WebDriver driver;//reference variable

    public void openBrowser(String baseUrl){
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong browser name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void closeBrowser(){
        driver.quit();
    }
}
