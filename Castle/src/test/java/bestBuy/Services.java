package bestBuy;

import Common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 9/1/16.
 */
public class Services extends Base {
    @Test
    public void test() throws InterruptedException {




        clickByCss(".close");
        sleepFor(2);
        clickByCss("#menu3");
        waitUntilClickAble(By.xpath(".//*[@id='group3']/div[1]/div[1]/div[2]/ul/li[10]/a"));
        clickByXpath(".//*[@id='group3']/div[1]/div[1]/div[2]/ul/li[10]/a");
        //clickByCss(".heavy");
        sleepFor(2);
    }
}
