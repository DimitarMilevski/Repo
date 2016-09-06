package productsMenu;

import Common.Base;

/**
 * Created by Zaqc on 8/31/2016.
 */
public class Products extends Base {
   // @Test
    public void Products() throws InterruptedException{
        mouseHoverByXpath(".//*[@id='collegeBridalArea']/div[1]/a");
        sleepFor(5);
        mouseHoverByXpath(".//*[@id='shopForCollegeLink']/a");
        sleepFor(5);
        mouseHoverByXpath(".//*[@id='bridalGiftRegistryAnchor']");
        sleepFor(5);
    }
}
