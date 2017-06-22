package lt.vinted;

import lt.vinted.validation.InputValidator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Robertas
 */
public class InputValidationTest {

    private InputValidator inputValidator = new InputValidator();

    @Test
    public void TestInputValidation() {

        assertTrue(inputValidator.isInputValid("2015-02-01 S MR"));

    }

}
