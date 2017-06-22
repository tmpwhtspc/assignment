package lt.vinted;

import lt.vinted.model.Date;
import lt.vinted.model.Transaction;
import lt.vinted.service.TransactionService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Robertas
 */
public class TransactionTest {

    private TransactionService transactionService = new TransactionService();

    @Test
    public void testTransactionParsing() {

        String[] date = "2015-05-01".split("-");

        Transaction transaction = new Transaction(new Date(date), "S", "LP");

        Transaction transactionFromService = transactionService.parseInputToTransaction("2015-05-01 S LP");

        assertEquals(transaction.getDate().getYear(), transactionFromService.getDate().getYear());
        assertEquals(transaction.getDate().getMonth(), transactionFromService.getDate().getMonth());
        assertEquals(transaction.getDate().getDay(), transactionFromService.getDate().getDay());
        assertEquals(transaction.getPackageSize(), transactionFromService.getPackageSize());
        assertEquals(transaction.getProviderName(), transactionFromService.getProviderName());

    }

}
