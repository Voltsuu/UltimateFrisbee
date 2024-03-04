public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String toString(){
        return "Name: " + getLastName() + " " + getFirstName();
    }
    public int throwDisc(int pow){
        return 2*pow;
    }
}
