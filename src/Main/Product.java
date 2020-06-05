package Main;
import java.util.ArrayList;

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

        Dry_Food couscous = new Dry_Food("Couscous", 319,4.2,6.3,0,69,1,128,
                532,0,0,0,0,0.3,21,0,0,0,0);
        this.d_food.add(couscous);

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

        Junk_Food sushi = new Junk_Food("Sushi", 93,2.9,0.6,2,18.4,0,4,
                429,1,76,1,0,0,6,13,60,0.3,47);
        this.j_food.add(sushi);


    }

    private void Fill_MFD() {
        Meat_Fish_Dai roasted_chicken = new Meat_Fish_Dai("Roasted Chicken", 239, 27.3, 13.6, 0,
                0,4,88,82,0,59.5,0,0,1.2,15,23,
                182,2,223);

        Meat_Fish_Dai roasted_beef = new Meat_Fish_Dai("Roasted Beef", 250, 27.1, 15, 0,
                0,6,86,900,0,59.5,0,0,2.2,12,14,
                111,3.6,136);

        Meat_Fish_Dai roasted_duck = new Meat_Fish_Dai("Roasted Duck", 337, 19, 28.3, 0,
                0,10.6,84,59,0,52.5,0,0,2.7,11,16,
                156,1.86,204);
        this.MFD_food.add(roasted_beef);
        this.MFD_food.add(roasted_chicken);
        this.MFD_food.add(roasted_duck);

        Meat_Fish_Dai roasted_lamb = new Meat_Fish_Dai("Roasted Lamb", 294, 24.5, 21, 0,
                0,4,97,72,0,53.5,0,0,1.88,17,23,
                188,4.5,310);

        Meat_Fish_Dai cooked_tilapia = new Meat_Fish_Dai("Cooked Tilapia", 128, 26.5, 2.6, 0,
                0,4,57,56,0,72,0,0,0.7,14,34,
                204,0.4,380);

        Meat_Fish_Dai cooked_salmon = new Meat_Fish_Dai("Cooked Salmon", 188, 25.5, 9, 0,
                0,1.5,56,405,0,66,0.5,0,0.5,9,33,
                319,0.5,449);

        this.MFD_food.add(roasted_lamb);
        this.MFD_food.add(cooked_tilapia);
        this.MFD_food.add(cooked_salmon);

        Meat_Fish_Dai raw_tuna = new Meat_Fish_Dai("Tuna", 232, 21.5, 12, 2.3,
                9.3,2.6,83,341,0,55,2,0,1.6,69,23,
                216,0.9,183);

        this.MFD_food.add(raw_tuna);

        Meat_Fish_Dai american_cheese = new Meat_Fish_Dai("American Cheese", 307, 16.1, 23, 6.2,
                9,13,78,1279,0,45,0,0,1,1375,34,
                768,2.2,295);

        Meat_Fish_Dai cotege_cheese = new Meat_Fish_Dai("Cottage", 81, 10.5, 2.3, 4,
                4.8,1.3,12,307,0,81,0,0,0,111,9,
                150,0.51,125);

        this.MFD_food.add(american_cheese);
        this.MFD_food.add(cotege_cheese);



    }

    private void Fill_Vegs() {
        //Veg tomato = new Veg("Tomato", )

        //Veg cucamb = new Veg("Cucumber")

        //Veg carrot = new Veg("Carrot")

        //Veg Purple_Onion new Veg("Purple Onion")

        //Veg Onion = new Veg("Onion")

        //Veg Green_Onion = new Veg("Green Onion")

        //Veg Apple = new Veg("Apple")
        
        //Veg cabbage = new Veg("Cabbage")

        //Veg aubergine = new Veg("Aubergine")

        //Veg pumpkin = new Veg("Pumpkin")

        //Veg garlic = new Veg("Garlic")

        //Veg sweet_pepper = new Veg("Sweet Pepper")

        //Veg banana = new Veg("Banana")

        //Veg grapes = new Veg("Grapes")

        //Veg melon = new Veg("Melon")

        //Veg orange = new Veg("Orange")

        //Veg pineapple = new Veg("Pineapple")




    }

}
