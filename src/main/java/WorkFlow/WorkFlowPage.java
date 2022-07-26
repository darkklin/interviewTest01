package WorkFlow;

import org.testng.Assert;
import utility.CommontOps;

public class WorkFlowPage extends CommontOps {


    public static void openTestPage() {
        homePage.link_watchDemo.get(1).click();
    }

    public static void fillFormAndClick(String firstName, String lastName, String email) {
        watchDemoPage.field_firstName.sendKeys(firstName);
        watchDemoPage.field_lastName.sendKeys(lastName);
        watchDemoPage.field_email.sendKeys(email);
        watchDemoPage.button_watchNow.click();

    }

    public static void checkifFormStillExist() {

        if (watchDemoPage.field_email.isDisplayed()) {

            System.out.println("works fine ");
        } else {
            Assert.fail();
        }

    }


}
