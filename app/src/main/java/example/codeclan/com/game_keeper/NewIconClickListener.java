package example.codeclan.com.game_keeper;

import android.graphics.drawable.Drawable;
import android.view.View;


public class NewIconClickListener implements View.OnClickListener {

   private Drawable icon;
    private MapEvent thisEvent;
    @Override
    public void onClick(View view) {

        if (R.id.buttonKill == view.getId()){
//            switch to an activity to set input parameters (see below)
//            thisEvent = new Kill( animalType, String description, String icon, String species, String size, String shotType, String health);

        };

        if (R.id.buttonTrail == view.getId()){
//            switch to an activity to set input parameters (see below)
//            thisEvent = new Kill( animalType, String description, String icon, String species, String size, String shotType, String health);

        };

        if (R.id.buttonSpotted == view.getId()){
//            switch to an activity to set input parameters (see below)
//            thisEvent = new Kill( animalType, String description, String icon, String species, String size, String shotType, String health);

        };
        if (R.id.buttonDisease == view.getId()){
//            switch to an activity to set input parameters (see below)
//            thisEvent = new Kill( animalType, String description, String icon, String species, String size, String shotType, String health);

        }
        if (R.id.buttonCarcass == view.getId()){
//            switch to an activity to set input parameters (see below)
//            thisEvent = new Kill( animalType, String description, String icon, String species, String size, String shotType, String health);

        }
    }
}
