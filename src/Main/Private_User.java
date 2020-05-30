package Main;
import java.time.LocalDate;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Private_User extends User {
    public Product all_prod = new Product(false);
    private double weight;
    private double height;
    private String First_Name;
    private String Last_Name;
    private String Country;
    private String City;
    private double Age;
    private int Gender;
    private int Purpose;
    private LocalDate last_time_had_sports;
    private double cals_burned_last_week;
    private double hours_of_training_in_week;
    private String path;

    public Private_User(String us /*username*/, String ps /*password*/,
                        double weight, double height, String fname, String last_Name, String country, String city,
                        double age, int gender,int Purpose) throws IOException{
        super(us, ps);
        this.First_Name = fname;
        this.height = height;
        this.weight = weight;
        this.Last_Name = last_Name;
        this.Age = age;
        this.City = city;
        this.Country = country;
        this.Gender = gender; // 1 for a female , 0 for a male ;
        this.Purpose = Purpose;//2 for Gain Weight ,1 for Stay at the same weight ,0 for  lose weight
        this.path = null;
        this.cals_burned_last_week = 0;
        this.last_time_had_sports = null;
        this.hours_of_training_in_week = 0;

    }

    public String Get_fname(){
        return this.First_Name;
    }

    public String Get_lname(){
        return this.Last_Name;
    }

    public String Get_City(){
        return this.City;
    }

    public String Get_Country(){
        return this.Country;
    }

    public int Get_gender(){
        return this.Gender;
    }

    public double Get_Hei(){
        return this.height;
    }

    public double Get_Age(){
        return this.Age;
    }

    public double Get_Weig(){
        return this.weight;
    }

    public void Add_product_to_private_list(){
        Meds meds = null;
        Veg veg = null;
        Meat_Fish_Dai mfd = null;
        Dry_Food dry_food = null;
        Junk_Food junk_food = null;



        /*

        Gotta add selection choices and stuff like that.


         */
    }

    public void Update_Path(String path){ this.path = path; }

    public  String Get_Path(){ return this.path; }

    public String Get_Username() {
        return this.username;
    }

    public String Get_Password(){
        return this.password;
    }

    public void had_sports(double calories_burned, double training_duration_in_hours){
        this.last_time_had_sports = LocalDate.now();
    }

    public void Extract_Data() throws IOException {
        if(this.path == null){ return; }
        String fname = "data_" + this.username;
        String food_path = "food_data_" + this.username + ".txt";

        File file = new File(this.path+"\\"+food_path);
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
