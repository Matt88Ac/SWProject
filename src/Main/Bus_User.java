package Main;

public class Bus_User extends User{

    private String company;

    public Bus_User(String us, String ps, String company) {
        super(us, ps);
        this.company = company;
    }

    public String Get_Company_Name(){
        return this.company;
    }

    public String Get_Username() {
        return this.username;
    }

    public String Get_Password(){
        return this.password;
    }

    public void Add_Product_To_Sell_List(){

        Meds meds = null;
        Veg veg = null;
        Meat_Fish_Dai mfd = null;
        Dry_Food dry_food = null;
        Junk_Food junk_food = null;



        /*

        Gotta add selection choices and stuff like that.


         */
    }

    public void Pull_Product_Out(String name, String type){
        if (type == "Veg"){
            for (Veg veg:this.p.veg_food) {
                if (veg.GetName() == name){
                    this.p.veg_food.remove(veg);
                    return;
                }
            }
        }

        else if (type == "Meds"){
            for (Meds meds:this.p.meds) {
                if (meds.Get_Name() == name){
                    this.p.veg_food.remove(meds);
                    return;
                }
            }
        }

        else if(type == "Meat_Fish_Dai"){
            for (Meat_Fish_Dai mfd:this.p.MFD_food) {
                if (mfd.GetName() == name) {
                    this.p.veg_food.remove(mfd);
                    return;
                }
            }
        }

        else if (type == "Dry Food"){

            for (Dry_Food dry_food:this.p.d_food) {
                if (dry_food.GetName() == name){
                    this.p.veg_food.remove(dry_food);
                    return;
                }
            }

        }

        else if(type == "Junk Food"){
            for (Junk_Food junk_food:this.p.j_food) {
                if (junk_food.GetName() == name){
                    this.p.veg_food.remove(junk_food);
                    return;
                }
            }

        }


    }

}
