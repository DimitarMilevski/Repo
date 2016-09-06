package bestBuy;

import Common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 9/1/16.
 */
public class Products extends Base {
    @Test
    public void list() throws InterruptedException {
        clickByCss(".close");
        sleepFor(2);
       // mouseHoverByCSS("#menu0");

        clickByCss("#menu0");
        waitUntilVisible(By.xpath(".//*[@id='group0']/ul/li[1]/a"));
        //clickByCss(".js-navitem taphover[data-lid='ubr_app']");
        clickByXpath(".//*[@id='group0']/ul/li[1]/a");
        //clickByXpath(".//*[@id='level2Group15']/div[1]/div[1]/div[1]/ul/li[1]/a");

        sleepFor(2);

        //waitUntilClickAble(By.cssSelector("#menu0"));
        //waitUntilClickAble(By.cssSelector("#level2Menu7>a"));


    }

    @Test
    public void test2() throws InterruptedException {
        list();

    }

}

//data-lid = ubr_app