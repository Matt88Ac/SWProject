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

}
