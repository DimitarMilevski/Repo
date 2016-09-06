package bestBuy;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 9/1/16.
 */
public class SearchBestBuy extends Base {
    @Test
    public void search() throws InterruptedException {

       // navigateTo("http://www.bestbuy.com/");
       // typeByCss("#abt-email-coll>input","jawad@yahoo.com");
        //clickByCss(".btn.btn-default");

        clickByCss(".close");
        sleepFor(2);
        typeByCssNEnter("#gh-search-input","laptop");
        sleepFor(3);
    }
}
