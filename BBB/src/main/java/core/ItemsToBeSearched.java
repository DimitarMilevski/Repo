package core;

import Common.Base;
import utility.DataReader;

import java.io.IOException;

/**
 * Created by Zaqc on 8/31/2016.
 */
public class ItemsToBeSearched extends Base {
    DataReader dr = new DataReader();
    public String [] getData()throws IOException {
        String path = System.getProperty("user.dir")+"/data/file1.xls";
        String [] st = dr.fileReader(path);
        return st;
    }
}
