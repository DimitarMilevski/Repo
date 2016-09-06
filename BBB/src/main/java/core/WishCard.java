package core;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Zaqc on 9/5/2016.
 */
public class WishCard {
    @FindBy(how = How.CSS, using = ".//*[@id='message']")
    public static WebElement searchInput;

    @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement searchSubmit ;

    public void searchFor(String item){
        searchInput.sendKeys(item, Keys.ENTER);
    }
    public void clearSearchInput() {
        searchInput.clear();
    }
}
