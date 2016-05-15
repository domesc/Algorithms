import arrays.DynamicArrays;
import org.junit.Test;

import java.nio.file.Paths;

/**
 * Created by domesc on 14/05/16.
 */
public class DynamicArraysTest {

    @Test
    public void simpleTestFromFile(){
        String filePath = Paths.get("").toAbsolutePath().toString() + "/src/test/resources/dynamicArrays.txt";
        new DynamicArrays().readAndExecute(filePath);
    }

}
