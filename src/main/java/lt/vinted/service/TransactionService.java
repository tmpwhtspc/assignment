package lt.vinted.service;

import lt.vinted.model.Date;
import lt.vinted.model.Transaction;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Robertas
 */
public class TransactionService {

    private List<Transaction> transactions = new LinkedList<>();

    private DateService dateService = new DateService();
    private ProviderService providerService = new ProviderService();

    public Transaction parseInputToTransaction(String input) {

        String[] inputSplit = input.split(" ");

        Date date = dateService.parseDate(inputSplit[0]);
        String packageSize = inputSplit[1];
        String providerName = inputSplit[2];

        Transaction transaction = new Transaction(date, packageSize, providerName);
        transaction.setPrice(providerService.getPriceByProviderNameAndPackage(providerName, packageSize));

        transactions.add(transaction);

        return transaction;

    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
