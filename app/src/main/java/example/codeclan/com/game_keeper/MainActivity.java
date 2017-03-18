package example.codeclan.com.game_keeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by user on 17/03/2017.
 */

public class MainActivity extends AppCompatActivity {
    ZoomImage zoomedImage;
    ImageView map;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zoomedImage = (ZoomImage) findViewById(R.id.mapView);
        map = (ImageView) findViewById(R.id.mapView);
        map.setImageResource(R.drawable.mapfile);



    }
}