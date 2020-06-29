package Main.Controller;

import Main.Model.Food;
import Main.Model.Product;
import java.io.*;
import java.util.Scanner;


public class Private_User extends User {
    public Food[] my_collection = new Food[20];
    public int size = 0;

    private double weight;
    private double height;
    private String First_Name;
    private String Last_Name;
    private String Country;
    private String City;
    private double Age;
    private int Gender;
    private int Purpose;
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

        for(int i=0; i<20; i++){
            my_collection[i] = new Food(" ",0,0,0,0,0,0,0,0,0,
                    0,0,0,0,0,0,0,0,0);
        }

        this.Extract_Private_Collection();

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

    public int Get_Path(){ return this.Purpose; }

    public String Get_Username() {
        return this.username;
    }

    public String Get_Password(){
        return this.password;
    }

    public void Extract_Private_Collection() throws IOException {
        String fname = "C:\\data\\food_"  + this.username +".txt";
        File f1 = new File(fname);
        if(f1.createNewFile()){
            return;
        }

        String readF = new Scanner(new File(fname)).useDelimiter("\\A").next();
        String splitHere = "\n";
        String[] tokens = readF.split(this.username);


        int size = tokens.length;
        this.size = size-1;
        for (int i=0; i<size-1; i++){
            String[] data = tokens[i].split(splitHere);
            int flag = 0;
            if (i>0){
                flag = 1;
            }

            this.my_collection[i] = new Food(data[0+flag],
                    Double.valueOf(data[2+flag]), Double.valueOf(data[7+flag]), Double.valueOf(data[3+flag]),
                    Double.valueOf(data[8+flag]), Double.valueOf(data[6+flag]), Double.valueOf(data[9+flag]),
                    Double.valueOf(data[4+flag]), Double.valueOf(data[5+flag]), Double.valueOf(data[10+flag]),
                    Double.valueOf(data[11+flag]), Double.valueOf(data[12+flag]), Double.valueOf(data[13+flag]),
                    Double.valueOf(data[14+flag]), Double.valueOf(data[15+flag]), Double.valueOf(data[16+flag]),
                    Double.valueOf(data[17+flag]), Double.valueOf(data[18+flag]), Double.valueOf(data[19+flag]));
        }

    }

    public String[] Get_Names(){
        String[] names = new String[20];

        for (int i=0; i < this.size; i++){
            names[i] = this.my_collection[i].GetName().toString();
        }

        return names.clone();
    }


    public Food By_Name(String Name) throws CloneNotSupportedException {
        for (int i=0; i< this.size; i++){
            if (this.my_collection[i].GetName() == Name){
                return my_collection[i].clone();
            }
        }
        return null;
    }

}
