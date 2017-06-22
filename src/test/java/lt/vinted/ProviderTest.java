package lt.vinted;

import lt.vinted.model.Provider;
import lt.vinted.service.ProviderService;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * @author Robertas
 */
public class ProviderTest {

    ProviderService providerService = new ProviderService();

    @Test
    public void testProviderAddingAndGetting() {


        Map<String, Double> priceByPackageSize = new HashMap<>();
        priceByPackageSize.put("S", 1.50);
        priceByPackageSize.put("M", 4.90);
        priceByPackageSize.put("L", 6.90);
        Provider provider = new Provider("LP", priceByPackageSize);
        providerService.addProvider(provider);

        Provider providerFromService = providerService.getProviderByName("LP");

        assertEquals(provider.getName(), providerFromService.getName());

    }

    @Test
    public void testIsProviderNameExistent() {

        assertTrue(providerService.isProviderNameExistent("LP"));
        assertFalse(providerService.isProviderNameExistent("AB"));

    }

    @Test
    public void testIsPackageSizeExistent() {

        assertTrue(providerService.isPackageSizeExistent("M"));
        assertFalse(providerService.isPackageSizeExistent("K"));

    }

    @Test
    public void testGetPriceByProviderNameAndPackage() {
        assertEquals(providerService.getPriceByProviderNameAndPackage("LP", "S"), 1.50);
    }

}
