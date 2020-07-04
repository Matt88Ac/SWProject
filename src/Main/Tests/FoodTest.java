package Main.Tests;

import Main.Model.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {
    Product product = null;

    @BeforeEach
    void setUp() {
        this.product = new Product(false);
    }

    @AfterEach
    void tearDown() {
        this.product = new Product(false);
    }

    @Test
    public void testCalc() throws CloneNotSupportedException {
        double x1 = product.Get("Veg", 0).Calc(150).Get_Detail("Calories");
        double x2 = product.Get("X",3).Calc(650).Get_Detail("Salt");
        double x3 = product.Get("Dry Food", 2).Calc(340).Get_Detail("Carbo");
        double x4 = product.Get("Veg", 6).Calc(100).Get_Detail("Calories");
        double x5 = product.Get("Dry Food", 4).Calc(270).Get_Detail("Coles");
        double x6 = product.Get("Junk_Food", 1).Calc(1000).Get_Detail("Protein");

        assertEquals(27, x1, 0.001);
        assertEquals(468, x2, 0.001);
        assertEquals(163.2, x3, 0.1);
        assertEquals(32, x4, 0.001);
        assertEquals(345.6, x5, 0.1);
        assertEquals(273, x6, 0.001);

    }

}