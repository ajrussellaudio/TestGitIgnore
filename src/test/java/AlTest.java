import models.Al;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AlTest {
    private Al alistair;

    @Before
    public void setUp() throws Exception {
        alistair = new Al("Big Daddy Kane", 26, "Java");
    }

    @Test
    public void isValidObject() {
        assertNotNull(alistair);
    }

    @Test
    public void hasAge() {
        assertEquals(26, alistair.getAge());
    }

    @Test
    public void hasName() {
        assertEquals("Big Daddy Kane", alistair.getName());
    }

    @Test
    public void hasFavLanguage(){
        assertEquals("Java", alistair.getFavouriteLanguage());
    }
}
