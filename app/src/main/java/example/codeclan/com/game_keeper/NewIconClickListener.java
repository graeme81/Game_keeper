package example.codeclan.com.game_keeper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import static android.R.attr.left;


public class NewIconClickListener implements View.OnClickListener{

    private int icon;
    private MapEvent thisEvent;
    MapCanvas map;
    Activity main;

    public NewIconClickListener(MapCanvas map, Activity main){
        this.map = map;
        this.main = main;


    }

    public  void writePrefs(int icon){
        SharedPreferences sharedPref = this.main.getPreferences(Context.MODE_PRIVATE);
        sharedPref.edit().clear().commit();


        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putInt("saved_icon", icon );
        editor.putBoolean("saved_click", true);

        editor.commit();
    }



    @Override
    public void onClick(View view) {

        if (R.id.buttonTrail == view.getId()){
            icon = R.drawable.trail;
            this.map.setIcon();
            writePrefs(icon);
            Intent inputIntent = new Intent(this.main, InputLiveActivity.class);
            inputIntent.putExtra("ICON", "trail");
            this.main.startActivity(inputIntent);


        };

        if (R.id.buttonSpotted == view.getId()){
            icon = R.drawable.spotted;
            this.map.setIcon();
            writePrefs(icon);
            Intent inputIntent = new Intent(this.main, InputLiveActivity.class);
            inputIntent.putExtra("ICON", "spotted");
                
            this.main.startActivity(inputIntent);
        };

        if (R.id.buttonCarcass == view.getId()){
            icon = R.drawable.carcass;
            this.map.setIcon();
            writePrefs(icon);
            Intent inputIntent = new Intent(this.main, InputDeadActivity.class);
            inputIntent.putExtra("ICON", "carcass");
            this.main.startActivity(inputIntent);
        };

        if (R.id.buttonKill == view.getId()){
            icon = R.drawable.kill;
            this.map.setIcon();
            writePrefs(icon);
            Intent inputIntent = new Intent(this.main, InputDeadActivity.class);
            inputIntent.putExtra("ICON", "kill");
            this.main.startActivity(inputIntent);

        };


    }
}