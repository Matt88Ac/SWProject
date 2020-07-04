package Main.Tests;

import Main.Controller.Private_User;
import Main.Model.Eating_Stats;
import Main.Model.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Eating_StatsTest {

    Private_User user = null;
    Eating_Stats stats = null;
    Product product = new Product(false);

    @BeforeEach
    void setUp() throws IOException {
        user = new Private_User("xyz", "xyz", 70, 170, "x", "y", "fa", "fa",
                30, 1, 0);
        stats = new Eating_Stats(user);
    }

    @AfterEach
    void tearDown() throws IOException {
        String x1 = "C:\\data\\food_"  + user.Get_Username() +".txt";
        File f = new File(x1);
        f.delete();

        x1 = new String("C:\\data\\stats_"  + user.Get_Username() +".txt");
        f = new File(x1);
        f.delete();

    }

    @Test
    public void Test_Calories() throws CloneNotSupportedException, IOException {
        stats.Ate(product.Get("X",0));
        stats.Ate(product.Get("Dry Food", 0));

        assertEquals(false, stats.Get_Status_cal());

        stats.Ate(product.Get("Dry Food", 0).Calc(6700));

        assertEquals(true, stats.Get_Status_cal());

    }
}