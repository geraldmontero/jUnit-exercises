import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {

    @Test
    public void verifyId(){
    Student gerry = new Student(32,"gerald");


   assertNotNull(gerry);
assertTrue(gerry.id > 0);

    }


}
