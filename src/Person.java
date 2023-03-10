public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public void setFirstName(String x){
        this.firstName = x;
    }
    public void setLastName(String y) {
        this.lastName = y;
    }
    public void setAge(int z) {
        this.age = z;
    }

    public String toString(){
        return firstName + " " + lastName + ", " + age + "years old";
    }
}
