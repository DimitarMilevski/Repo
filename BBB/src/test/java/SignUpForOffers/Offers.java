package SignUpForOffers;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by Zaqc on 8/30/2016.
 */
public class Offers extends Base {

   // @Test
    public void Offers(){
        clickByXpath(".//*[@id='promoArea']/ul/li[2]/a");
        clickByCss("#txtSignupSpecialEmail");
        clickByCss("#Submit");


    }


}
