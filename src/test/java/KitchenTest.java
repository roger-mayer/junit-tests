import org.junit.Test;
import static org.junit.Assert.*;

public class KitchenTest {

    //test if initial value is empty
    @Test
    public void testIfEmpty() {
        Kitchen rogersKitchen = new Kitchen();
        assertTrue(rogersKitchen.isEmpty());
    }
    //test if add works
    @Test
    public void testIfAddWorks(){
    Kitchen rileysKitchen = new Kitchen();
    assertEquals(0,rileysKitchen.size());
    rileysKitchen.add("blue corn");
    assertEquals(1,rileysKitchen.size());
    rileysKitchen.add("yellow corn");
    assertEquals(2,rileysKitchen.size());
    }
    //test if contains works
    @Test
    public void testIfContainsWorks(){
        Kitchen rogersKitchen = new Kitchen();
        rogersKitchen.add("white corn");
        rogersKitchen.add("yellow corn");
        rogersKitchen.add("blue corn");
        assertTrue(rogersKitchen.contains("white corn"));
        assertTrue(rogersKitchen.contains("yellow corn"));
        assertTrue(rogersKitchen.contains("blue corn"));

    }




}
