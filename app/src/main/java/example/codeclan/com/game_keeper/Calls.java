package example.codeclan.com.game_keeper;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by user on 21/03/2017.
 */

public class Calls extends AppCompatActivity {
    Button btnDeer;
    Button btnPig;
    Button btnRabbit;
    Button btnElk;
    Button btnDuck;
    Intent intent;
//    Context context;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calls);

        btnDeer = (Button)findViewById(R.id.deerCall);
        btnPig = (Button)findViewById(R.id.pigCall);
        btnRabbit = (Button)findViewById(R.id.rabbitCall);
        btnElk = (Button)findViewById(R.id.elkCall);
        btnDuck = (Button)findViewById(R.id.duckCall);

        btnDeer.setText("Deer Call");
        btnPig.setText("Pig Call");
        btnRabbit.setText("Rabbit Call");
        btnElk.setText("Elk Call");
        btnDuck.setText("Duck Call");
    }



    public void onDeerCallClick(View view){
        Toast.makeText(this, "Deer", Toast.LENGTH_SHORT).show();
    }
    public void onPigCallClick(View view){
        Toast.makeText(this, "Pig", Toast.LENGTH_SHORT).show();
    }

    public void onRabbitCallClick(View view){
        MediaPlayer mPlayer = MediaPlayer.create(Calls.this, R.raw.rabbit);
        mPlayer.start();
    }

    public void onElkCallClick(View view){
        Toast.makeText(this, "Elk", Toast.LENGTH_SHORT).show();
    }
    public void onDuckCallClick(View view){
        Toast.makeText(this, "Duck", Toast.LENGTH_SHORT).show();
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

            //Toast.makeText(this, "doint", Toast.LENGTH_SHORT).show();

        }else if (item.getItemId()== R.id.action_calendar){

            intent = new Intent(this, Calendar.class);
            startActivity(intent);

            // Toast.makeText(this, "burnt toast", Toast.LENGTH_SHORT).show();

        } else if (item.getItemId() == R.id.action_reset) {

            // Log.d("this", this);

            Toast.makeText(this, "jammy toast", Toast.LENGTH_SHORT).show();

        }

        return super.onOptionsItemSelected(item);
    }
}