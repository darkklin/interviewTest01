package utility;

import WorkFlow.WorkFlowPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.WatchDemoPage;

import java.util.concurrent.TimeUnit;

public class CommontOps {


    static protected WebDriver driver;
    static protected HomePage homePage;
    static protected WorkFlowPage workFlowPage;
    static protected WatchDemoPage watchDemoPage;

    @BeforeClass
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = PageFactory.initElements(driver, pageobject.HomePage.class);
        watchDemoPage = PageFactory.initElements(driver, pageobject.WatchDemoPage.class);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://cb4.com/");
    }


    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }

}
