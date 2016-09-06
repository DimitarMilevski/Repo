package ebay;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 9/2/16.
 */
public class Search extends Base {
    @Test
    public void search() throws InterruptedException {
        typeByCss("#gh-ac","laptop");
        clickByCss("#gh-btn");
        sleepFor(2);

    }

}
