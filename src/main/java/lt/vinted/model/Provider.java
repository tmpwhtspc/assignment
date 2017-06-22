package lt.vinted.model;

import java.util.Map;

/**
 * @author Robertas
 */
public class Provider {

    private String name;
    private Map<String, Double> priceByPackageSize;

    public Provider(String name, Map<String, Double> priceByPackageSize) {
        this.name = name;
        this.priceByPackageSize = priceByPackageSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Double> getPriceByPackageSize() {
        return priceByPackageSize;
    }

    public void setPriceByPackageSize(Map<String, Double> priceByPackageSize) {
        this.priceByPackageSize = priceByPackageSize;
    }
}
