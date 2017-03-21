package example.codeclan.com.game_keeper;

/**
 * Created by user on 17/03/2017.
 */

public class Spotted extends MapEvent {
    private String animalType;
    private String description;

    public Spotted(String animalType, String description){
        this.animalType = animalType;
        this.description = description;
    }

    public String getAnimalType(){return this.animalType;};
    public String getDescription(){return this.description;};

    public void setAnimalType(String animalType){this.animalType = animalType;};
    public void setDescription(String description){this.description = description;};
}

