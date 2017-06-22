package lt.vinted.model;

/**
 * @author Robertas
 */
public class Transaction {

    private Date date;
    private String packageSize;
    private String providerName;
    private double price;
    private double discount;

    public Transaction(Date date, String packageSize, String providerName) {
        this.date = date;
        this.packageSize = packageSize;
        this.providerName = providerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(String packageSize) {
        this.packageSize = packageSize;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
