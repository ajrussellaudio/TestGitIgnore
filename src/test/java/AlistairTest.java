import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AlistairTest {
    private Alistair alistair;

    @Before
    public void setUp() throws Exception {
        alistair = new Alistair(26, "Java");
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
