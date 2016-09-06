package bestBuy;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 9/3/16.
 */
public class Freshdirect extends Base{
    @Test
    public void freshDirectTest() throws InterruptedException {
        navigateTo("www.freshdirect.com");
        clickByCss(".locabar-user-action");
        iframeHandle2(0);
        typeByCss("#email", "jnewaj");
        goBackToHomeWindow();
        sleepFor(5);



    }
}
