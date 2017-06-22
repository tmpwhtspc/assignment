package lt.vinted.util;

import lt.vinted.model.Transaction;

/**
 * @author Robertas
 */
public class PrintUtils {

    public static final String SPACE = " ";
    public static final String DASH = "-";
    public static final String IGNORED = "Ignored";
    public static final String DOUBLE_FORMAT= "%.2f";

    public void printTransaction(Transaction transaction) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(transaction.getDate().getYear())
                .append(DASH)
                .append(transaction.getDate().getMonth())
                .append(DASH)
                .append(transaction.getDate().getDay())
                .append(SPACE)
                .append(transaction.getPackageSize())
                .append(SPACE)
                .append(transaction.getProviderName())
                .append(SPACE)
                .append(String.format(DOUBLE_FORMAT, transaction.getPrice()))
                .append(SPACE);

        double discount = transaction.getDiscount();

        if (discount == 0.0) {

            stringBuilder.append(DASH);

        } else {

            stringBuilder.append(String.format(DOUBLE_FORMAT, transaction.getDiscount()));
        }

        System.out.println(stringBuilder.toString());

    }

    public void printIgnored(String input) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(input)
                .append(SPACE)
                .append(IGNORED);

        System.out.println(stringBuilder.toString());

    }

}
