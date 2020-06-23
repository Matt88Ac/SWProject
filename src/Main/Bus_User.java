package Main;

import java.io.IOException;

public class Bus_User extends User{

    private String company;
    private String country;
    private String city;

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


    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }
}
