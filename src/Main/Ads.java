package Main;

public class Ads {
   private Product Local_Options = new Product(false);
   private int users_purose;

   private Ads(Private_User user){
       this.users_purose = user.Get_Path();
   }

   private Ads () {}

    private static class AdsHolder {
        private static Ads INSTANCE = null;

    }

    public static Ads getInstance(Private_User user) {
       AdsHolder.INSTANCE = new Ads(user);
       return AdsHolder.INSTANCE;
    }

    public String[] Advertise(double calories_ate){
       String[] ad = new String[10];

       if (this.users_purose == 0){

           

       }

       else if (this.users_purose == 1){

       }

       else{

       }

       return ad;
    }





}
