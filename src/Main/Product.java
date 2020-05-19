package Main;
import java.util.ArrayList;

public class Product {
    public ArrayList<Dry_Food> d_food;
    public ArrayList<Veg> veg_food;
    public ArrayList<Meat_Fish_Dai> MFD_food;
    public ArrayList<Junk_Food> j_food;
    public ArrayList<Meds> meds;

    public Product(boolean private_user){
        this.d_food = new ArrayList<Dry_Food>();
        this.veg_food = new ArrayList<Veg>();
        this.MFD_food = new ArrayList<Meat_Fish_Dai>();
        this.meds = new ArrayList<Meds>();
        this.j_food = new ArrayList<Junk_Food>();

        if (private_user == true){
            return;
        }

        else{



        }

    }

    private void Fill_Dry_Food() {

    }




}
