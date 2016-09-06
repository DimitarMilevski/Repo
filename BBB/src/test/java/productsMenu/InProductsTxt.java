package productsMenu;

import Common.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zaqc on 8/31/2016.
 */
public class InProductsTxt extends Base  {
//    @Test
    public void getProductsTxt() throws InterruptedException {
        clickByXpath(".//*[@id='collegeBridalArea']/div[1]/a");
        List<String> list = new ArrayList<String>(14);
        for (int i = 0; i < list.size(); i++) {
            list = getTextFromWebElementsByXpath(".//*[@id='collegeBridalArea']/div[1]/div/ul/li[" + i + "]/a");
        }
            for(String el: list)
            System.out.print(list);



   }
}
