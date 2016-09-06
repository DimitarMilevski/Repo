package bestBuy;

import Common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 9/1/16.
 */
public class SignIn extends Base {
    @Test
    public void storeLocator() throws InterruptedException {
      //  navigateTo("http://www.bestbuy.com/");
        clickByCss(".close");
        sleepFor(2);
        waitUntilClickAble(By.cssSelector(".user.link-text"));
        clickByCss(".user.link-text");
        //clickByCss(".action-btn");
        typeByCss("#fld-e","Jawad@yahoo.com");
        typeByCss("#fld-p1","pass");
        clickByCss(".cia-form__submit-button.js-submit-button");
        sleepFor(2);
    }
}
