package lt.vinted.validation;

import lt.vinted.service.ProviderService;

/**
 * @author Robertas
 */
public class InputValidator {

    private ProviderService providerService = new ProviderService();

    public boolean isInputValid(String input) {

        if (input == null || input.equals("")) {
            return false;
        }

        String[] transactionData = input.split(" ");

        if (transactionData.length != 3) {
            return false;
        }

        String dateData = transactionData[0];
        String packageName = transactionData[1];
        String providerName = transactionData[2];

        if (!providerService.isPackageSizeExistent(packageName)) {
            return false;
        }

        if (!providerService.isProviderNameExistent(providerName)) {
            return false;
        }

        return true;
    }

}
