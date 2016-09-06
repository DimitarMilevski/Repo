package ebay;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 9/2/16.
 */
public class Register extends Base {
    @Test
    public void register() throws InterruptedException {
        clickByCss("#gh-ug>a");
        clickByCss(".ml51.tx");
        clickByCss(".gspr.radio-on");
        typeByCss("#email","j@yahoo.com");
        clickByCss("#sbtBtn");

        sleepFor(2);


    }
}
