import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
    // Create a test method that uses assertEquals or assertNotEquals to verify if the String Codeup is the same as CodeUp.

    @Test
    public void TestString(){
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);


    }


    //    Create a test method that uses assertNotSame to verify that the following ArrayLists are not the same:
        @Test
            public void arrayNotSame(){

            List<String> languages = new ArrayList<>();
            List<String> moreLanguages = new ArrayList<>();
            assertNotSame(languages,moreLanguages);


        }




    //
    //Create a test method that uses assertArrayEquals to verify the following arrays are equal.
    //
    @Test
    public void testArrays(){

        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);


    }

//Create a test method that uses both assertFalse and assertTrue to verify the following statements:
//

    @Test
    public void verifyStatement(){
String language = "PjP";
//language.contains("H"); // use assertTrue for this statement
//language.contains("J"); // use assertFalse for this statement


      assertTrue(String.valueOf(language.contains("H")),true);
      assertFalse(String.valueOf(language.contains("J")),false);
    }



}
