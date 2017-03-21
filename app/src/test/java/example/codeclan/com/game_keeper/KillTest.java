package example.codeclan.com.game_keeper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 19/03/2017.
 */
public class KillTest {

    Kill kill;
    String description;
    String icon;
    String species;
    String size;
    String shotType;
    String health;

    @Before
    public void Before() {
        description = "Things n Stuff";
        icon = "kill icon";
        species = "Roe";
        size = "Big";
        shotType = "Neck";
        health = "Healthy";
        kill = new Kill(AnimalType.DEER, description, icon, species, size, shotType, health);
    }

    @Test
    public void getAnimalType() throws Exception {
        assertEquals(AnimalType.DEER, kill.getAnimalType());
    }

    @Test
    public void getDescription() throws Exception {
        assertEquals("Things n Stuff", kill.getDescription());
    }

    @Test
    public void getIcon() throws Exception {
        assertEquals("carcas icon", kill.getIcon());
    }

    @Test
    public void getSpecies() throws Exception {
        assertEquals("Roe", kill.getSpecies());
    }

    @Test
    public void getSize() throws Exception {
        assertEquals("Big", kill.getSize());
    }

    @Test
    public void getShotType() throws Exception {
        assertEquals("Neck", kill.getShotType());
    }

    @Test
    public void getHealth() throws Exception {
        assertEquals("Healthy", kill.getHealth());
    }

    @Test
    public void setAnimalType() throws Exception {
        kill.setAnimalType(AnimalType.RABBIT);
        assertEquals(AnimalType.RABBIT, kill.getAnimalType());
    }

    @Test
    public void setDescription() throws Exception {
        kill.setDescription("Stuff n Tings");
        assertEquals("Stuff n Tings", kill.getDescription());
    }

    @Test
    public void setIcon() throws Exception {
        kill.setIcon("different icon");
        assertEquals("different icon", kill.getIcon());
    }

    @Test
    public void setSpecies() throws Exception {
        kill.setSpecies("mixi Rabbit");
        assertEquals("mixi Rabbit", kill.getSpecies());
    }

    @Test
    public void setSize() throws Exception {
        kill.setSize("Small");
        assertEquals("Small", kill.getSize());
    }

    @Test
    public void setShotType() throws Exception {
        kill.setShotType("Head");
        assertEquals("Head", kill.getShotType());
    }

    @Test
    public void setHealth() throws Exception {
        kill.setHealth("Diseased");
        assertEquals("Diseased", kill.getHealth());
    }

}