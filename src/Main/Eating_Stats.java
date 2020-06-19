package Main;

import java.time.LocalDateTime;

public class Eating_Stats {
    public double[] stats;
    private int users_purp;
    private int exeptional_eating = 0;
    private double users_age;
    private int users_gender;
    private double users_h;
    private double users_w;

    public Eating_Stats(Private_User user){
        this.stats = new double[18];
        this.users_age = user.Get_Age();
        this.users_purp = user.Get_Path();
        this.users_gender = user.Get_gender();
        this.users_h = user.Get_Hei();
        this.users_w = user.Get_Weig();

        for(int i=0; i<18; i++) {
            this.stats[i] = 0;
        }
    }

    public void Ate_Dry_food(Dry_Food dry_food){
        this.stats[0] += dry_food.Get_Detail("Calories");
        this.stats[1] += dry_food.Get_Detail("Protein");
        this.stats[2] +=  dry_food.Get_Detail("Coles");
        this.stats[3] += dry_food.Get_Detail("Salt");
        this.stats[4] += dry_food.Get_Detail("Fat");
        this.stats[5] += dry_food.Get_Detail("Sugar");
        this.stats[6] += dry_food.Get_Detail("Phos");
        this.stats[7] += dry_food.Get_Detail("Potess");
        this.stats[8] +=  dry_food.Get_Detail("Mag");
        this.stats[9] +=  dry_food.Get_Detail("Carbo");
        this.stats[10] += dry_food.Get_Detail("Iron");
        this.stats[11] +=  dry_food.Get_Detail("VitC");

        this.exeptions_check();

    }

    public void Ate_Veg(Veg dry_food){
        this.stats[0] += dry_food.Get_Detail("Calories");
        this.stats[1] += dry_food.Get_Detail("Protein");
        this.stats[2] +=  dry_food.Get_Detail("Coles");
        this.stats[3] += dry_food.Get_Detail("Salt");
        this.stats[4] += dry_food.Get_Detail("Fat");
        this.stats[5] += dry_food.Get_Detail("Sugar");
        this.stats[6] += dry_food.Get_Detail("Phos");
        this.stats[7] += dry_food.Get_Detail("Potess");
        this.stats[8] +=  dry_food.Get_Detail("Mag");
        this.stats[9] +=  dry_food.Get_Detail("Carbo");
        this.stats[10] += dry_food.Get_Detail("Iron");
        this.stats[11] +=  dry_food.Get_Detail("VitC");

        this.exeptions_check();

    }

    public void Ate_Meat_Fish_Dai(Meat_Fish_Dai dry_food){
        this.stats[0] += dry_food.Get_Detail("Calories");
        this.stats[1] += dry_food.Get_Detail("Protein");
        this.stats[2] +=  dry_food.Get_Detail("Coles");
        this.stats[3] += dry_food.Get_Detail("Salt");
        this.stats[4] += dry_food.Get_Detail("Fat");
        this.stats[5] += dry_food.Get_Detail("Sugar");
        this.stats[6] += dry_food.Get_Detail("Phos");
        this.stats[7] += dry_food.Get_Detail("Potess");
        this.stats[8] +=  dry_food.Get_Detail("Mag");
        this.stats[9] +=  dry_food.Get_Detail("Carbo");
        this.stats[10] += dry_food.Get_Detail("Iron");
        this.stats[11] +=  dry_food.Get_Detail("VitC");

        this.exeptions_check();


    }


    public void Ate_Junk_Food(Junk_Food dry_food){
        this.stats[0] += dry_food.Get_Detail("Calories");
        this.stats[1] += dry_food.Get_Detail("Protein");
        this.stats[2] +=  dry_food.Get_Detail("Coles");
        this.stats[3] += dry_food.Get_Detail("Salt");
        this.stats[4] += dry_food.Get_Detail("Fat");
        this.stats[5] += dry_food.Get_Detail("Sugar");
        this.stats[6] += dry_food.Get_Detail("Phos");
        this.stats[7] += dry_food.Get_Detail("Potess");
        this.stats[8] +=  dry_food.Get_Detail("Mag");
        this.stats[9] +=  dry_food.Get_Detail("Carbo");
        this.stats[10] += dry_food.Get_Detail("Iron");
        this.stats[11] +=  dry_food.Get_Detail("VitC");

        this.exeptions_check();

    }

    public void exeptions_check(){
        double BMR;

        if (this.users_gender == 0){
            BMR = 10*this.users_w + 6.25*this.users_h -5*this.users_age + 5;
        }


        else{
            BMR = 10*this.users_w + 6.25*this.users_h -5*this.users_age - 161;
        }

        if (BMR*1.2 > this.stats[0]|| BMR*1.2 < this.stats[0]){
            this.exeptional_eating = 0;
        }

        this.exeptional_eating = 1;
    }

    public int Get_Status(){
        return this.exeptional_eating;
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