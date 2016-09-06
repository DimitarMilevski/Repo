package Craigslist;

import org.omg.PortableServer.ThreadPolicyValue;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tarikBase.Core;

/**
 * Created by tzaman on 9/1/16.
 */
public class CRV extends Core {
        @Test
        public void test() throws InterruptedException {
            driver.findElement(By.xpath(".//*[@id='sss0']/li[13]/a/span")).click();
            driver.findElement(By.xpath(".//*[@id='pagecontainer']/section/div/ul/li[2]/a")).click();
            typeByXpath(".//*[@id='query']", "CR V");
            sleepFor(2);
            clickByXpath(".//*[@id='searchform']/div[1]/button");


            Thread.sleep(5000);
        }




    }

