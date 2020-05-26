package Main;

public abstract class User {
    public Product p = new Product(true);
    protected String username;
    protected char[] password;

    public User(String us, char[] ps){
        this.password = ps;
        this.username = us;
    }


}
