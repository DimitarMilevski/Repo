package DropdownBoxElements;

import Common.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Zaqc on 8/31/2016.
 */
public class Dropdown extends Base {

  //  @Test
    public void Dropdown() throws InterruptedException {

        clickByCss(".dropDownWrapper");
        sleepFor(5);
        for(int i=1; i<=12;i++){
            clickByXpath(".//*[@id='globalSearchForm']/div[1]/ul/li["+ i + "]/span");
            sleepFor(10);
            driver.navigate().back();
        }


    }
}
