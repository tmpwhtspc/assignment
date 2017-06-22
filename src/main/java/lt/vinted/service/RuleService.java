package lt.vinted.service;

import lt.vinted.model.Transaction;
import lt.vinted.rule.FreeMontlyLPShipmentRule;
import lt.vinted.rule.LowestSPackagePriceRule;
import lt.vinted.rule.MonthlyDiscountLimitRule;

/**
 * @author Robertas
 */
public class RuleService {

    private LowestSPackagePriceRule lowestSPackagePriceRule = new LowestSPackagePriceRule();
    private FreeMontlyLPShipmentRule freeMontlyLPShipmentRule = new FreeMontlyLPShipmentRule();
    private MonthlyDiscountLimitRule monthlyDiscountLimitRule = new MonthlyDiscountLimitRule();

    public void applyRules(Transaction transaction) {

        lowestSPackagePriceRule.applyRule(transaction);
        freeMontlyLPShipmentRule.applyRule(transaction);
        monthlyDiscountLimitRule.applyRule(transaction);

    }

}
