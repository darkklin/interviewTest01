package Sanity;

import WorkFlow.WorkFlowPage;
import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utility.CommontOps;

import java.util.concurrent.TimeUnit;


public class TestsSB4 extends CommontOps {


    @Test
    public void test01_goToWatchNowPage(){
        workFlowPage.openTestPage();
    }

    @Test
    public void test02_fillForm(){
        workFlowPage.fillFormAndClick("test","test2","dsjhdgsadgasdasdas.com");
        workFlowPage.checkifFormStillExist();
    }



}
