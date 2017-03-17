package example.codeclan.com.game_keeper;

/**
 * Created by user on 17/03/2017.
 */

public class Spotted extends MapEvent {
    private AnimalType animalType;
    private String description;
    private String icon;

    public Spotted(AnimalType animalType, String description, String icon){
        this.animalType = animalType;
        this.description = description;
        this.icon = icon;                        //hardcode the icons
    }

    public AnimalType getAnimalType(){return this.animalType;};
    public String getDescription(){return this.description;};
    public String getIcon(){return this.icon;};

    public void setAnimalType(AnimalType animalType){this.animalType = animalType;};
    public void setDescription(String description){this.description = description;};
    public void setIcon(String icon){this.icon = icon;};
}

