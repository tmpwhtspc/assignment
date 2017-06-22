package lt.vinted;

import lt.vinted.util.FileUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Robertas
 */
public class FileUtilsTest {

    private FileUtils fileUtils = new FileUtils();

    @Test
    public void testFileUtil() {

        List<String> listOfStringTransactons = fileUtils.getInputFileContent();
        String transaction = listOfStringTransactons.get(0);

        assertEquals(transaction, "2015-02-01 S MR");

    }

}
