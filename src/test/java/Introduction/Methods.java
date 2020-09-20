package Introduction;

import org.junit.jupiter.api.Test;

public class Methods {
    @Test
    public void example() {
        double fieldOfTheFirstTrapezoid = countFieldofTheTrapezoid(8, 10, 5);
        String text = "Fields of the trapezoid " + fieldOfTheFirstTrapezoid + ".";
        enterText();
        enterText2("End of test");
       boolean number1=czyWieksza(101);
       boolean number2=czyWieksza(15);

    }

    double countFieldofTheTrapezoid(double firstBase, double secondBase, double height) {
        double fieldOfTheTrapezoid = ((firstBase + secondBase) * height) / 2;
        return fieldOfTheTrapezoid;
    }

    boolean czyWieksza(int number){
        return number>100;
    }


    void enterText() {
        System.out.println("End of test.");
    }

    void enterText2(String text) {
        System.out.println(text);
    }
}