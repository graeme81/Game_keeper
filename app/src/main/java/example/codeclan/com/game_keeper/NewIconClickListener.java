package example.codeclan.com.game_keeper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


public class NewIconClickListener implements View.OnClickListener{

    private Drawable icon;
    private MapEvent thisEvent;
    Canvas map;

    public NewIconClickListener(Canvas map){
        this.map = map;
    }

    @Override
    public void onClick(View view) {
        
        this.map.setOnTouchListener(new PlaceIconListener());
        Log.d(this.map.toString(), "where it is going");

        if (R.id.buttonKill == view.getId()){
//            switch to an activity to set input parameters (see below)
//            thisEvent = new Kill( animalType, String description, String icon, String species, String size, String shotType, String health);


        };

        if (R.id.buttonTrail == view.getId()){
//            switch to an activity to set input parameters (see below)
//            thisEvent = new Trail( animalType, String description, String icon, String species, String size, String shotType, String health);

        };

        if (R.id.buttonSpotted == view.getId()){
//            switch to an activity to set input parameters (see below)
//            thisEvent = new Spotted( animalType, String description, String icon, String species, String size, String shotType, String health);

        };

        if (R.id.buttonCarcass == view.getId()){
//            switch to an activity to set input parameters (see below)
//            thisEvent = new Carcass( animalType, String description, String icon, String species, String size, String shotType, String health);

        }
    }
}