package lt.vinted;

import lt.vinted.model.Date;
import lt.vinted.service.DateService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Robertas
 */
public class DateTest {

    private DateService dateService = new DateService();

    @Test
    public void testDateService() {

        String date = "2015-05-01";

        Date dateFromService = dateService.parseDate(date);

        assertEquals(dateFromService.getYear(), "2015");
        assertEquals(dateFromService.getMonth(), "05");
        assertEquals(dateFromService.getDay(), "01");

    }

}
