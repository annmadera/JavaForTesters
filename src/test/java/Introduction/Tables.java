package Introduction;

import org.junit.jupiter.api.Test;

public class Tables {
    @Test
    public void example(){
        String[] planets=new String[8];

        planets[0]="Mercury";
        planets[1]="Venus";

        String firstPlanet=planets[0];
       String secondPlanet=planets[1];
    }
    @Test
    public void example2(){
        String[] planets2={"Mercury","Venus"};

        String firstPlanet2=planets2[0];
        String secondPlanet2=planets2[1];
    }
}
