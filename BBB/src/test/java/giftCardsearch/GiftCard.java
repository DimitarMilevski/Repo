package giftCardsearch;

import Common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Zaqc on 8/26/2016.
 */
public class GiftCard  extends Base{
 //  @Test
    public void SearchForGiftCard(){
        clickByXpath(".//*[@id='globalSearchForm']/div[1]/a");
        clickByXpath(".//*[@id='globalSearchForm']/div[1]/ul/li[2]/span");
        typeByCss("#searchFormInput", "GiftCard");
        clickByCss(".searchFormButton");
        driver.navigate().to("https://bedbathandbeyond.cashstar.com/");
        driver.findElement(By.xpath(".//*[@id='message']")).sendKeys("Happy Birth Day");

    }
}
