package readingFromFile;

import Common.Base;
import core.ItemsToBeSearched;
import core.SearchItems;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Zaqc on 9/1/2016.
 */
public class Items extends Base {
//    @Test
    public void searchUsingExcelFile() throws IOException, InterruptedException {
        //initialize Search page factory
        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
        //Read search.data from excel file
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String[] value = itemsToBeSearched.getData();
        for (String read : value) {
            search.searchFor(read);
            sleepFor(2);
            search.clearSearchInput();
        }
    }
}
