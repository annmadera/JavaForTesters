package GetterssAndSetters;

import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void gettersAndSettersTest(){
        Customer customer= new Customer();
        customer.setAge(15);
        System.out.println(customer.getAge());

    }
}
