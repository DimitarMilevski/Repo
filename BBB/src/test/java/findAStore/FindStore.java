package findAStore;

import Common.Base;
import org.testng.annotations.Test;


/**
 * Created by Zaqc on 8/30/2016.
 */
public class FindStore extends Base {
   // @Test
        public void FindStore(){
            clickByCss(".findStore>a");
            clickByCss(".findStore>a");
            clickByCss("#storeLocatorOmnibarInput");
            typeByCss("#storeLocatorOmnibarInput", "08401");
            clickByCss("#storeLocatorRadiusInput");
        }
    }

