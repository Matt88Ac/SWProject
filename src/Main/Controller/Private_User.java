package Main.Controller;

import Main.Model.Product;

import java.time.LocalDate;

import java.io.*;

import java.time.LocalDateTime;



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
        this.Purpose = Purpose;//2 for Gain Weight ,1 for Stay at the same weight ,0 for lose weight

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

    public void Activity(int steps){
        this.last_time_had_sports = LocalDateTime.now();
    }

    public void Burned_Calories(double cals){
        this.last_time_had_sports = LocalDateTime.now();
    }


    public int Get_Path(){ return this.Purpose; }

    public String Get_Username() {
        return this.username;
    }

    public String Get_Password(){
        return this.password;
    }
}
