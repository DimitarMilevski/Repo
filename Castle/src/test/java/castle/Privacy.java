package castle;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 9/1/16.
 */
public class Privacy extends Base {
    @Test
    public void privacy() throws InterruptedException {
        navigateTo("http://castle.com/");
        clickByCss("#menu-item-81>a");
        typeByCssNEnter(".cb-search-field.cb-font-header", "privacy");
        sleepFor(5);
    }
}
