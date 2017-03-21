package example.codeclan.com.game_keeper;

<<<<<<< HEAD
import android.graphics.drawable.Drawable;
import android.view.View;


public class NewIconClickListener implements View.OnClickListener {

   private Drawable icon;
    private MapEvent thisEvent;
    @Override
    public void onClick(View view) {
=======
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
>>>>>>> b63f7710e7fb645745229aa57c42d3323c298448

        if (R.id.buttonKill == view.getId()){
//            switch to an activity to set input parameters (see below)
//            thisEvent = new Kill( animalType, String description, String icon, String species, String size, String shotType, String health);

<<<<<<< HEAD
=======

>>>>>>> b63f7710e7fb645745229aa57c42d3323c298448
        };

        if (R.id.buttonTrail == view.getId()){
//            switch to an activity to set input parameters (see below)
<<<<<<< HEAD
//            thisEvent = new Kill( animalType, String description, String icon, String species, String size, String shotType, String health);
=======
//            thisEvent = new Trail( animalType, String description, String icon, String species, String size, String shotType, String health);
>>>>>>> b63f7710e7fb645745229aa57c42d3323c298448

        };

        if (R.id.buttonSpotted == view.getId()){
//            switch to an activity to set input parameters (see below)
<<<<<<< HEAD
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
=======
//            thisEvent = new Spotted( animalType, String description, String icon, String species, String size, String shotType, String health);

        };

        if (R.id.buttonCarcass == view.getId()){
//            switch to an activity to set input parameters (see below)
//            thisEvent = new Carcass( animalType, String description, String icon, String species, String size, String shotType, String health);

        }
    }
}
>>>>>>> b63f7710e7fb645745229aa57c42d3323c298448
