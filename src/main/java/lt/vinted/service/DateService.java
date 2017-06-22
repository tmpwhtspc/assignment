package lt.vinted.service;

import lt.vinted.model.Date;

/**
 * @author Robertas
 */
public class DateService {

    public Date parseDate(String date) {

        String[] dateDate = date.split("-");
        return new Date(dateDate);

    }

}
