import Products.Chocolate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    private Chocolate chocolate;

    @Before
    public void before(){
        chocolate = new Chocolate("Mars Bar", "Nestle", 1.20);
    }

    @Test
    public void canGetName(){
        assertEquals("Mars Bar", chocolate.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Nestle", chocolate.getBrand());
    }

    @Test
    public void canGetPrice(){
        assertEquals(1.20, chocolate.getPrice(), 0.0);
    }

    @Test
    public void canSetName(){
        chocolate.setName("Snickers");
        assertEquals("Snickers", chocolate.getName());
    }

    @Test
    public void canSetBrand(){
        chocolate.setBrand("Cadburys");
        assertEquals("Cadburys", chocolate.getBrand());
    }

    @Test
    public void canSetPrice(){
        chocolate.setPrice(2.00);
        assertEquals(2.00, chocolate.getPrice(), 0.0);
    }

}
