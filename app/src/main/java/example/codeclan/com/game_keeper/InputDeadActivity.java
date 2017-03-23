package example.codeclan.com.game_keeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class InputDeadActivity extends AppCompatActivity {

    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_dead);
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
            EditText animal = (EditText) findViewById(R.id.deadAnimalText);
            EditText species = (EditText) findViewById(R.id.deadSpeciesText);
            EditText shotType = (EditText) findViewById(R.id.shotTypeText);
            EditText health = (EditText) findViewById(R.id.healthText);
            EditText size = (EditText) findViewById(R.id.sizeText);
            EditText description = (EditText) findViewById(R.id.deadDescriptionText);


            String animalString = animal.getText().toString();
            String speciesString = species.getText().toString();
            String shotTypeString = shotType.getText().toString();
            String healthString = health.getText().toString();
            String sizeString = size.getText().toString();
            String descriptionString = description.getText().toString();



            createEvent(animalString, speciesString, shotTypeString, healthString, sizeString, descriptionString, type);
        }

        public void createEvent(String animal, String species, String shotType, String health, String size, String description, String type) {
            Intent toMap = new Intent(this, MainActivity.class);

            switch (type) {
                case "kill":
                    Kill kill = new Kill(animal, description, species, size, shotType, health);
<<<<<<< HEAD
                    toMap.putExtra("MAPICON", kill);

=======
>>>>>>> 02d2b223c3772ef82611a9ce7da265f4dc4f4d6d
                    break;

                case "carcass":
                    Carcass carcass = new Carcass(animal, description, species, size, shotType, health);
<<<<<<< HEAD
                    toMap.putExtra("MAPICON", carcass);

=======
>>>>>>> 02d2b223c3772ef82611a9ce7da265f4dc4f4d6d
                    break;
            }

            this.startActivity(toMap);
<<<<<<< HEAD

=======
>>>>>>> 02d2b223c3772ef82611a9ce7da265f4dc4f4d6d
        }
}
