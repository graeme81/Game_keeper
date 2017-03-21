package example.codeclan.com.game_keeper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 19/03/2017.
 */
public class CarcassTest {
    Carcass carcass;
    String description;
    String icon;
    String species;
    String size;
    String shotType;
    String health;

    @Before
    public void before(){
        description = "Things n Stuff";
        icon ="carcass icon";
        species = "Roe";
        size = "Big";
        shotType = "Neck";
        health = "Healthy";
        carcass = new Carcass(AnimalType.DEER, description, icon, species, size, shotType, health);

    }

    @Test
    public void getAnimalType() throws Exception {
        assertEquals(AnimalType.DEER, carcass.getAnimalType());
    }

    @Test
    public void getDescription() throws Exception {
        assertEquals("Things n Stuff", carcass.getDescription());
    }

    @Test
    public void getIcon() throws Exception {
        assertEquals("carcass icon", carcass.getIcon());
    }

    @Test
    public void getSpecies() throws Exception {
        assertEquals("Roe", carcass.getSpecies());
    }

    @Test
    public void getSize() throws Exception {
        assertEquals("Big", carcass.getSize());
    }

    @Test
    public void getShotType() throws Exception {
        assertEquals("Neck", carcass.getShotType());
    }

    @Test
    public void getHealth() throws Exception {
        assertEquals("Healthy", carcass.getHealth());
    }

    @Test
    public void setAnimalType() throws Exception {
        carcass.setAnimalType(AnimalType.RABBIT);
        assertEquals(AnimalType.RABBIT, carcass.getAnimalType());
    }

    @Test
    public void setDescription() throws Exception {
        carcass.setDescription("Stuff n Tings");
        assertEquals("Stuff n Tings", carcass.getDescription());
    }

    @Test
    public void setIcon() throws Exception {
        carcass.setIcon("different icon");
        assertEquals("different icon", carcass.getIcon());
    }

    @Test
    public void setSpecies() throws Exception {
        carcass.setSpecies("mixi Rabbit");
        assertEquals("mixi Rabbit", carcass.getSpecies());
    }

    @Test
    public void setSize() throws Exception {
        carcass.setSize("Small");
        assertEquals("Small", carcass.getSize());
    }

    @Test
    public void setShotType() throws Exception {
        carcass.setShotType("Head");
        assertEquals("Head", carcass.getShotType());
    }

    @Test
    public void setHealth() throws Exception {
        carcass.setHealth("Diseased");
        assertEquals("Diseased", carcass.getHealth());
    }

}