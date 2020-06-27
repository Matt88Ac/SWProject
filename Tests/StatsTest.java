import Main.Controller.Private_User;
import Main.Model.Eating_Stats;
import Main.Model.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;

public class StatsTest {
    Private_User user = null;
    Eating_Stats stats = null;
    Product product = new Product(false);

    @Before
    public void SetUp() throws IOException {
        user = new Private_User("xyz", "xyz", 70, 170, "x", "y", "fa", "fa",
                30, 1, 0);
        stats = new Eating_Stats(user);
    }

    @After
    public void TearDown() throws IOException {
        user = new Private_User("xyz", "xyz", 70, 170, "x", "y", "fa", "fa",
                30, 1, 0);
        stats = new Eating_Stats(user);
    }

    @Test
    public void Test_Calories(){
        stats.Ate_Meat_Fish_Dai(product.MFD_food[0]);
        stats.Ate_Dry_food(product.d_food[0]);

        Assert.assertEquals(false, stats.Get_Status_cal());

        stats.Ate_Dry_food(product.d_food[0].Calc(6700));

        Assert.assertEquals(true, stats.Get_Status_cal());

    }





}
