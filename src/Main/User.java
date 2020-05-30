package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class User {
    public Product p = new Product(true);
    protected String username;
    protected String password;

    public User(String us, String ps) throws IOException {
        this.password = ps;
        this.username = us;
        this.Extract_Data();
    }

    public void Extract_Data() throws IOException {
        String fname = "data_" + this.username;
        String food_path = "food_data_" + this.username + ".txt";

        File file = new File("C:\\"+food_path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        int i=0;
        ArrayList<String> attr = new ArrayList<>();
        String st;
        while ((st = br.readLine()) != null){
            if (st == "-"){
                if(attr.get(0) == "Meds"){
                    this.p.meds.add(new Meds(attr.get(1), attr.get(2)));
                    i=0;
                }

                if(attr.get(0) == "Dry Food"){
                    this.p.d_food.add(new Dry_Food(attr.get(1), Double.parseDouble(attr.get(2)), Double.parseDouble(attr.get(3)),
                            Double.parseDouble(attr.get(4)), Double.parseDouble(attr.get(5))
                            ,0, 0, Double.parseDouble(attr.get(6)),0,0,0,0,0,0,
                            0,0,0,0,0));
                    i=0;
                }

                if(attr.get(0) == "Junk Food"){
                    this.p.j_food.add(new Junk_Food(attr.get(1), Double.parseDouble(attr.get(2)), Double.parseDouble(attr.get(3)),
                            Double.parseDouble(attr.get(4)), Double.parseDouble(attr.get(5))
                            ,0, 0, Double.parseDouble(attr.get(6)),0,0,0,0,0,0,
                            0,0,0,0,0));
                    i=0;
                }

                if(attr.get(0) == "Vegs"){
                    this.p.veg_food.add(new Veg(attr.get(1), Double.parseDouble(attr.get(2)), Double.parseDouble(attr.get(3)),
                            Double.parseDouble(attr.get(4)), Double.parseDouble(attr.get(5))
                            ,0, 0, Double.parseDouble(attr.get(6)),0,0,0,0,0,0,
                            0,0,0,0,0));
                    i=0;

                }

                if(attr.get(0) == "MFD") {
                    this.p.MFD_food.add(new Meat_Fish_Dai(attr.get(1), Double.parseDouble(attr.get(2)), Double.parseDouble(attr.get(3)),
                            Double.parseDouble(attr.get(4)), Double.parseDouble(attr.get(5))
                            ,0, 0, Double.parseDouble(attr.get(6)),0,0,0,0,0,0,
                            0,0,0,0,0));
                    i=0;
                }

            }

        }


    }

}
