package example.codeclan.com.game_keeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by user on 17/03/2017.
 */

public class MainActivity extends AppCompatActivity {
    ZoomImage zoomedImage;
    ImageView map;

     Button buttonKill;
     Button buttonTrail;
     Button buttonCarcass;
     Button buttonSpotted;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        buttonKill = (Button) findViewById(R.id.buttonKill);
        buttonTrail = (Button) findViewById(R.id.buttonTrail);
        buttonCarcass = (Button) findViewById(R.id.buttonCarcass);
        buttonSpotted = (Button) findViewById(R.id.buttonSpotted);

        zoomedImage = (ZoomImage) findViewById(R.id.mapView);
        map = (ImageView) findViewById(R.id.mapView);
        map.setImageResource(R.drawable.mapfile);

        buttonKill.setOnClickListener(new NewIconClickListener());
        buttonTrail.setOnClickListener(new NewIconClickListener());
        buttonCarcass.setOnClickListener(new NewIconClickListener());
        buttonSpotted.setOnClickListener(new NewIconClickListener());


    }
}