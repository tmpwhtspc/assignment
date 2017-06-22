package lt.vinted.rule;

import lt.vinted.model.Transaction;
import lt.vinted.service.ProviderService;

/**
 * @author Robertas
 */
public class FreeMontlyLPShipmentRule implements Rule {

    public static final String LP = "LP";
    public static final String L = "L";

    public static final int MONTHLY_ITERATION = 1;
    public static final int FREE_SHIPMENT_AFTER_ITERATIONS = 3;

    private ProviderService providerService = new ProviderService();

    private int monthlyIteration = MONTHLY_ITERATION;
    private String currentMonth;

    @Override
    public void applyRule(Transaction transaction) {

        if (transaction.getProviderName().equals(LP) && transaction.getPackageSize().equals(L)) {

            String month = transaction.getDate().getMonth();

            if (isSameMonth(month) && monthlyIteration == FREE_SHIPMENT_AFTER_ITERATIONS) {

                transaction.setPrice(0.0);
                transaction.setDiscount(providerService.getPriceByProviderNameAndPackage(LP, L));
                monthlyIteration++;

            } else {

                monthlyIteration++;

            }

        }
    }

    public boolean isSameMonth(String month) {

        if (currentMonth == null) {

            currentMonth = month;
            return true;

        } else if (currentMonth.equals(month)) {

            return true;

        } else {

            currentMonth = month;
            monthlyIteration = MONTHLY_ITERATION;
            return false;

        }
    }


}
