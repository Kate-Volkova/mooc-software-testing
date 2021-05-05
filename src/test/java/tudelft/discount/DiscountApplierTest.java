package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tudelft.invoicemocked.Invoice;
import tudelft.invoicemocked.InvoiceDao;
import tudelft.invoicemocked.InvoiceFilter;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {
    @Test
    void discountApplier() {

        Product chair = new Product("Chair", 50.0, "HOME");
        Product armchair = new Product("Armchair", 60.0, "BUSINESS");
        Product sofa = new Product("Sofa", 578.0, "OTHER");

        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> results = Arrays.asList(chair, armchair, sofa);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier newPrice = new DiscountApplier(dao);
        newPrice.setNewPrices();

        Assertions.assertEquals(45, chair.getPrice());
        Assertions.assertEquals(66, armchair.getPrice());
        Assertions.assertEquals(578, sofa.getPrice());

    }
}
