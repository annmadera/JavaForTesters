package Introduction;

import org.junit.jupiter.api.Test;

public class RelationalAndLogicalOperations {
    @Test
    public void example() {
        int firstVariable = 2;
        int secondVariable = 4;
        int thirdVariable = 2;

        boolean condition = firstVariable == secondVariable;

        boolean trueCon = true;
        boolean falseCon = false;

        boolean condition2 = !trueCon;
        boolean condition3 = trueCon && trueCon;
        boolean condition4 = falseCon || trueCon;
    }
}


