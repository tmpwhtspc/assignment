package lt.vinted.rule;

import lt.vinted.model.Transaction;

/**
 * @author Robertas
 */
public class MonthlyDiscountLimitRule implements Rule{

    public static final double MONHTLY_DISCOUNT_LIMIT = 10.0;

    private double monthlyDiscount = MONHTLY_DISCOUNT_LIMIT;
    private String currentMonth;

    @Override
    public void applyRule(Transaction transaction) {

        double discount = transaction.getDiscount();
        String month = transaction.getDate().getMonth();

        if (isSameMonth(month) && monthlyDiscount > discount) {

            monthlyDiscount = monthlyDiscount - discount;

            return;

        } else if (isSameMonth(month) && monthlyDiscount < discount) {

            double newDiscount = transaction.getDiscount() - monthlyDiscount;
            double newPrice = transaction.getPrice() + newDiscount;
            transaction.setPrice(newPrice);
            transaction.setDiscount(monthlyDiscount);
            monthlyDiscount = 0;

            return;

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
            monthlyDiscount = MONHTLY_DISCOUNT_LIMIT;
            return false;
        }

    }

}
