package lt.vinted.controller;

import lt.vinted.model.Transaction;
import lt.vinted.util.PrintUtils;
import lt.vinted.service.RuleService;
import lt.vinted.service.TransactionService;
import lt.vinted.util.FileUtils;
import lt.vinted.validation.InputValidator;

import java.util.List;

/**
 *  @author Robertas
 */
public class Controller {

    private TransactionService transactionService = new TransactionService();
    private RuleService ruleService = new RuleService();

    private PrintUtils printUtils = new PrintUtils();
    private FileUtils fileUtils = new FileUtils();

    private InputValidator inputValidator = new InputValidator();

    public void run() {

        List<String> fileContent = fileUtils.getInputFileContent();

        for (String input : fileContent) {

            if (inputValidator.isInputValid(input)) {

                Transaction transaction = transactionService.parseInputToTransaction(input);
                ruleService.applyRules(transaction);
                printUtils.printTransaction(transaction);

            } else {

                printUtils.printIgnored(input);

            }
        }

    }

}
