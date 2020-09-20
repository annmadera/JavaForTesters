package ClassObjectField;

public class PlanetarySystem {
    private String starName="Sun1";
    private String starType="yellow dwarf1";
    private int numberOfPlanets=81;

    public PlanetarySystem(String starName, String starType, int numberOfPlanets) {
        this.starName=starName;
        this.starType=starType;
        this.numberOfPlanets=numberOfPlanets;

        System.out.println("star name "+starName+" star type " +starType+" number of planets " +numberOfPlanets);
    }

    public PlanetarySystem() {

    }

    public String getStarName(){
        return starName;
    }
    public void setNumberOfPlanets (int number){
        numberOfPlanets=number;
    }
    public int getNumberOfPlanets(){
        return numberOfPlanets;
    }
    public void printNumberOfPlanets(){
        System.out.println("number of planets "+ numberOfPlanets);
    }

    public void printStarName(){
        System.out.println("star name "+ starName);
    }

    public void printstarType(){
        System.out.println("star type "+ starType);
        }
}
