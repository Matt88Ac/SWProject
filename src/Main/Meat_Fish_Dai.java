package Main;

public class Meat_Fish_Dai {
    private String Name;
    private double cal;
    private double prot_g;
    private double fat_g;
    private double suger_g;
    private double carbo_g;
    private double overfat_g;
    private double colesterol_mg;
    private double salt_mg;
    private double sibs_g;
    private double water_g;
    private double vitamins_C_mg;
    private double vitamins_b9_micro_g;
    private double iron_mg;
    private double calcium_mg;
    private double magnis_mg;
    private double phos_mg;
    private double zinc_mg;
    private double potassium_mg;

    public Meat_Fish_Dai(String name, double Cal, double Prot, double Fat, double sug, double carbo, double ofat, double coles,
                         double salt, double sib, double water, double vitC, double vitb9, double iro, double calcium,
                         double mag, double pho, double zinc, double potas){

        this.Name = name;
        this.cal = Cal;
        this.calcium_mg = calcium;
        this.carbo_g = carbo;
        this.colesterol_mg = coles;
        this.fat_g = Fat;
        this.magnis_mg = mag;
        this.vitamins_b9_micro_g = vitb9;
        this.vitamins_C_mg = vitC;
        this.water_g = water;
        this.potassium_mg = potas;
        this.phos_mg = pho;
        this.sibs_g = sib;
        this.prot_g = Prot;
        this.suger_g = sug;
        this.overfat_g = ofat;
        this.salt_mg = salt;
        this.iron_mg = iro;
        this.zinc_mg = zinc;
    }

    public String GetName(){
        return this.Name;
    }

    public double Get_Detail(String which_one){

        if (which_one == "Calories"){
            return this.cal;
        }

        else if (which_one == "Iron"){
            return this.iron_mg;
        }

        else if (which_one == "VitC"){
            return this.vitamins_C_mg;
        }

        else if (which_one == "vitB9"){
            return this.vitamins_b9_micro_g;
        }

        else if (which_one == "Fat"){
            return this.fat_g;
        }

        else if (which_one == "OFat"){
            return this.overfat_g;
        }

        else if (which_one == "Mag"){
            return this.magnis_mg;
        }

        else if (which_one == "Salt"){
            return this.salt_mg;
        }

        else if (which_one == "Sugar"){
            return this.suger_g;
        }
        else if (which_one == "Sibs"){
            return this.sibs_g;
        }

        else if (which_one == "Potess"){
            return this.potassium_mg;
        }

        else if (which_one == "Protein"){
            return this.prot_g;
        }

        else if (which_one == "Phos"){
            return this.phos_mg;
        }

        else if (which_one == "Water"){
            return this.water_g;
        }

        else if (which_one == "Coles"){
            return this.colesterol_mg;
        }

        else if (which_one == "Calcium"){
            return this.calcium_mg;
        }

        return this.zinc_mg;
    }

}
