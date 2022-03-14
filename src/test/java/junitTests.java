import org.junit.Test;
import static org.junit.Assert.*;

public class junitTests {

    @Test
    public void testIfNameIsKenneth() {
        String expected = "Kenneth";
        String actual = "Kenneth";

        assertEquals(expected, actual);
    }

    @Test
    public void TestIfChange(){
        Double price = 10.1;
        Double discount = 4.5;

        assertEquals(5.1,price-discount,.5);
        assertNotEquals(4.2,price-discount,.5);

    }



}