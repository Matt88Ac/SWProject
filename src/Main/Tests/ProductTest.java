package Main.Tests;

import Main.Model.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    private Product product = null;

    @BeforeEach
    void setUp() {
        this.product = new Product(false);
    }

    @AfterEach
    void tearDown() {
        this.product = new Product(false);
    }

    @Test
    public void Products_In(){
        assertNotNull(this.product.veg_food);
        assertNotNull(this.product.MFD_food);
        assertNotNull(this.product.d_food);
        assertNotNull(this.product.j_food);
    }
}