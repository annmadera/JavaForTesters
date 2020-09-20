package Introduction;

import org.junit.jupiter.api.Test;

public class ForEachLoop {
    @Test
    public void example(){
       int counter = calculateFactorial(6);
       String text="Value of factorial is equal "+counter;
       System.out.println(text);

    }

    int calculateFactorial(int n){
        int factorial=1;
        for(int i=2;i<=n;i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    @Test
    public void forEachExample(){
        String[] planets={"Mercury","Venus","Earth"};
        String text="Planets of the solar system include: ";

        for(String planet: planets){
            text=text+"\n"+planet;
        }
        System.out.println(text);
    }
}
