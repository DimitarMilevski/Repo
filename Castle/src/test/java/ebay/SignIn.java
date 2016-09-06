package ebay;

import Common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 9/2/16.
 */
public class SignIn extends Base {
    @Test
    public void signIn() throws InterruptedException{
        clickByCss("#gh-ug>a");
        driver.findElement(By.cssSelector("#formDiv #pri_signin .fld")).sendKeys("s@yahoo.com");
        typeByCssNEnter("#formDiv #pri_signin .m19 .fld","password");

       // driver.findElement(By.cssSelector("#620626340")).sendKeys("j@yahoo.com");
        //typeByXpath(".//*[@id='1047708240']","s@yahoo.com");
        //driver.findElement(By.id("#1047798240")).sendKeys("j@yahoo.com");
        //typeByCss("#1047708240","s@yahoo.com");
        //typeByCss("#1000773053","password");
        //typeByXpath(".//*[@id='1000773053']","pass");
        //clickByCss("#csi");
        //clickByCss("#sgnBt");
        sleepFor(2);


    }

}
