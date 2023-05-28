import java.util.Objects;

public class Person {
    protected final String firstName;
    protected final String secondName;
    protected Integer age;
    protected String adress;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public boolean hasAge() {
        return age == null ? false : true;

    }

    public boolean hasAdress() {
        return adress == null ? false : true;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void happiBirthday() {
        this.age = age + 1;
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSecondName(secondName).setAdress(adress);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,secondName,age);
    }
}
