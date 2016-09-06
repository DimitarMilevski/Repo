package addToCart;

import Common.Base;
import core.GiftCardWishes;
import core.ItemsToBeSearched;
import core.SearchItems;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Zaqc on 8/26/2016.
 */
public class giftCardAddToCart extends Base {

     @Test
    public void giftCAddToCart() throws InterruptedException, IOException{

        clickByXpath(".//*[@id='globalSearchForm']/div[1]/a");
        clickByXpath(".//*[@id='globalSearchForm']/div[1]/ul/li[2]/span");
        typeByCss("#searchFormInput", "GiftCard");
        clickByCss(".searchFormButton");
        driver.navigate().to("https://bedbathandbeyond.cashstar.com/");

        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
        GiftCardWishes wishes = new GiftCardWishes();

        driver.findElement(By.xpath(".//*[@id='message']")).sendKeys(wishes.getWish());
        clickByXpath(".//*[@id='img_DD48GRTP8']");
        clickByCss("#amount-250");
        typeByCss("#name", "Your Name");
        typeByCss("#email", "MyE-Mail@yahoo.com");
        typeByCss("#from_name", "My Name");
        Thread.sleep(30000);


    }

//    public void wishUsingExcelFile() throws IOException, InterruptedException {
//        //initialize Search page factory
//        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
//        //Read search.data from excel file
//        GiftCardWishes wishes = new GiftCardWishes();
//        String[] value = wishes.getWish();
//        for (String read : value) {
//            search.searchFor(read);
//            sleepFor(2);
//            search.clearSearchInput();
//        }
//
//    }

}
