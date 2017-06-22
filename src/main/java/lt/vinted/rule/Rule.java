package lt.vinted.rule;

import lt.vinted.model.Transaction;

/**
 * @author Robertas
 */
public interface Rule {

    public void applyRule(Transaction transaction);

}
