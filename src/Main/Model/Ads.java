package Main.Model;

import Main.Controller.Private_User;
import java.time.LocalTime;

public class Ads {
   private Product Local_Options = new Product(false);
   private int users_purose;
   private Private_User user = null;

   private Ads(Private_User user){
       this.users_purose = user.Get_Path();
       this.user = user;
   }

   private Ads () {}
    private static class AdsHolder {
        private static Ads INSTANCE = null;
    }

    public static Ads getInstance(Private_User user) {
       if (AdsHolder.INSTANCE == null){
           AdsHolder.INSTANCE = new Ads(user);
       }
       return AdsHolder.INSTANCE;
    }

    public String Advertise(boolean consuming_state){
       String ad = null;
        LocalTime t = LocalTime.now();
        //System.out.println(t.getHour());

        System.out.println(consuming_state);
        if (t.getHour() <= 12 && t.getHour() >= 0){

            if (this.users_purose == 0){

                // Male
                if (this.user.Get_gender() == 0){

                    if (consuming_state){
                        ad = "You've had enough for now.\n From now on to the rest of the day,\n ease with vegetables.\n";
                    }

                    else{
                        ad= new String("Our recommendation for you is to settle with an Omelet and Salad,\n or something similar.\n");
                    }


                }

                // Female
                else{
                    if (consuming_state){
                        ad= new String("You've had enough for now.\n From now on to the rest of the day,\n ease with vegetables.\n");
                    }

                    else{
                        ad= new String("Our recommendation for you is to settle with an Omelet and Salad,\n or something similar\n.");
                    }

                }


            }

        }

        else if (t.getHour() <= 18 && t.getHour() >= 12) {
            if (this.users_purose == 0){
                if (consuming_state){

                    ad= new String("Well, you've had enough for today.\n If you're gonna be staying up late," +
                            "have a green salad or any other small meal.\n Otherwise, call it a day.\n");

                }

                else{
                    ad= new String("Now is your time.\n Consume carbohydrates and calories as much as you can.\n" +
                            "Seriously though, low-fat-meat with some form of potatoes is what you need right now,\n" +
                            "in order finishing up this day right.\n Pay attention to the calories counter.\n");
                }

            }

            // Stay as is.
            else if (this.users_purose == 1){
                if (consuming_state){
                    ad= new String("Since you check out what's going on here,\n " +
                            "we'll take the guess that you're hungry.\n If you're gonna be staying up late," +
                            " you could allow yourself a decent meal.\n Otherwise, every raw veg's salad would " +
                            "get the job done for you.\n");

                }

                else{
                    ad= new String("A large meal seems to be the right thing to do right now.\n " +
                            "Try to involve meat or dairies,\n dehydrated foods high in carbohydrate and vegetables.\n");
                }


            }

            // Gain weight.
            else{

                if (consuming_state){
                    ad= new String("You're at the right way now.\n Rationally, you could have whatever you " +
                            "fancy at this point.\n Our suggestion: One last large meal before you wrap your da up.\n" +
                            " Involve meat or dairies, dehydrated foods high in carbohydrate, and vegetables.\n");
                }

                else ad= new String("At this point, you gotta pick up the pace of your daily-calories-" +
                        "consuming, in order to achieve your goal.\n Our suggestion:" +
                        " A real large meal, full of fat and calories.\n Something like a Hamburger, a Pizza " +
                        "or s steak with potatoes in your favorite form.\n");


            }
        }

       else{

            if (this.users_purose == 0){
                if (consuming_state){

                    ad= new String("Well, you've had enough for today.\n If you're gonna be staying up late," +
                            "have a green salad or any other small meal.\n Otherwise, call it a day.\n");

                }

                else{
                    ad= new String("Now is your time.\n Consume carbohydrates and calories as much as you" +
                            " can.\n Seriously though, low-fat-meat with some form of potatoes is what you need right now, in" +
                            " order finishing up this day right.\n Pay attention to the calories counter.\n");
                }

            }

            // Stay as is.
            else if (this.users_purose == 1){
                if (consuming_state){
                    ad= new String("Since you check out what's going on here, we'll" +
                            " take the guess that you're hungry.\n If you're gonna be staying up late," +
                            " you could allow yourself a decent meal.\n Otherwise, every raw veg's salad would " +
                            "get the job done for you.\n");

                }

                else{
                    ad= new String("A large meal seems to be the right thing to do right now.\n" +
                            "Try to involve meat or dairies,\n dehydrated foods high in carbohydrate, and vegetables.\n");
                }


            }

            // Gain weight.
            else{

                if (consuming_state){
                    ad= new String("You're at the right way now.\n Rationally, you could have whatever you " +
                            "fancy at this point.\n Our suggestion: One last large meal before you wrap your da up.\n" +
                            " Involve meat or dairies, dehydrated foods high in carbohydrate, and vegetables.\n");
                }

                else{
                    ad= new String("At this point, you gotta pick up the pace of your daily-calories-" +
                            "consuming, in order to achieve your goal.\n Our suggestion:" +
                            " A real large meal, full of fat and calories.\n Something like a Hamburger, a Pizza " +
                            "or s steak with potatoes in your favorite form.\n");
                }


            }


        }

       return ad;
    }

    public void SetNull(){
       AdsHolder.INSTANCE = null;
    }



}
