package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.CommontOps;

import java.util.List;

public class HomePage extends CommontOps {

    @FindBy(css = "a[class*='elementor-button-link elementor-button elementor-size-xs']>span")
    public List<WebElement> link_watchDemo;




}
