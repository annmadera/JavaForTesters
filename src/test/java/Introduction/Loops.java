package Introduction;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class Loops {
    @Test
    public void example(){
       int number;
       int factorial= calculateFactorial(6);
       String text="Value of factorial is equal "+factorial;
       System.out.println(text);
       isItMyNumber(2);
        istItMyNumber2(3);

    }

    int calculateFactorial(int n) {
        int factoral = 1;
        switch (n) {
            case 0:
                factoral = 1;
                break;
            case 1:
                factoral = 1;
                break;
            default: {
                while (n > 1) {
                    factoral *= n;
                    n--;
                }
            }
        }

        return factoral;
    }

    private void isItMyNumber(int number){

        Random generator= new Random();
        int a=generator.nextInt(5);
        int counter=0;
        while(a!=number){
            System.out.println("Its not my number. It is the number " +a);
            a=generator.nextInt(5);
            counter++;
        }
        System.out.println(a+" It is my number. The loop is completed  "+counter+" times.");
    }

    private void istItMyNumber2(int number){

        Random generator= new Random();
        int a=generator.nextInt(5);
        int counter=0;
        do{
            System.out.println("Its not my number. It is the number " +a);
            counter++;
            a=generator.nextInt(5);
        }
        while(a!=number);

        System.out.println(a+" It is my number. The loop is completed  "+counter+" times.");
    }
}
