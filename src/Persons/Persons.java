package Persons;

public class Persons {
    private Integer age;
    private String firstName;
    private String secondName;

    public Persons(Integer age, String firstName, String secondName){
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name of person: " + firstName
                + ", surname of person: " + secondName + ", age: " + age;
    }
}
