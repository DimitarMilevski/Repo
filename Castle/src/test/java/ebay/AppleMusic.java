package ebay;

import Common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 9/2/16.
 */
public class AppleMusic extends Base {
    @Test
    public void test() throws InterruptedException {
        clickByCss("#pd-overlay");
       // clickByCss("html>body>center>a>img");
       // waitUntilClickAble(By.cssSelector("#pd-close"));
        waitUntilVisible(By.cssSelector("#pd-close"));
        clickByCss("#pd-close");
        sleepFor(2);
    }

}
