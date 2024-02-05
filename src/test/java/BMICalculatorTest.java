import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    BMICalculator myBMI;

    String name = "Christoph";
    String nachname = "Hödl";
    int höhe = 176;
    double gewicht = 90.0;
    char gender = 'm';

    @BeforeEach
    void createMyBMI(){
        myBMI = new BMICalculator(
                name,
                nachname,
                höhe,
                gewicht,
                gender);
    }
   @Test
    void testKonstruktor(){
       Assertions.assertEquals(name,myBMI.getFirstname());
       Assertions.assertEquals(nachname,myBMI.getLastname());
       Assertions.assertEquals(höhe,myBMI.getBodyHeight());
       Assertions.assertEquals(gewicht,myBMI.getBodyWeight());
       Assertions.assertEquals(gender,myBMI.getGender());
    }
}