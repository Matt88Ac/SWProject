package Main.Model;

public class Product {
    public Dry_Food[] d_food = null;
    public Veg[] veg_food = null;
    public Meat_Fish_Dai[] MFD_food = null;
    public Junk_Food[] j_food = null;

    public Product(boolean private_user){

            this.d_food = new Dry_Food[10];
            this.veg_food = new Veg[20];
            this.MFD_food = new Meat_Fish_Dai[15];
            this.j_food = new Junk_Food[10];
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
        this.d_food[0] = pasta;

        Dry_Food w_bread = new Dry_Food("White Bread",250,10,1.5,6,49,0,0,
                439,0, 37.3, 0.4, 0, 5,73,36,125,1,115);

        Dry_Food b_bread = new Dry_Food("Black Bread", 259, 9,3.3,3.9,48,0,0,
                603,0,37.3,0.4,0,2.83,73,40,125,1.14,166);

        this.d_food[1] = w_bread;
        this.d_food[2] = b_bread;

        Dry_Food rice = new Dry_Food("Rice", 130,2.7,0.3,0,28,0,0,
                1,0,68.4,0,0,0.2,10,12,43,0,35);
        this.d_food[3] = rice;

        Dry_Food couscous = new Dry_Food("Couscous", 319,4.2,6.3,0,69,1,128,
                532,0,0,0,0,0.3,21,0,0,0,0);
        this.d_food[4] = couscous;

    }

    private void Fill_Junk_Food() {
        Junk_Food pizza = new Junk_Food("Pizza", 266, 11,11,3.6, 33,4.5,17,
                600, 2.3, 43,1.4,0,3,188,24,216,1,172);

        Junk_Food burger = new Junk_Food("Burger", 300, 16.5,11,6, 36,1.2,33,
                440, 2, 38.5,0,0,3,62,27,134,2.5,197);
        this.j_food[0] = pizza;
        this.j_food[1] = burger;

        Junk_Food fries =  new Junk_Food("Fries", 196, 2,13,1.25, 18.5,0,0,
                141, 1.6, 65,9.7,0,1,9,23,52,0,401);
        this.j_food[2] = fries;

        Junk_Food sushi = new Junk_Food("Sushi", 93,2.9,0.6,2,18.4,0,4,
                429,1,76,1,0,0,6,13,60,0.3,47);
        this.j_food[3] = sushi;


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
        this.MFD_food[0] = roasted_beef;
        this.MFD_food[1] = roasted_chicken;
        this.MFD_food[2] = roasted_duck;

        Meat_Fish_Dai roasted_lamb = new Meat_Fish_Dai("Roasted Lamb", 294, 24.5, 21, 0,
                0,4,97,72,0,53.5,0,0,1.88,17,23,
                188,4.5,310);

        Meat_Fish_Dai cooked_tilapia = new Meat_Fish_Dai("Cooked Tilapia", 128, 26.5, 2.6, 0,
                0,4,57,56,0,72,0,0,0.7,14,34,
                204,0.4,380);

        Meat_Fish_Dai cooked_salmon = new Meat_Fish_Dai("Cooked Salmon", 188, 25.5, 9, 0,
                0,1.5,56,405,0,66,0.5,0,0.5,9,33,
                319,0.5,449);

        this.MFD_food[3] = roasted_lamb;
        this.MFD_food[4] = cooked_salmon;
        this.MFD_food[5] = cooked_tilapia;

        Meat_Fish_Dai raw_tuna = new Meat_Fish_Dai("Tuna", 232, 21.5, 12, 2.3,
                9.3,2.6,83,341,0,55,2,0,1.6,69,23,
                216,0.9,183);

        this.MFD_food[6] = raw_tuna;

        Meat_Fish_Dai american_cheese = new Meat_Fish_Dai("American Cheese", 307, 16.1, 23, 6.2,
                9,13,78,1279,0,45,0,0,1,1375,34,
                768,2.2,295);

        Meat_Fish_Dai cotege_cheese = new Meat_Fish_Dai("Cottage", 81, 10.5, 2.3, 4,
                4.8,1.3,12,307,0,81,0,0,0,111,9,
                150,0.51,125);

        this.MFD_food[7] = american_cheese;
        this.MFD_food[8] = cotege_cheese;



    }

