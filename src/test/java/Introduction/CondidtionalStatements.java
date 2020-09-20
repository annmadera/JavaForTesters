package Introduction;

import org.junit.jupiter.api.Test;

public class CondidtionalStatements {
    @Test
    public void ifExample() {
        int number = 125;
        if (number > 100) {
            System.out.println("The number " + number + " is greater than 100");
            number++;
        } else {
            System.out.println("The number " + number + " isnt greater than 100");
            number = 100;
        }
        System.out.println("End of test. The number is equal to "+number);

    }

    @Test
    public void ifExample2() {
        int number = 15;
        if (number < 0) {
            System.out.println("The number " + number + " is less than 0");
            number++;
        }
        else if(number >= 0 && number <= 100) {
            System.out.println("The number " + number + " is greater than 0 and isnt greater than 100");
            number = 100;
        }
        else{
            System.out.println("The number " + number + "  is greater than 100");
            number = 200;
        }
        System.out.println("End of test. The number is equal "+number);

    }
    @Test
    public void switchExample(){
        int number=0;

        switch (number){
            case 3:
                System.out.println("The number is equal 0");
                break;
            case 1:
                System.out.println("The number is equal 1");
                break;
            case 2:
                System.out.println("The number is equal 2");
                break;
             default :
                System.out.println("The number isnt correct");

        }

    }

}
