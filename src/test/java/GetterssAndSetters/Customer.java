package GetterssAndSetters;

public class Customer {
    private String name;
    private String lastName;
    private int age;

    public String getAge() {
        return age+" lat";
    }

    public void setAge(int ageParameter) {
        if (ageParameter < 0) {
            throw new IllegalArgumentException("Age cant be negative number");
        }
        age = ageParameter;
    }

}
