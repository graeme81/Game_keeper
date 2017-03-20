package example.codeclan.com.game_keeper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.Button;
import android.widget.ImageView;

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
    Bitmap icon;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        mapCanvas = new MapCanvas(displayMetrics, icon);




        buttonKill = (Button) findViewById(R.id.buttonKill);
        buttonTrail = (Button) findViewById(R.id.buttonTrail);
        buttonCarcass = (Button) findViewById(R.id.buttonCarcass);
        buttonSpotted = (Button) findViewById(R.id.buttonSpotted);

        map = (ImageView) findViewById(R.id.mapView);
        map.setImageResource(R.drawable.mapfile);

        buttonKill.setOnClickListener(new NewIconClickListener(mapCanvas));
        buttonTrail.setOnClickListener(new NewIconClickListener(mapCanvas));
        buttonCarcass.setOnClickListener(new NewIconClickListener(mapCanvas));
        buttonSpotted.setOnClickListener(new NewIconClickListener(mapCanvas));


    }
}