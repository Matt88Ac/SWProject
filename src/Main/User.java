package Main;

public abstract class User {
    public Product p = new Product(true);
    protected String username;
    protected String password;

    public User(String us, String ps){
        this.password = ps;
        this.username = us;
    }


}
