package Main.Tests;

import Main.Controller.Private_User;
import Main.Model.Ads;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AdsTest {
    Private_User user = null;
    Ads ads = null;


    @BeforeEach
    void setUp() throws IOException {
        user = new Private_User("xyz", "xyz", 70, 170, "x", "y", "fa", "fa",
                30, 1, 0);
        ads = Ads.getInstance(user);
        assertNotNull(ads);
    }

    @AfterEach
    void tearDown() throws IOException {
        ads.SetNull();
        String x1 = "C:\\data\\food_"  + user.Get_Username() +".txt";
        File f = new File(x1);
        f.delete();

    }

    @Test
    public void Test(){

    }
}