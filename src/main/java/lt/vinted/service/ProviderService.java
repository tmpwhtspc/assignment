package lt.vinted.service;

import lt.vinted.model.Provider;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Robertas
 */
public class ProviderService {

    private List<Provider> providers = new LinkedList<>();

    public List<Provider> getProviders() {

        if (providers.size() == 0) {

            Map<String, Double> priceByPackageSize = new HashMap<>();
            priceByPackageSize.put("S", 1.50);
            priceByPackageSize.put("M", 4.90);
            priceByPackageSize.put("L", 6.90);
            Provider provider = new Provider("LP", priceByPackageSize);
            addProvider(provider);

            Map<String, Double> priceByPackageSize2 = new HashMap<>();
            priceByPackageSize2.put("S", 2.00);
            priceByPackageSize2.put("M", 3.00);
            priceByPackageSize2.put("L", 4.00);
            Provider provider2 = new Provider("MR", priceByPackageSize2);
            addProvider(provider2);

            return providers;

        } else {

            return providers;

        }

    }

    public void addProvider(Provider provider) {
        if (provider != null && !provider.getName().equals("") && !provider.getPriceByPackageSize().isEmpty()) {
            providers.add(provider);
        }
    }

    public Provider getProviderByName(String name) {

        if (name != null || !name.equals("")) {
            for (Provider provider : getProviders()) {
                if (provider.getName().equals(name)) {
                    return provider;
                }
            }
        }

        return null;
    }

    public double getPriceByProviderNameAndPackage(String providerName, String packaging) {

        if (!providerName.equals("") && !packaging.equals("")) {
            for (Provider provider : getProviders()) {
                if (provider.getName().equals(providerName)) {
                    return provider.getPriceByPackageSize().get(packaging);
                }
            }
        }

        return 0;
    }

    public boolean isProviderNameExistent(String providerName) {

        if (providerName != null || !providerName.equals("")) {
            for (Provider provider : getProviders()) {
                if (provider.getName().equals(providerName)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isPackageSizeExistent(String packageSize) {

        if (packageSize != null || !packageSize.equals("")) {
            for (Provider provider : getProviders()) {
                if (provider.getPriceByPackageSize().get(packageSize) != null) {
                    return true;
                }
            }
        }

        return false;
    }

}
