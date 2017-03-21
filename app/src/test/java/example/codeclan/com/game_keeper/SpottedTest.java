package example.codeclan.com.game_keeper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 19/03/2017.
 */
public class SpottedTest {
    Spotted spotted;
    String description;
    String icon;

    @Before
    public void Before(){
        description = "we saw it";
        icon = "spotted icon";
        spotted  = new Spotted(AnimalType.DEER, description, icon);
    }

    @Test
    public void getAnimalType() throws Exception {
        assertEquals(AnimalType.DEER, spotted.getAnimalType());
    }

    @Test
    public void getDescription() throws Exception {
        assertEquals("we saw it", spotted.getDescription());
    }

    @Test
    public void getIcon() throws Exception {
        assertEquals("spotted icon", spotted.getIcon());
    }

    @Test
    public void setAnimalType() throws Exception {
        spotted.setAnimalType(AnimalType.GROUSE);
        assertEquals(AnimalType.GROUSE, spotted.getAnimalType());
    }

    @Test
    public void setDescription() throws Exception {
        spotted.setDescription("we let it get away");
        assertEquals("we let it get away", spotted.getDescription());
    }

    @Test
    public void setIcon() throws Exception {
        spotted.setIcon("different icon");
        assertEquals("different icon", spotted.getIcon());
    }

}