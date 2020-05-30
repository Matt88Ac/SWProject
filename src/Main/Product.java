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

            this.d_food = new ArrayList<Dry_Food>();
            this.veg_food = new ArrayList<Veg>();
            this.MFD_food = new ArrayList<Meat_Fish_Dai>();
            this.meds = new ArrayList<Meds>();
            this.j_food = new ArrayList<Junk_Food>();

        if (private_user){
            return;
        }
        else{
            this.Fill_Dry_Food();
            this.Fill_Junk_Food();
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
        Junk_Food pizza = new Junk_Food("Pizza", 266, 11,11,3.6, 33,4.5,17,
                600, 2.3, 43,1.4,0,3,188,24,216,1,172);

        Junk_Food burger = new Junk_Food("Burger", 300, 16.5,11,6, 36,1.2,33,
                440, 2, 38.5,0,0,3,62,27,134,2.5,197);
        this.j_food.add(pizza);
        this.j_food.add(burger);

        Junk_Food fries =  new Junk_Food("Fries", 196, 2,13,1.25, 18.5,0,0,
                141, 1.6, 65,9.7,0,1,9,23,52,0,401);
        this.j_food.add(fries);
        

    }

    private void Fill_MFD() {

    }

    private void Fill_Vegs() {

    }

}
