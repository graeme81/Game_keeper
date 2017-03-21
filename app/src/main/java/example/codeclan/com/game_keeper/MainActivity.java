package example.codeclan.com.game_keeper;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by user on 17/03/2017.
 */

public class MainActivity extends AppCompatActivity {
ImageView  map = (ImageView) findViewById(R.id.mapView);

    map.setImageResource(R.drawable.mapfile);

    //in onCreate



    private NewIconClickListener carcassListener = new NewIconClickListener();
    private NewIconClickListener spottedListener = new NewIconClickListener();
    private NewIconClickListener trailListener = new NewIconClickListener();

    private Button buttonKill = (Button) findViewById(R.id.buttonKill);
    private Button buttonTrail = (Button) findViewById(R.id.buttonTrail);
    private Button buttonCarcass = (Button) findViewById(R.id.buttonCarcass);

    buttonKill.setOnClickListener(new NewIconClickListener(););
    buttonTrail.setOnClickListener(new NewIconClickListener(););
    buttonCarcass.setOnClickListener(new NewIconClickListener(););

}
