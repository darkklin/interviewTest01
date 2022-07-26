package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WatchDemoPage {

    @FindBy(css = "input[id*='form-field']")
    public List<WebElement> fields_form;

    @FindBy(css = "input[id*='form-field-firstname']")
    public WebElement field_firstName;

    @FindBy(css = "input[id*='form-field-lastname']")
    public WebElement field_lastName;


    @FindBy(css = "input[id*='form-field-email']\n")
    public WebElement field_email;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div/div/section/div/div/div[1]/div/div[2]/section[4]/div/div/div/div/div/div[3]/div/form/div/div[5]/button")
    public WebElement button_watchNow;

    //button[@class=\"elementor-button elementor-size-sm\"])[1] << That's how I had to identify the element :(


}
