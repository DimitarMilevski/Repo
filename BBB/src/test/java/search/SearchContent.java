package search;

import Common.Base;

/**
 * Created by Zaqc on 8/24/2016.
 */
public class SearchContent extends Base {

  //  @Test
    public void SearchContent(){

        clickByXpath(".//*[@id='globalSearchForm']/div[1]/a");
        clickByXpath(".//*[@id='globalSearchForm']/div[1]/ul/li[2]/span");
        typeByCss("#searchFormInput", "GiftCard");
        clickByCss(".searchFormButton");
    }
}
