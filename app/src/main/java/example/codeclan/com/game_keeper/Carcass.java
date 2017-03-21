package example.codeclan.com.game_keeper;

/**
 * Created by user on 17/03/2017.
 */

public class Carcass extends MapEvent {
    private String animalType;
    private String description;
    private String species;
    private String size;
    private String shotType;
    private String health;

    public Carcass(String animalType, String description, String species, String size, String shotType, String health){
        this.animalType = animalType;
        this.description = description;         //hardcode the icons
        this.species = species;
        this.size = size;
        this.shotType = shotType;
        this.health = health;

    }

    public String getAnimalType(){return this.animalType;};
    public String getDescription(){return this.description;};
    public String getSpecies(){return this.species;};
    public String getSize(){return this.size;};
    public String getShotType(){return this.shotType;};
    public String getHealth(){return this.health;};

    public void setAnimalType(String animalType){this.animalType = animalType;};
    public void setDescription(String description){this.description = description;};
    public void setSpecies(String species){ this.species = species;};
    public void setSize(String size){ this.size = size;};
    public void setShotType(String shotType){ this.shotType= shotType;};
    public void setHealth(String health){ this.health = health;};
}
