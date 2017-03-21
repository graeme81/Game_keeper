package example.codeclan.com.game_keeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class InputLiveActivity extends AppCompatActivity {

    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_live);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Intent inputIntent = getIntent();
        type = inputIntent.getStringExtra("ICON");


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                getInputs();
            }
        });
    }

    private void getInputs(){
        EditText animal = (EditText) findViewById(R.id.liveAnimalText);
        EditText description = (EditText) findViewById(R.id.liveDescriptionText);


        String animalString = animal.getText().toString();
        String descriptionString = description.getText().toString();



        createEvent(animalString, descriptionString, type);
    }

    public void createEvent(String animal, String description, String type) {
        Intent toMap = new Intent(this, MainActivity.class);

        switch (type) {
            case "spotted":
                Spotted spotted = new Spotted(animal, description);
                break;

            case "trail":
                Trail trial = new Trail(animal, description);
                break;
        }

        this.startActivity(toMap);
    }

}
