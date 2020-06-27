import Main.Model.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Food_Tests {
    Product product = null;

    @Before
    public void setUp(){
        this.product = new Product(false);
    }

    public void tearDown(){
        this.product = new Product(false);
    }

    @Test
    public void testCalc(){
        double x1 = product.veg_food[0].Calc(150).Get_Detail("Calories");
        double x2 = product.MFD_food[3].Calc(650).Get_Detail("Salt");
        double x3 = product.d_food[2].Calc(340).Get_Detail("Carbo");
        double x4 = product.veg_food[6].Calc(100).Get_Detail("Calories");
        double x5 = product.d_food[4].Calc(270).Get_Detail("Coles");
        double x6 = product.j_food[1].Calc(1000).Get_Detail("Protein");

        Assert.assertEquals(27, x1, 0.001);
        Assert.assertEquals(468, x2, 0.001);
        Assert.assertEquals(163.2, x3, 0.1);
        Assert.assertEquals(32, x4, 0.001);
        Assert.assertEquals(345.6, x5, 0.1);
        Assert.assertEquals(165, x6, 0.001);

    }


}
