package TypeReference;

import ClassObjectField.PlanetarySystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypesTests {
    @Test
    public void dosIntValueChangeValueTest(){
        int firstInt=5;
        int secondInt=firstInt;
        firstInt=6;
        Assertions.assertEquals(5,secondInt);
    }

    @Test
    public void doesObjectChangeValueTest(){
        PlanetarySystem firstSystem=new PlanetarySystem();
        PlanetarySystem secondSystem=firstSystem;
        firstSystem.setNumberOfPlanets(4);

        System.out.println(secondSystem);
        System.out.println(secondSystem.getNumberOfPlanets());
       Assertions.assertEquals(4,secondSystem.getNumberOfPlanets());
        Assertions.assertEquals(firstSystem.getNumberOfPlanets(),secondSystem.getNumberOfPlanets());
    }

    @Test
    public void doesObjectChangeValueTest2(){
        String firsttext="pierwszy";
        String secondtext=firsttext;
        firsttext="zmieniony";
        System.out.println(firsttext);
        System.out.println(secondtext);
    }
}
