import Main.Model.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Products_Tests {
    private Product product = null;

    @Before
    public void setProduct(){
        this.product = new Product(false);
    }

    @After
    public void tearDown(){
        this.product = new Product(false);
    }

    @Test
    public void Products_In(){
        Assert.assertNotNull(this.product.veg_food);
        Assert.assertNotNull(this.product.MFD_food);
        Assert.assertNotNull(this.product.d_food);
        Assert.assertNotNull(this.product.j_food);
    }

}
