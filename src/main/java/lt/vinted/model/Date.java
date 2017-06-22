package lt.vinted.model;

/**
 * @author Robertas
 */
public class Date {

    private String year;
    private String month;
    private String day;

    public Date(String[] date) {
        this.year = date[0];
        this.month = date[1];
        this.day = date[2];
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
