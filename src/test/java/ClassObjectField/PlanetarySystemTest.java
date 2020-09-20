package ClassObjectField;

import org.junit.jupiter.api.Test;

public class PlanetarySystemTest {
    @Test
    public void firstTest(){
        PlanetarySystem solarSystem=new PlanetarySystem();
        //System.out.println("Star name is "+ solarSystem.getStarName());
        System.out.println("number of planets "+solarSystem.getNumberOfPlanets());
        solarSystem.setNumberOfPlanets(7);
        System.out.println("number of planets "+solarSystem.getNumberOfPlanets());
    }

    @Test
    public void secondTest(){
        PlanetarySystem solarSystem=new PlanetarySystem();
        solarSystem.printNumberOfPlanets();
        solarSystem.setNumberOfPlanets(7);
        solarSystem.printNumberOfPlanets();

        PlanetarySystem anotherSystem= new PlanetarySystem();
        anotherSystem.printNumberOfPlanets();
    }
    @Test
    public void thirdTest(){
        PlanetarySystem planetarySystem=new PlanetarySystem();
        PlanetarySystem solarSystem=new PlanetarySystem( "sun" ,"yellow dwarf", 8);

        //solarSystem.printStarName();
        //solarSystem.printstarType();
        //solarSystem.printNumberOfPlanets();

        //planetarySystem.printStarName();
        //planetarySystem.printstarType();
        //planetarySystem.printNumberOfPlanets();

        PlanetarySystem keplerSystem=new PlanetarySystem("kepler -444", "K dwarf",5);
        //keplerSystem.printStarName();
        //keplerSystem.printstarType();
        //keplerSystem.printNumberOfPlanets();


    }
}