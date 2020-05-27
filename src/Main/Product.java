package Main;
import java.util.ArrayList;
import java.util.Optional;

public class Product {
    public ArrayList<Dry_Food> d_food = null;
    public ArrayList<Veg> veg_food = null;
    public ArrayList<Meat_Fish_Dai> MFD_food = null;
    public ArrayList<Junk_Food> j_food = null;
    public ArrayList<Meds> meds = null;

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
        Dry_Food pasta = new Dry_Food("Pasta", 131, 5, 1.1, 0.6, 25,0, 33,
                1,0, 62,0,7,0.5,7,18,58,0.5,44);
        this.d_food.add(pasta);

        Dry_Food w_bread = new Dry_Food("White Bread",250,10,1.5,6,49,0,0,
                439,0, 37.3, 0.4, 0, 5,73,36,125,1,115);

        Dry_Food b_bread = new Dry_Food("Black Bread", 259, 9,3.3,3.9,48,0,0,
                603,0,37.3,0.4,0,2.83,73,40,125,1.14,166);

        this.d_food.add(w_bread);
        this.d_food.add(b_bread);

        Dry_Food rice = new Dry_Food("Rice", 130,2.7,0.3,0,28,0,0,
                1,0,68.4,0,0,0.2,10,12,43,0,35);
        this.d_food.add(rice);

    }

    private void Fill_Junk_Food() {
    }

    private void Fill_Meds() {

    }

    private void Fill_MFD() {

    }

    private void Fill_Vegs() {

    }

}
