package productsMenu;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by Zaqc on 8/31/2016.
 */
public class InProducts extends Base {
//    @Test
    public void InProducts() throws InterruptedException{
        clickByXpath(".//*[@id='collegeBridalArea']/div[1]/a");
        for(int i=1; i <14 ; i++){
            mouseHoverByXpath(".//*[@id='collegeBridalArea']/div[1]/div/ul/li[" + i +"]/a");
            sleepFor(5);
        }
    }
}
