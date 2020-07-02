package Main.Model;

import Main.Controller.Private_User;

import java.sql.Time;
import java.time.LocalTime;
import java.time.LocalTime.*;


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
        if (t.getHour() <= 12){

            if (this.users_purose == 0){

                // Male
                if (this.user.Get_gender() == 0){

                    if (consuming_state){
                        ad = new String("You've had enough for now. From now on to the rest of the day, ease with vegetables.");
                    }

                    else{
                        ad = new String("Our recommendation for you is to settle with an Omelet and Salad, or something similar.");
                    }


                }

                // Female
                else{
                    if (consuming_state){
                        ad = new String("You've had enough for now. From now on to the rest of the day, ease with vegetables.");
                    }

                    else{
                        ad = new String("Our recommendation for you is to settle with an Omelet and Salad, or something similar.");
                    }

                }


            }

            // Stay as is.
            else if (this.users_purose == 1){

                // Male
                if (this.user.Get_gender() == 0){




                }

                // Female
                else{




                }


            }

            // Gain weight.
            else{

                // Male
                if (this.user.Get_gender() == 0){



                }

                // Female
                else{



                }

            }

        }

        else if ( 12 < t.getHour() && t.getHour() <= 18) {
            if (this.users_purose == 0){

                // Male
                if (this.user.Get_gender() == 0){



                }

                // Female
                else{



                }


            }

            // Stay as is.
            else if (this.users_purose == 1){

                // Male
                if (this.user.Get_gender() == 0){




                }

                // Female
                else{




                }


            }

            // Gain weight.
            else{

                // Male
                if (this.user.Get_gender() == 0){



                }

                // Female
                else{



                }

            }
        }

       else{

            if (this.users_purose == 0){



            }

            // Stay as is.
            else if (this.users_purose == 1){




            }

            // Gain weight.
            else{

            }


        }

       return ad;
    }

    public void SetNull(){
       AdsHolder.INSTANCE = null;
    }



}
