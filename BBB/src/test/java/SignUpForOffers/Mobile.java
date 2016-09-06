package SignUpForOffers;

import Common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Zaqc on 8/31/2016.
 */
public class Mobile extends Base {

 //       @Test
        public void signUpForMail(){
            clickByXpath(".//*[@id='promoArea']/ul/li[2]/a");
            clickByXpath(".//*[@id='content']/div[5]/div[2]/div[2]/div/a");

            String url = getCurrentPageUrl();
            System.out.println(url);
 //           typeByName("mobile1", "123");
//           typeByXpath(".//*[@id='headerWrapper']/div[4]/div/table/tbody/tr[3]/td[2]/input[1]", "123");
//            typeByXpath(".//*[@id='headerWrapper']/div[4]/div/table/tbody/tr[3]/td[2]/input[2]", "456");
//            typeByXpath(".//*[@id='headerWrapper']/div[4]/div/table/tbody/tr[3]/td[2]/input[3]", "7890");

        }
        public void typeByName(String locator, String value){
            driver.findElement(By.name(locator)).sendKeys(value);
        }

}
