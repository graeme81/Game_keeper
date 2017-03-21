package example.codeclan.com.game_keeper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import static android.R.attr.left;


public class NewIconClickListener implements View.OnClickListener{

    private Drawable icon;
    private MapEvent thisEvent;
    MapCanvas map;
    Activity main;

    public NewIconClickListener(MapCanvas map, Activity main){
        this.map = map;
        this.main = main;
    }

    @Override
    public void onClick(View view) {

        if (R.id.buttonTrail == view.getId()){
            icon = this.main.getResources().getDrawable(R.drawable.trail);
            this.map.setIcon(icon);
            Intent inputIntent = new Intent(this.main, InputLiveActivity.class);
            inputIntent.putExtra("ICON", "trail");
            this.main.startActivity(inputIntent);

        };

        if (R.id.buttonSpotted == view.getId()){
            icon = this.main.getResources().getDrawable(R.drawable.spotted);
            this.map.setIcon(icon);
            Intent inputIntent = new Intent(this.main, InputLiveActivity.class);
            inputIntent.putExtra("ICON", "spotted");
            this.main.startActivity(inputIntent);
        };

        if (R.id.buttonCarcass == view.getId()){
            icon = this.main.getResources().getDrawable(R.drawable.carcass);
            this.map.setIcon(icon);
            Intent inputIntent = new Intent(this.main, InputDeadActivity.class);
            inputIntent.putExtra("ICON", "carcass");
            this.main.startActivity(inputIntent);
        };

        if (R.id.buttonKill == view.getId()){
            icon = this.main.getResources().getDrawable(R.drawable.kill);
            this.map.setIcon(icon);
            Intent inputIntent = new Intent(this.main, InputDeadActivity.class);
            inputIntent.putExtra("ICON", "kill");
            this.main.startActivity(inputIntent);

        };


    }
}