    private void Fill_Vegs() {
        Veg tomato = new Veg("Tomato", 18, 1,0.2,2.6,4,0,0,5,1.2,
                94,13,0,0.3,10,11,24,0.17,237);

        Veg cucumber = new Veg("Cucumber", 12, 0.6,0.2,1.6,4,0,0,5,0.7,
                       96,3,0,0.22,14,12,21,0.17,137);

        Veg carrot = new Veg("Carrot", 41, 0.93,0.2,4.74,4,0,0,69,2.8,
                88.29,5.9,0,0.3,33,12,35,0.24,320);

        Veg red_onion = new Veg("Red Onion", 30, 0.68,0.2,3.38,4,0,0,0,1.4,
                       0,4.1,0,0,14,12,35,0.24,0);

        Veg onion = new Veg("Onion", 40, 1.1,0.2,4.24,9.34,0,0,4,1.7,
                89.11,7.4,0,0.21,23,10,29,0.17,146);

        Veg green_onion = new Veg("Green Onion", 32, 1.83,0.2,2.33,7.34,0,0,16,2.6,
                89.83,18.8,0,1.48,72,20,37,0.39,276);

        Veg apple = new Veg("Apple", 157, 1.97,3.45,19.97,30.77,0,0,169,1.6,
        63.09,2.2,0,0.8,35,8,28,0.19,83);

        Veg cabbage = new Veg("Cabbage", 25, 1.28,0.1,3.2,5.8,0,0,18,2.5,
                92.18,36.6,0,0.47,40,12,26,0.18,170);

        Veg aubergine = new Veg("Aubergine", 90, 0,7.5,2.5,7.5,0,0,255,2.5,
               92.18,1.5,0,0.45,0,12,0,0.18,0);

        this.veg_food[0] = tomato;
        this.veg_food[1] = cabbage;
        this.veg_food[2] = carrot;
        this.veg_food[3] = cucumber;
        this.veg_food[4] = apple;
        this.veg_food[5] = aubergine;
        this.veg_food[6] = green_onion;
        this.veg_food[7] = onion;
        this.veg_food[8] = red_onion;

        Veg pumpkin = new Veg("Pumpkin", 26, 1,0.1,2.76,6.5,0,0,1,0.5,
                       92.18,9,0,0.8,21,12,44,0.32,340);

        Veg garlic = new Veg("Garlic", 149, 6.36,0.5,1,33.06,0.25,0,17,2.1,
                58.58	,31.2,0,1.7,181,25,153,1.16,401);

        Veg sweet_pepper = new Veg("Sweet Pepper", 31, 0.99,0.3,4.2,6.03,0,0,4,2.1,
                92.21,127.7,0,0.43,7,12,26,0.25,211);

        Veg banana = new Veg("Banana", 89, 1.09,0.33,12.23,22.84,0.112,0,1,2.6,
                74.91,8.7,0.367,0.26,5,27,22,0.15,358);

        Veg melon = new Veg("Melon", 28, 1.11,0.1,5.69,6.58,0,0,9,0.9,
                91.85,21.8,0.163,0.34,11,11,5,0.07,182);

        Veg orange = new Veg("Orange", 47, 0.94,0.12,9.35,11.75,0,0,0,2.4,
                86.75,53.2,0.06,0.1,40,10,14,0.07,181);

        Veg pineapple = new Veg("Pineapple", 50, 0.54,0.12,9.85,13.12,0,0,1,1.4,
                86,47.8,0.112,0.29,13,12,8,0.12,109);

        this.veg_food[9] = orange;
        this.veg_food[10] = melon;
        this.veg_food[11] = pineapple;
        this.veg_food[12] = pumpkin;
        this.veg_food[13] = sweet_pepper;
        this.veg_food[14] = banana;
        this.veg_food[15] = garlic;


    }

    public Food Get(String kind, int where) throws CloneNotSupportedException {
        if (kind == "Dry Food"){
            return (Food) this.d_food[where].clone();
        }

        else if (kind == "Junk Food"){
            return (Food) this.j_food[where].clone();
        }

        else if (kind == "Veg"){
            return (Food) this.veg_food[where].clone();
        }

        return (Food) this.MFD_food[where].clone();
    }

}
