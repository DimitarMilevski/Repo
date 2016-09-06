package Craigslist;

import com.sun.tools.javac.comp.Enter;
import org.omg.PortableServer.ThreadPolicyValue;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tarikBase.Core;
/**
 * Created by tzaman on 9/3/16.
 */
public class LogIn extends Core {

    @Test
    public void test() throws InterruptedException {
        clickByXpath(".//*[@id='postlks']/li[2]/a");
        sleepFor(1);
        typeByXpath(".//*[@id='inputEmailHandle']", "abc@gmail.com");
        sleepFor(1);
        typeByXpath(".//*[@id='inputPassword']", "**************");
        clickByXpath(".//*[@id='pagecontainer']/section/div/div[1]/form/div[3]/button");
        //takeEnterKeys(".//*[@id='pagecontainer']/section/div/div[1]/form/div[3]/button");
        Thread.sleep(2000);
    }
}
