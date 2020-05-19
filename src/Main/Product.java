package Main;
import java.util.ArrayList;

public class Product {
    public ArrayList<Dry_Food> d_food;
    public ArrayList<Veg> veg_food;
    public ArrayList<Meat_Fish_Dai> MFD_food;
    public ArrayList<Junk_Food> j_food;
    public ArrayList<Meds> meds;

    public Product(boolean private_user){
        d_food = new ArrayList<Dry_Food>();
        veg_food = new ArrayList<Veg>();
        MFD_food = new ArrayList<Meat_Fish_Dai>();
        meds = new ArrayList<Meds>();
        j_food = new ArrayList<Junk_Food>();

        if (private_user == true){

        }

        else{

        }

    }


}
