package lt.vinted.rule;

import lt.vinted.model.Provider;
import lt.vinted.model.Transaction;
import lt.vinted.service.ProviderService;

/**
 * @author Robertas
 */
public class LowestSPackagePriceRule implements Rule {

    public static final String S = "S";

    private ProviderService providerService = new ProviderService();
    private double lowestSPackagePrice = Double.MAX_EXPONENT;

    @Override
    public void applyRule(Transaction transaction) {

        if (transaction.getPackageSize().equals(S)) {

            double sPrice = providerService.getPriceByProviderNameAndPackage(transaction.getProviderName(), S);

            double lowestSPrice = getLowestSPackagePrice();
            transaction.setPrice(lowestSPrice);

            double discount = sPrice - lowestSPrice;
            transaction.setDiscount(discount);

        }

    }

    public double getLowestSPackagePrice() {

        if (lowestSPackagePrice == Double.MAX_EXPONENT) {

            for (Provider provider : providerService.getProviders()) {

                double tempLowestSPackagePrice = provider.getPriceByPackageSize().get(S);

                if (tempLowestSPackagePrice < lowestSPackagePrice) {

                    lowestSPackagePrice = tempLowestSPackagePrice;

                }

            }

        }

        return lowestSPackagePrice;

    }
}
