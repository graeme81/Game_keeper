package example.codeclan.com.game_keeper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 19/03/2017.
 */
public class TrailTest {

    Trail trail;
    String description;
    String icon;

    @Before
    public void Before(){
        description = "we saw a trail";
        icon = "trail icon";
        trail  = new Trail(AnimalType.DEER, description, icon);
    }

    @Test
    public void getAnimalType() throws Exception {
        assertEquals(AnimalType.DEER, trail.getAnimalType());
    }

    @Test
    public void getDescription() throws Exception {
        assertEquals("we saw a trail", trail.getDescription());
    }

    @Test
    public void getIcon() throws Exception {
        assertEquals("trail icon", trail.getIcon());
    }

    @Test
    public void setAnimalType() throws Exception {
        trail.setAnimalType(AnimalType.GROUSE);
        assertEquals(AnimalType.GROUSE, trail.getAnimalType());
    }

    @Test
    public void setDescription() throws Exception {
        trail.setDescription("There is something here");
        assertEquals("There is something here", trail.getDescription());
    }

    @Test
    public void setIcon() throws Exception {
        trail.setIcon("different icon");
        assertEquals("different icon", trail.getIcon());
    }

}