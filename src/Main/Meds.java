package Main;

public class Meds {
    private String Name;
    private String What_For;

    public Meds(String N, String W){
        this.What_For = W;
        this.Name = N;
    }

    public String Get_Name(){
        return this.Name;
    }

    public String Get_W(){
        return this.What_For;
    }
}
