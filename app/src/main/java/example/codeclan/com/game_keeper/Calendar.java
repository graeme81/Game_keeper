package example.codeclan.com.game_keeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.Toast;
import android.widget.CalendarView.OnDateChangeListener;


/**
 * Created by user on 21/03/2017.
 */

public class Calendar extends AppCompatActivity{

    Intent intent;
    CalendarView calendar;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        calendar = (CalendarView)findViewById(R.id.calendar1);

        initializeCalendar();
    }

    public void initializeCalendar(){


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main,menu);

        return true;
    }

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

}