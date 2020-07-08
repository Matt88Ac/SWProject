package Main.Model;


import Main.Controller.Private_User;


import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Eating_Stats {
    public double[] stats;
    private int users_purp;
    private boolean calories = false;
    private boolean sod = false;
    private boolean fat = false;
    private boolean prot = false;
    private boolean col = false;
    private boolean pah = false;

    private double users_age;
    private int users_gender;
    private double users_h;
    private double users_w;
    private String username;

    public Eating_Stats(Private_User user) throws IOException {
        this.stats = new double[18];
        this.users_age = user.Get_Age();
        this.users_purp = user.Get_Path();
        this.users_gender = user.Get_gender();
        this.users_h = user.Get_Hei();
        this.users_w = user.Get_Weig();
        this.username = user.Get_Username();

        LocalDate t = LocalDate.now();
        String fname = "C:\\data\\stats_" + this.username +".txt";
        File file1 = new File(fname);
        if (file1.createNewFile()){
            for(int i=0; i<18; i++) {
                this.stats[i] = 0;
            }

            FileWriter data = new FileWriter("C:\\data\\stats_" + this.username + ".txt");
            data.write(t.toString() + '\n' + "0"
                    + '\n' + "0"
                    + '\n' + "0"
                    + '\n' + "0"
                    + '\n' + "0"
                    + '\n' + "0"
                    + '\n' +"0"
                    + '\n' + "0"
                    + '\n' + "0"
                    + '\n' + "0"
                    + '\n' + "0"
                    + '\n' + "0"
            );
            data.close();
        }

        else {
            String readF = new Scanner(new File(fname)).useDelimiter("\\A").next();
            String splitHere = "\n";
            String[] tokens = readF.split(splitHere);

            String ltd = tokens[0];

            if (!t.toString().equals(ltd)) {
                for (int i = 0; i < 18; i++) {
                    this.stats[i] = 0;
                }

                FileWriter data = new FileWriter("C:\\data\\stats_" + this.username + ".txt");
                data.write(t.toString() + '\n' + "0"
                        + '\n' + "0"
                        + '\n' + "0"
                        + '\n' + "0"
                        + '\n' + "0"
                        + '\n' + "0"
                        + '\n' + "0"
                        + '\n' + "0"
                        + '\n' + "0"
                        + '\n' + "0"
                        + '\n' + "0"
                        + '\n' + "0"
                );

                data.close();
            }
            else {
                for (int i = 1; i < 13; i++) {
                    this.stats[i - 1] = Double.valueOf(tokens[i]);
                }
            }

        }

        this.exeptions_check();

    }

    public void Ate(Food food) throws IOException {
        this.stats[0] += food.Get_Detail("Calories");
        this.stats[1] += food.Get_Detail("Protein");
        this.stats[2] +=  food.Get_Detail("Coles");
        this.stats[3] += food.Get_Detail("Salt");
        this.stats[4] += food.Get_Detail("Fat");
        this.stats[5] += food.Get_Detail("Sugar");
        this.stats[6] += food.Get_Detail("Phos");
        this.stats[7] += food.Get_Detail("Potess");
        this.stats[8] +=  food.Get_Detail("Mag");
        this.stats[9] +=  food.Get_Detail("Carbo");
        this.stats[10] += food.Get_Detail("Iron");
        this.stats[11] +=  food.Get_Detail("VitC");

        this.exeptions_check();

        LocalDate t = LocalDate.now();
        FileWriter data = new FileWriter("C:\\data\\stats_" + this.username + ".txt");
        data.write(t.toString() + '\n' + this.stats[0]
                + '\n' + this.stats[1]
                + '\n' + this.stats[2]
                + '\n' + this.stats[3]
                + '\n' + this.stats[4]
                + '\n' + this.stats[5]
                + '\n' + this.stats[6]
                + '\n' + this.stats[7]
                + '\n' + this.stats[8]
                + '\n' + this.stats[9]
                + '\n' + this.stats[10]
                + '\n' + this.stats[11]
        );

        data.close();
    }

    public void exeptions_check(){
        double BMR;

        if (this.users_gender == 0){
            BMR = 10*this.users_w + 6.25*this.users_h -5*this.users_age + 5;
        }

        else{
            BMR = 10*this.users_w + 6.25*this.users_h -5*this.users_age - 161;
        }

        if (BMR*1.2 < this.stats[0] ||  this.stats[0] < 0){
            this.calories = true;
        }

        else {
            this.calories = false;
        }


        if(stats[3] >= 2000){
            this.sod = true;
        }

        else{
            this.sod = false;
        }

        if (stats[1] >= 70){
            this.prot = true;
        }

        else{
            this.prot = false;
        }

        if (stats[4] > 111){
            this.fat = true;
        }

        else{
            this.fat = false;
        }

        if (stats[9] > 3*this.users_w){
            this.pah = true;
        }

        else{
            this.pah = false;
        }

        if( stats[2] > 150){
            this.col = true;
        }

        else {
            this.col = false;
        }
    }





    public boolean Get_Status_cal(){
        return this.calories;
    }

    public boolean Get_Status_sod(){
        return this.sod;
    }

    public boolean Get_Status_prot(){ return this.prot; }

    public boolean Get_Status_fat(){
        return this.fat;
    }

    public boolean Get_Status_pah(){
        return this.pah;
    }

    public boolean Get_Status_co(){
        return this.col;
    }

    public void Activity(int steps) throws IOException {
        this.stats[0] -= steps*0.05;
        this.exeptions_check();
        LocalDate t = LocalDate.now();
        FileWriter data = new FileWriter("C:\\data\\stats_" + this.username + ".txt");
        data.write(t.toString() + '\n' + this.stats[0]
                + '\n' + this.stats[1]
                + '\n' + this.stats[2]
                + '\n' + this.stats[3]
                + '\n' + this.stats[4]
                + '\n' + this.stats[5]
                + '\n' + this.stats[6]
                + '\n' + this.stats[7]
                + '\n' + this.stats[8]
                + '\n' + this.stats[9]
                + '\n' + this.stats[10]
                + '\n' + this.stats[11]
        );

        data.close();

    }

    public void Burned_Calories(double cals) throws IOException {
        this.stats[0] -= cals;
        this.exeptions_check();

        LocalDate t = LocalDate.now();
        FileWriter data = new FileWriter("C:\\data\\stats_" + this.username + ".txt");
        data.write(t.toString() + '\n' + this.stats[0]
                + '\n' + this.stats[1]
                + '\n' + this.stats[2]
                + '\n' + this.stats[3]
                + '\n' + this.stats[4]
                + '\n' + this.stats[5]
                + '\n' + this.stats[6]
                + '\n' + this.stats[7]
                + '\n' + this.stats[8]
                + '\n' + this.stats[9]
                + '\n' + this.stats[10]
                + '\n' + this.stats[11]
        );

        data.close();
    }



    public String toString(){
        return "Calories: " + this.toString(this.stats[0])  + "\n" + "Protain: " + this.toString(this.stats[1])  + "\n" + "Cholesterol: " +
                this.toString(this.stats[2]) + "\n" + "Sodium: " + this.toString(this.stats[3]) + "\n" + "Fat: " +
                this.toString(this.stats[4]) + "\n" + "Suger: " +  this.toString(this.stats[5])
                + "\n" + "Phosphorus: " + this.toString(this.stats[6]) + "\n" + "Potassium: " + this.toString(this.stats[7])
                + "\n" + "Magnesium: " + this.toString(this.stats[8])
                + "\n" + "Fatty acids: " + this.toString(this.stats[9])
                +"\n" + "Iron: " + this.toString(this.stats[10])
                +"\n" + "Vitamin C:" +  this.toString(this.stats[11]);
    }

    private String toString(double v) {
        return String.valueOf(v);
    }

}
