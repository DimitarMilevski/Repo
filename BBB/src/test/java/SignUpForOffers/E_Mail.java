package SignUpForOffers;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Created by Zaqc on 8/31/2016.
 */
public class E_Mail extends Base{


 //       @Test
        public void signUpForMail() throws InterruptedException{

            clickByXpath(".//*[@id='promoArea']/ul/li[2]/a");
            scrollPageDown();
           // sleepFor(20);
            WebElement element = driver.findElement(By.xpath(".//*[@id='content']/div[5]/div[1]/div[2]/div/a"));

            Actions actions = new Actions(driver);

            actions.moveToElement(element).sendKeys().perform();
            sleepFor(20);
            clickByXpath(".//*[@id='content']/div[5]/div[1]/div[2]/div/a");

//            typeByCss("#emailAddress", "myemail@yahoo.conm");
//            typeByCss(".container_12>div>table>tbody>tr>td>input", "08401");
//            clickByCss(".container_12>div>table>tbody>tr>td>div>input");
        }

}

