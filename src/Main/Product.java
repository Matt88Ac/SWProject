package Main;
import java.util.ArrayList;
import java.util.Optional;

public class Product {
    public static ArrayList<Dry_Food> d_food = null;
    public static ArrayList<Veg> veg_food = null;
    public static ArrayList<Meat_Fish_Dai> MFD_food = null;
    public static ArrayList<Junk_Food> j_food = null;
    public static ArrayList<Meds> meds = null;

    public Product(boolean private_user){

        if (d_food == null) {
            this.d_food = new ArrayList<Dry_Food>();
            this.veg_food = new ArrayList<Veg>();
            this.MFD_food = new ArrayList<Meat_Fish_Dai>();
            this.meds = new ArrayList<Meds>();
            this.j_food = new ArrayList<Junk_Food>();
        }

        if (private_user){
            return;
        }

        else{
            this.Fill_Dry_Food();
            this.Fill_Junk_Food();
            this.Fill_Meds();
            this.Fill_MFD();
            this.Fill_Vegs();
        }

    }

    private void Fill_Dry_Food() {

    }

    private void Fill_Junk_Food() {

    }

    private void Fill_Meds() {

    }

    private void Fill_MFD() {

    }

    private void Fill_Vegs() {

    }

    public void Add_Product(Optional<Veg> veg, Optional<Meds> med, Optional<Meat_Fish_Dai> mfd,
                            Optional<Dry_Food> dfood, Optional<Junk_Food> jfood){


    }



}
