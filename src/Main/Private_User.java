package Main;

import java.time.LocalDate;

import java.io.*;

import java.time.LocalDateTime;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
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
    private LocalDateTime last_time_had_sports;
    private double cals_burned_last_week;
    private double hours_of_training_in_week;
    private String path;

    private LocalDateTime last_time_ate;
    public double food_det[];

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

        this.food_det = new double[18];
        for(int i=0; i<18; i++){
            this.food_det[i] = 0;
        }

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

    public void Update_Path(String path){ this.path = path; }

    public void Ate_Dry_food(Dry_Food dry_food){
        this.food_det[0] += dry_food.Get_Detail("Calories");
        this.food_det[1] += dry_food.Get_Detail("Protein");
        this.food_det[2] +=  dry_food.Get_Detail("Coles");
        this.food_det[3] += dry_food.Get_Detail("Salt");
        this.food_det[4] += dry_food.Get_Detail("Fat");
        this.food_det[5] += dry_food.Get_Detail("Sugar");
        this.food_det[6] += dry_food.Get_Detail("Phos");
        this.food_det[7] += dry_food.Get_Detail("Potess");
        this.food_det[8] +=  dry_food.Get_Detail("Mag");
        this.food_det[9] +=  dry_food.Get_Detail("OFat");
        this.food_det[10] += dry_food.Get_Detail("Iron");
        this.food_det[11] +=  dry_food.Get_Detail("VitC");

        this.last_time_ate = LocalDateTime.now();
        


    }

    public void Ate_Veg(Veg dry_food){
        this.food_det[0] += dry_food.Get_Detail("Calories");
        this.food_det[1] += dry_food.Get_Detail("Protein");
        this.food_det[2] +=  dry_food.Get_Detail("Coles");
        this.food_det[3] += dry_food.Get_Detail("Salt");
        this.food_det[4] += dry_food.Get_Detail("Fat");
        this.food_det[5] += dry_food.Get_Detail("Sugar");
        this.food_det[6] += dry_food.Get_Detail("Phos");
        this.food_det[7] += dry_food.Get_Detail("Potess");
        this.food_det[8] +=  dry_food.Get_Detail("Mag");
        this.food_det[9] +=  dry_food.Get_Detail("OFat");
        this.food_det[10] += dry_food.Get_Detail("Iron");
        this.food_det[11] +=  dry_food.Get_Detail("VitC");
        this.last_time_ate = LocalDateTime.now();

    }

    public void Ate_Meat_Fish_Dai(Meat_Fish_Dai dry_food){
        this.food_det[0] += dry_food.Get_Detail("Calories");
        this.food_det[1] += dry_food.Get_Detail("Protein");
        this.food_det[2] +=  dry_food.Get_Detail("Coles");
        this.food_det[3] += dry_food.Get_Detail("Salt");
        this.food_det[4] += dry_food.Get_Detail("Fat");
        this.food_det[5] += dry_food.Get_Detail("Sugar");
        this.food_det[6] += dry_food.Get_Detail("Phos");
        this.food_det[7] += dry_food.Get_Detail("Potess");
        this.food_det[8] +=  dry_food.Get_Detail("Mag");
        this.food_det[9] +=  dry_food.Get_Detail("OFat");
        this.food_det[10] += dry_food.Get_Detail("Iron");
        this.food_det[11] +=  dry_food.Get_Detail("VitC");
        this.last_time_ate = LocalDateTime.now();
        // this.

    }


    public void Ate_Junk_Food(Junk_Food dry_food){
        this.food_det[0] += dry_food.Get_Detail("Calories");
        this.food_det[1] += dry_food.Get_Detail("Protein");
        this.food_det[2] +=  dry_food.Get_Detail("Coles");
        this.food_det[3] += dry_food.Get_Detail("Salt");
        this.food_det[4] += dry_food.Get_Detail("Fat");
        this.food_det[5] += dry_food.Get_Detail("Sugar");
        this.food_det[6] += dry_food.Get_Detail("Phos");
        this.food_det[7] += dry_food.Get_Detail("Potess");
        this.food_det[8] +=  dry_food.Get_Detail("Mag");
        this.food_det[9] +=  dry_food.Get_Detail("OFat");
        this.food_det[10] += dry_food.Get_Detail("Iron");
        this.food_det[11] +=  dry_food.Get_Detail("VitC");
        this.last_time_ate = LocalDateTime.now();

    }


    public  String Get_Path(){ return this.path; }

    public String Get_Username() {
        return this.username;
    }

    public String Get_Password(){
        return this.password;
    }

    public String toString(){
        return "Calories: " + this.toString(this.food_det[0])  + "\n" + "Protain: " + this.toString(this.food_det[1])  + "\n" + "Cholesterol: " +
                this.toString(this.food_det[2]) + "\n" + "Sodium: " + this.toString(this.food_det[3]) + "\n" + "Fat: " +
                this.toString(this.food_det[4]) + "\n" + "Suger: " +  this.toString(this.food_det[5])
            + "\n" + "Phosphorus: " + this.toString(this.food_det[6]) + "\n" + "Potassium: " + this.toString(this.food_det[7])
                + "\n" + "Magnesium: " + this.toString(this.food_det[8])
                + "\n" + "Fatty acids: " + this.toString(this.food_det[9])
                +"\n" + "Iron: " + this.toString(this.food_det[10])
                +"\n" + "Vitamin C:" +  this.toString(this.food_det[11]);
    }

    private String toString(double v) {
        return String.valueOf(v);
    }

}
