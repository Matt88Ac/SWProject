package Main;

import java.io.IOException;

public class Bus_User extends User{

    private String company;
    private String country;
    private String city;
    private String path = null;

    public Bus_User(String us, String ps, String company, String city, String country) throws IOException {
        super(us, ps);
        this.company = company;
        this.city = city;
        this.country = country;

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
        if (this.path == null){
            return;
        }
        Meds meds = null;
        Veg veg = null;
        Meat_Fish_Dai mfd = null;
        Dry_Food dry_food = null;
        Junk_Food junk_food = null;



        /*

        Gotta add selection choices and stuff like that.


         */
    }

    public void setPath(String path){
        this.path = path;
    }

    public String getPath(){
        return this.path;
    }

    public void Pull_Product_Out(String name, String type){
        if(this.path == null){
            return;
        }

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

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }
}
