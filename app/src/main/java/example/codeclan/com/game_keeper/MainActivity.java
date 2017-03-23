package example.codeclan.com.game_keeper;

import android.content.Context;
import android.content.Intent;
<<<<<<< HEAD
=======
import android.content.MutableContextWrapper;
import android.content.res.Resources;
>>>>>>> develop
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;

import java.util.Vector;


import static java.security.AccessController.getContext;

/**
 * Created by user on 17/03/2017.
 */

public class MainActivity extends AppCompatActivity {

//    ZoomImage map;
    ImageView map;
    Button buttonKill;
    Button buttonTrail;
    Button buttonCarcass;
    Button buttonSpotted;
    MapCanvas mapCanvas;

    Intent intent;

    MapEvent mapEvent;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        Context context = this;

        View view = (MapCanvas) findViewById(R.id.mapView);
        Drawable drawable = VectorDrawableCompat.create(context.getResources(), R.drawable.mapfile, context.getTheme());
        view.setBackground(drawable);



//        map = (ImageView) findViewById(R.id.mapView);
//        map.setImageResource(R.drawable.mapfile);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);


        mapCanvas = new MapCanvas(context, this);




        buttonKill = (Button) findViewById(R.id.buttonKill);
        buttonTrail = (Button) findViewById(R.id.buttonTrail);
        buttonCarcass = (Button) findViewById(R.id.buttonCarcass);
        buttonSpotted = (Button) findViewById(R.id.buttonSpotted);



        buttonKill.setOnClickListener(new NewIconClickListener(mapCanvas, this));
        buttonTrail.setOnClickListener(new NewIconClickListener(mapCanvas,this));
        buttonCarcass.setOnClickListener(new NewIconClickListener(mapCanvas, this));
        buttonSpotted.setOnClickListener(new NewIconClickListener(mapCanvas, this));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_tracking_calls) {

            intent = new Intent(this, Calls.class);
            startActivity(intent);

        }else if (item.getItemId()== R.id.action_calendar){

            intent = new Intent(this, Calendar.class);
            startActivity(intent);

            // Toast.makeText(this, "burnt toast", Toast.LENGTH_SHORT).show();

        } else if (item.getItemId() == R.id.action_reset) {

            Toast.makeText(this, "jammy toast", Toast.LENGTH_SHORT).show();

        }

        return super.onOptionsItemSelected(item);
    }



    protected void onRestart(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         if(mapCanvas.getClicked()) {
             Log.d("","checks from main if clicked is true");
             Intent toMap = getIntent();
             mapEvent = (MapEvent) toMap.getSerializableExtra("MAPICON");
             Log.d(mapEvent.toString(),"mapEvent");
         }
     }


}