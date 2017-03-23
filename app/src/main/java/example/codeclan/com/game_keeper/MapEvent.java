package example.codeclan.com.game_keeper;


import java.io.Serializable;


/**
 * Created by user on 17/03/2017.
 */


public abstract class MapEvent implements Serializable{


    private AnimalType animal;
    private String description;
    private String icon;

}
