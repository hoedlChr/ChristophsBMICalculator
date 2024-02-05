import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    BMICalculator myBMI;
    BMICalculator yourBMI;

    String name = "Christoph";
    String nachname = "Hödl";
    int höhe = 176;
    double gewicht = 90.0;
    char gender = 'm';

    String your_name = "Christoph1";
    String your_nachname = "Hödl2";
    int your_höhe = 165;
    double your_gewicht = 70.0;
    char your_gender = 'w';

    @BeforeEach
    void createMyBMI(){
        myBMI = new BMICalculator(
                name,
                nachname,
                höhe,
                gewicht,
                gender);
        yourBMI = new BMICalculator(
                your_name,
                your_nachname,
                your_höhe,
                your_gewicht,
                your_gender);
    }
   @Test
    void testKonstruktor(){
       Assertions.assertEquals(name,myBMI.getFirstname());
       Assertions.assertEquals(nachname,myBMI.getLastname());
       Assertions.assertEquals(höhe,myBMI.getBodyHeight());
       Assertions.assertEquals(gewicht,myBMI.getBodyWeight());
       Assertions.assertEquals(gender,myBMI.getGender());

       Assertions.assertEquals(your_name,yourBMI.getFirstname());
       Assertions.assertEquals(your_nachname,yourBMI.getLastname());
       Assertions.assertEquals(your_höhe,yourBMI.getBodyHeight());
       Assertions.assertEquals(your_gewicht,yourBMI.getBodyWeight());
       Assertions.assertEquals(your_gender,yourBMI.getGender());
    }

    @Test
    void testCalculateBMI(){
        Assertions.assertEquals(29.05, myBMI.calculateBMI());
        Assertions.assertEquals(25.71,yourBMI.calculateBMI());
    }

    @Test
    void testCalculateBMICategory(){
        Assertions.assertEquals(1, myBMI.calculateBMICategory());
        Assertions.assertEquals(1,yourBMI.calculateBMICategory());
    }

    @Test
    void testgetBMICategoryName(){
        Assertions.assertEquals("Übergewicht", myBMI.getBMICategoryName());
        Assertions.assertEquals("Übergewicht",yourBMI.getBMICategoryName());
    }
}